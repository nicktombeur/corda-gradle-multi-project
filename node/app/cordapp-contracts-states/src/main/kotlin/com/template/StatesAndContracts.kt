package com.template

import net.corda.core.contracts.*
import net.corda.core.identity.AbstractParty
import net.corda.core.identity.Party
import net.corda.core.transactions.LedgerTransaction

// *****************
// * Contract Code *
// *****************
class IOUContract : Contract {
    // This is used to identify our contract when building a transaction
    companion object {
        const val ID = "com.template.IOUContract"
    }

    class Create : CommandData

    // A transaction is considered valid if the verify() function of the contract of each of the transaction's input
    // and output states does not throw an exception.
    override fun verify(tx: LedgerTransaction) {
        val command = tx.commands.requireSingleCommand<Create>()

        requireThat {
            "No inputs should be consumed when issuing an IO." using(tx.inputs.isEmpty())
            "There should be one output state of type IOUState." using(tx.outputs.size == 1)

            val out = tx.outputsOfType<IOUState>().single()
            "The IOU's value must be non-negative." using(out.value > 0)
            "The lender and the borrower cannot be the same entity." using(out.lender != out.borrower)

            "There must be two signers." using(command.signers.toSet().size == 2)
            "The borrower and lender must be signers." using(command.signers.containsAll(listOf(out.borrower.owningKey, out.lender.owningKey)))
        }
    }
}

// *********
// * State *
// *********
data class IOUState(val value: Int,
                    val lender: Party,
                    val borrower: Party) : ContractState {
    override val participants get() = listOf(lender, borrower)
}