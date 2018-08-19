# corda-gradle-multi-project
Example of not working corda application in gradle multi project structure

```
./gradlew clean deployNodes --stacktrace --debug
```

```
14:20:36.951 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :app:deployNodes FAILED
14:20:36.951 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :app:deployNodes' started
14:20:36.951 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':app:deployNodes'
14:20:36.951 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':app:deployNodes' into context took 0.0 secs.
14:20:36.951 [DEBUG] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Determining if task ':app:deployNodes' is up-to-date
14:20:36.951 [INFO] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Task ':app:deployNodes' is not up-to-date because:
  Task has not declared any outputs despite executing actions.
14:20:36.951 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter] Executing actions for task ':app:deployNodes'.
14:20:36.952 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute build for :app:deployNodes' started
14:20:36.952 [INFO] [org.gradle.api.Project] Running Cordform task
14:20:36.962 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected matches [configuration ':app:cordapp:runtimeElements'] from candidates [configuration ':app:cordapp:runtimeElements', configuration ':app:cordapp:runtimeElements' variant classes, configuration ':app:cordapp:runtimeElements' variant resources] for {}
14:20:36.962 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected matches [configuration ':app:cordapp-contracts-states:runtimeElements'] from candidates [configuration ':app:cordapp-contracts-states:runtimeElements', configuration ':app:cordapp-contracts-states:runtimeElements' variant classes, configuration ':app:cordapp-contracts-states:runtimeElements' variant resources] for {}
14:20:36.962 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.corda:corda-finance:3.2-corda configuration default from candidates [net.corda:corda-finance:3.2-corda configuration default] for {}
14:20:36.963 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.corda:corda-webserver-impl:3.2-corda configuration default from candidates [net.corda:corda-webserver-impl:3.2-corda configuration default] for {}
14:20:36.963 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.corda:corda-jackson:3.2-corda configuration default from candidates [net.corda:corda-jackson:3.2-corda configuration default] for {}
14:20:36.963 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.corda:corda-jackson:3.2-corda configuration runtime from candidates [net.corda:corda-jackson:3.2-corda configuration runtime] for {}
14:20:36.963 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.corda:corda-rpc:3.2-corda configuration default from candidates [net.corda:corda-rpc:3.2-corda configuration default] for {}
14:20:36.963 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.corda:corda-rpc:3.2-corda configuration runtime from candidates [net.corda:corda-rpc:3.2-corda configuration runtime] for {}
14:20:36.963 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.corda:corda-node-api:3.2-corda configuration default from candidates [net.corda:corda-node-api:3.2-corda configuration default] for {}
14:20:36.963 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.corda:corda-node-api:3.2-corda configuration runtime from candidates [net.corda:corda-node-api:3.2-corda configuration runtime] for {}
14:20:36.963 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.corda:corda-confidential-identities:3.2-corda configuration runtime from candidates [net.corda:corda-confidential-identities:3.2-corda configuration runtime] for {}
14:20:36.963 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.corda:corda-core:3.2-corda configuration default from candidates [net.corda:corda-core:3.2-corda configuration default] for {}
14:20:36.963 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.corda:corda-core:3.2-corda configuration runtime from candidates [net.corda:corda-core:3.2-corda configuration runtime] for {}
14:20:36.963 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.jetbrains.kotlin:kotlin-stdlib-jre8:1.1.60 configuration default from candidates [org.jetbrains.kotlin:kotlin-stdlib-jre8:1.1.60 configuration default] for {}
14:20:36.963 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.jetbrains.kotlin:kotlin-stdlib-jre8:1.1.60 configuration runtime from candidates [org.jetbrains.kotlin:kotlin-stdlib-jre8:1.1.60 configuration runtime] for {}
14:20:36.963 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.corda:corda:3.2-corda configuration default from candidates [net.corda:corda:3.2-corda configuration default] for {}
14:20:36.964 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.corda:corda-webserver:3.2-corda configuration default from candidates [net.corda:corda-webserver:3.2-corda configuration default] for {}
14:20:36.964 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.jolokia:jolokia-jvm:1.3.7 from candidates [org.jolokia:jolokia-jvm:1.3.7] for {}
14:20:36.964 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.jolokia:jolokia-jvm:1.3.7 from candidates [org.jolokia:jolokia-jvm:1.3.7] for {}
14:20:36.964 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.jolokia:jolokia-jvm:1.3.7 from candidates [org.jolokia:jolokia-jvm:1.3.7] for {}
14:20:36.964 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match co.paralleluniverse:quasar-core:0.7.9 from candidates [co.paralleluniverse:quasar-core:0.7.9] for {}
14:20:36.964 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match co.paralleluniverse:quasar-core:0.7.9 from candidates [co.paralleluniverse:quasar-core:0.7.9] for {}
14:20:36.964 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match co.paralleluniverse:quasar-core:0.7.9 from candidates [co.paralleluniverse:quasar-core:0.7.9] for {}
14:20:36.964 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match co.paralleluniverse:quasar-core:0.7.9 from candidates [co.paralleluniverse:quasar-core:0.7.9] for {}
14:20:36.964 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match co.paralleluniverse:quasar-core:0.7.9 from candidates [co.paralleluniverse:quasar-core:0.7.9] for {}
14:20:36.964 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match co.paralleluniverse:quasar-core:0.7.9 from candidates [co.paralleluniverse:quasar-core:0.7.9] for {}
14:20:36.964 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match co.paralleluniverse:quasar-core:0.7.9 from candidates [co.paralleluniverse:quasar-core:0.7.9] for {}
14:20:36.964 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match co.paralleluniverse:quasar-core:0.7.9 from candidates [co.paralleluniverse:quasar-core:0.7.9] for {}
14:20:36.964 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match co.paralleluniverse:quasar-core:0.7.9 from candidates [co.paralleluniverse:quasar-core:0.7.9] for {}
14:20:36.964 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match co.paralleluniverse:quasar-core:0.7.9 from candidates [co.paralleluniverse:quasar-core:0.7.9] for {}
14:20:36.965 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.jetbrains.kotlin:kotlin-stdlib-jre7:1.1.60 configuration runtime from candidates [org.jetbrains.kotlin:kotlin-stdlib-jre7:1.1.60 configuration runtime] for {}
14:20:36.965 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.module:jackson-module-kotlin:2.9.2 configuration runtime from candidates [com.fasterxml.jackson.module:jackson-module-kotlin:2.9.2 configuration runtime] for {}
14:20:36.965 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.jetbrains.kotlin:kotlin-reflect:1.1.60 configuration runtime from candidates [org.jetbrains.kotlin:kotlin-reflect:1.1.60 configuration runtime] for {}
14:20:36.965 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.jetbrains.kotlinx:kotlinx-html-jvm:0.6.3 configuration runtime from candidates [org.jetbrains.kotlinx:kotlinx-html-jvm:0.6.3 configuration runtime] for {}
14:20:36.965 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.jetbrains.kotlin:kotlin-stdlib:1.1.60 configuration runtime from candidates [org.jetbrains.kotlin:kotlin-stdlib:1.1.60 configuration runtime] for {}
14:20:36.965 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.corda.plugins:cordform-common:3.1.0 configuration runtime from candidates [net.corda.plugins:cordform-common:3.1.0 configuration runtime] for {}
14:20:36.965 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.google.code.findbugs:jsr305:3.0.2 configuration runtime from candidates [com.google.code.findbugs:jsr305:3.0.2 configuration runtime] for {}
14:20:36.965 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.logging.log4j:log4j-slf4j-impl:2.9.1 configuration runtime from candidates [org.apache.logging.log4j:log4j-slf4j-impl:2.9.1 configuration runtime] for {}
14:20:36.965 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.logging.log4j:log4j-core:2.9.1 configuration runtime from candidates [org.apache.logging.log4j:log4j-core:2.9.1 configuration runtime] for {}
14:20:36.965 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.slf4j:jcl-over-slf4j:1.7.25 configuration runtime from candidates [org.slf4j:jcl-over-slf4j:1.7.25 configuration runtime] for {}
14:20:36.965 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.slf4j:slf4j-api:1.7.25 configuration runtime from candidates [org.slf4j:slf4j-api:1.7.25 configuration runtime] for {}
14:20:36.965 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.reactivex:rxjava:1.2.4 configuration runtime from candidates [io.reactivex:rxjava:1.2.4 configuration runtime] for {}
14:20:36.965 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.commons:commons-jexl3:3.0 configuration runtime from candidates [org.apache.commons:commons-jexl3:3.0 configuration runtime] for {}
14:20:36.965 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.9.2 configuration runtime from candidates [com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.9.2 configuration runtime] for {}
14:20:36.966 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.glassfish.jersey.media:jersey-media-json-jackson:2.25 configuration runtime from candidates [org.glassfish.jersey.media:jersey-media-json-jackson:2.25 configuration runtime] for {}
14:20:36.966 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider:2.8.4 configuration runtime from candidates [com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider:2.8.4 configuration runtime] for {}
14:20:36.966 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.jaxrs:jackson-jaxrs-base:2.8.4 configuration runtime from candidates [com.fasterxml.jackson.jaxrs:jackson-jaxrs-base:2.8.4 configuration runtime] for {}
14:20:36.966 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.module:jackson-module-jaxb-annotations:2.8.4 configuration runtime from candidates [com.fasterxml.jackson.module:jackson-module-jaxb-annotations:2.8.4 configuration runtime] for {}
14:20:36.966 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-databind:2.9.2 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-databind:2.9.2 configuration runtime] for {}
14:20:36.966 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.i2p.crypto:eddsa:0.2.0 configuration runtime from candidates [net.i2p.crypto:eddsa:0.2.0 configuration runtime] for {}
14:20:36.966 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.bouncycastle:bcpkix-jdk15on:1.57 configuration runtime from candidates [org.bouncycastle:bcpkix-jdk15on:1.57 configuration runtime] for {}
14:20:36.966 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.bouncycastle:bcprov-jdk15on:1.57 configuration runtime from candidates [org.bouncycastle:bcprov-jdk15on:1.57 configuration runtime] for {}
14:20:36.966 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.hibernate:hibernate-core:5.2.6.Final configuration runtime from candidates [org.hibernate:hibernate-core:5.2.6.Final configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.hibernate.javax.persistence:hibernate-jpa-2.1-api:1.0.0.Final configuration runtime from candidates [org.hibernate.javax.persistence:hibernate-jpa-2.1-api:1.0.0.Final configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.typesafe:config:1.3.1 configuration runtime from candidates [com.typesafe:config:1.3.1 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.9.2 configuration runtime from candidates [com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.9.2 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.activemq:artemis-core-client:2.2.0 configuration runtime from candidates [org.apache.activemq:artemis-core-client:2.2.0 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.activemq:artemis-commons:2.2.0 configuration runtime from candidates [org.apache.activemq:artemis-commons:2.2.0 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.google.guava:guava:21.0 configuration runtime from candidates [com.google.guava:guava:21.0 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.commons:commons-collections4:4.1 configuration runtime from candidates [org.apache.commons:commons-collections4:4.1 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match commons-beanutils:commons-beanutils:1.9.3 configuration runtime from candidates [commons-beanutils:commons-beanutils:1.9.3 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match commons-fileupload:commons-fileupload:1.3.3 configuration runtime from candidates [commons-fileupload:commons-fileupload:1.3.3 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match de.javakaffee:kryo-serializers:0.41 configuration runtime from candidates [de.javakaffee:kryo-serializers:0.41 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.esotericsoftware:kryo:4.0.0 configuration runtime from candidates [com.esotericsoftware:kryo:4.0.0 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.qpid:proton-j:0.21.0 configuration runtime from candidates [org.apache.qpid:proton-j:0.21.0 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.github.lukehutch:fast-classpath-scanner:2.12.3 configuration runtime from candidates [io.github.lukehutch:fast-classpath-scanner:2.12.3 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.eclipse.jetty:jetty-webapp:9.4.7.v20170914 configuration runtime from candidates [org.eclipse.jetty:jetty-webapp:9.4.7.v20170914 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.eclipse.jetty:jetty-servlet:9.4.7.v20170914 configuration runtime from candidates [org.eclipse.jetty:jetty-servlet:9.4.7.v20170914 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.glassfish.jersey.containers:jersey-container-jetty-http:2.25 configuration runtime from candidates [org.glassfish.jersey.containers:jersey-container-jetty-http:2.25 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.eclipse.jetty:jetty-security:9.4.7.v20170914 configuration runtime from candidates [org.eclipse.jetty:jetty-security:9.4.7.v20170914 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.eclipse.jetty:jetty-server:9.4.7.v20170914 configuration runtime from candidates [org.eclipse.jetty:jetty-server:9.4.7.v20170914 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match javax.servlet:javax.servlet-api:3.1.0 configuration runtime from candidates [javax.servlet:javax.servlet-api:3.1.0 configuration runtime] for {}
14:20:36.967 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.jolokia:jolokia-war:1.6.0 configuration runtime from candidates [org.jolokia:jolokia-war:1.6.0 configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.sf.jopt-simple:jopt-simple:5.0.2 configuration runtime from candidates [net.sf.jopt-simple:jopt-simple:5.0.2 configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.eclipse.jetty:jetty-continuation:9.4.7.v20170914 configuration runtime from candidates [org.eclipse.jetty:jetty-continuation:9.4.7.v20170914 configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.glassfish.jersey.containers:jersey-container-servlet-core:2.25 configuration runtime from candidates [org.glassfish.jersey.containers:jersey-container-servlet-core:2.25 configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.glassfish.jersey.core:jersey-server:2.25 configuration runtime from candidates [org.glassfish.jersey.core:jersey-server:2.25 configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.jolokia:jolokia-jsr160:1.6.0 configuration runtime from candidates [org.jolokia:jolokia-jsr160:1.6.0 configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.jolokia:jolokia-core:1.6.0 configuration runtime from candidates [org.jolokia:jolokia-core:1.6.0 configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.googlecode.json-simple:json-simple:1.1.1 configuration runtime from candidates [com.googlecode.json-simple:json-simple:1.1.1 configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.jetbrains:annotations:13.0 configuration runtime from candidates [org.jetbrains:annotations:13.0 configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.logging.log4j:log4j-api:2.9.1 configuration runtime from candidates [org.apache.logging.log4j:log4j-api:2.9.1 configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match commons-logging:commons-logging:1.2 configuration runtime from candidates [commons-logging:commons-logging:1.2 configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-annotations:2.9.0 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-annotations:2.9.0 configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-core:2.9.2 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-core:2.9.2 configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.hibernate.common:hibernate-commons-annotations:5.0.1.Final configuration runtime from candidates [org.hibernate.common:hibernate-commons-annotations:5.0.1.Final configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.jboss.logging:jboss-logging:3.3.0.Final configuration runtime from candidates [org.jboss.logging:jboss-logging:3.3.0.Final configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.glassfish.jersey.core:jersey-client:2.25 configuration runtime from candidates [org.glassfish.jersey.core:jersey-client:2.25 configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.glassfish.jersey.media:jersey-media-jaxb:2.25 configuration runtime from candidates [org.glassfish.jersey.media:jersey-media-jaxb:2.25 configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.glassfish.jersey.core:jersey-common:2.25 configuration runtime from candidates [org.glassfish.jersey.core:jersey-common:2.25 configuration runtime] for {}
14:20:36.968 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.glassfish.hk2:hk2-locator:2.5.0-b30 configuration runtime from candidates [org.glassfish.hk2:hk2-locator:2.5.0-b30 configuration runtime] for {}
14:20:36.969 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.javassist:javassist:3.20.0-GA configuration runtime from candidates [org.javassist:javassist:3.20.0-GA configuration runtime] for {}
14:20:36.969 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match antlr:antlr:2.7.7 configuration runtime from candidates [antlr:antlr:2.7.7 configuration runtime] for {}
14:20:36.969 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.geronimo.specs:geronimo-jta_1.1_spec:1.1.1 configuration runtime from candidates [org.apache.geronimo.specs:geronimo-jta_1.1_spec:1.1.1 configuration runtime] for {}
14:20:36.969 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.jboss:jandex:2.0.3.Final configuration runtime from candidates [org.jboss:jandex:2.0.3.Final configuration runtime] for {}
14:20:36.969 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml:classmate:1.3.0 configuration runtime from candidates [com.fasterxml:classmate:1.3.0 configuration runtime] for {}
14:20:36.969 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match dom4j:dom4j:1.6.1 configuration runtime from candidates [dom4j:dom4j:1.6.1 configuration runtime] for {}
14:20:36.969 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match javax.enterprise:cdi-api:1.1 configuration runtime from candidates [javax.enterprise:cdi-api:1.1 configuration runtime] for {}
14:20:36.969 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.yaml:snakeyaml:1.18 configuration runtime from candidates [org.yaml:snakeyaml:1.18 configuration runtime] for {}
14:20:36.969 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match commons-collections:commons-collections:3.2.2 configuration runtime from candidates [commons-collections:commons-collections:3.2.2 configuration runtime] for {}
14:20:36.969 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.jgroups:jgroups:3.6.13.Final configuration runtime from candidates [org.jgroups:jgroups:3.6.13.Final configuration runtime] for {}
14:20:36.969 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-all:4.1.9.Final configuration runtime from candidates [io.netty:netty-all:4.1.9.Final configuration runtime] for {}
14:20:36.969 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.geronimo.specs:geronimo-json_1.0_spec:1.0-alpha-1 configuration runtime from candidates [org.apache.geronimo.specs:geronimo-json_1.0_spec:1.0-alpha-1 configuration runtime] for {}
14:20:36.970 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.johnzon:johnzon-core:0.9.5 configuration runtime from candidates [org.apache.johnzon:johnzon-core:0.9.5 configuration runtime] for {}
14:20:36.970 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match commons-io:commons-io:2.2 configuration runtime from candidates [commons-io:commons-io:2.2 configuration runtime] for {}
14:20:36.970 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.esotericsoftware:reflectasm:1.11.3 configuration runtime from candidates [com.esotericsoftware:reflectasm:1.11.3 configuration runtime] for {}
14:20:36.970 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.esotericsoftware:minlog:1.3.0 configuration runtime from candidates [com.esotericsoftware:minlog:1.3.0 configuration runtime] for {}
14:20:36.970 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.objenesis:objenesis:2.2 configuration runtime from candidates [org.objenesis:objenesis:2.2 configuration runtime] for {}
14:20:36.970 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.eclipse.jetty:jetty-xml:9.4.7.v20170914 configuration runtime from candidates [org.eclipse.jetty:jetty-xml:9.4.7.v20170914 configuration runtime] for {}
14:20:36.970 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.glassfish.jersey.ext:jersey-entity-filtering:2.25 configuration runtime from candidates [org.glassfish.jersey.ext:jersey-entity-filtering:2.25 configuration runtime] for {}
14:20:36.970 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match javax.ws.rs:javax.ws.rs-api:2.0.1 configuration runtime from candidates [javax.ws.rs:javax.ws.rs-api:2.0.1 configuration runtime] for {}
14:20:36.970 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match javax.annotation:javax.annotation-api:1.2 configuration runtime from candidates [javax.annotation:javax.annotation-api:1.2 configuration runtime] for {}
14:20:36.970 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.glassfish.hk2:hk2-api:2.5.0-b30 configuration runtime from candidates [org.glassfish.hk2:hk2-api:2.5.0-b30 configuration runtime] for {}
14:20:36.970 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.glassfish.hk2.external:javax.inject:2.5.0-b30 configuration runtime from candidates [org.glassfish.hk2.external:javax.inject:2.5.0-b30 configuration runtime] for {}
14:20:36.970 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match javax.validation:validation-api:1.1.0.Final configuration runtime from candidates [javax.validation:validation-api:1.1.0.Final configuration runtime] for {}
14:20:36.970 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.eclipse.jetty:jetty-http:9.4.7.v20170914 configuration runtime from candidates [org.eclipse.jetty:jetty-http:9.4.7.v20170914 configuration runtime] for {}
14:20:36.971 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.eclipse.jetty:jetty-io:9.4.7.v20170914 configuration runtime from candidates [org.eclipse.jetty:jetty-io:9.4.7.v20170914 configuration runtime] for {}
14:20:36.971 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.eclipse.jetty:jetty-util:9.4.7.v20170914 configuration runtime from candidates [org.eclipse.jetty:jetty-util:9.4.7.v20170914 configuration runtime] for {}
14:20:36.971 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match javax.el:el-api:2.2 configuration runtime from candidates [javax.el:el-api:2.2 configuration runtime] for {}
14:20:36.971 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.jboss.spec.javax.interceptor:jboss-interceptors-api_1.1_spec:1.0.0.Beta1 configuration runtime from candidates [org.jboss.spec.javax.interceptor:jboss-interceptors-api_1.1_spec:1.0.0.Beta1 configuration runtime] for {}
14:20:36.971 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match javax.annotation:jsr250-api:1.0 configuration runtime from candidates [javax.annotation:jsr250-api:1.0 configuration runtime] for {}
14:20:36.971 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.glassfish.hk2:hk2-utils:2.5.0-b30 configuration runtime from candidates [org.glassfish.hk2:hk2-utils:2.5.0-b30 configuration runtime] for {}
14:20:36.971 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match javax.inject:javax.inject:1 configuration runtime from candidates [javax.inject:javax.inject:1 configuration runtime] for {}
14:20:36.971 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.ow2.asm:asm:5.0.4 configuration runtime from candidates [org.ow2.asm:asm:5.0.4 configuration runtime] for {}
14:20:36.971 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.glassfish.jersey.bundles.repackaged:jersey-guava:2.25 configuration runtime from candidates [org.glassfish.jersey.bundles.repackaged:jersey-guava:2.25 configuration runtime] for {}
14:20:36.971 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.glassfish.hk2:osgi-resource-locator:1.0.1 configuration runtime from candidates [org.glassfish.hk2:osgi-resource-locator:1.0.1 configuration runtime] for {}
14:20:36.971 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.glassfish.hk2.external:aopalliance-repackaged:2.5.0-b30 configuration runtime from candidates [org.glassfish.hk2.external:aopalliance-repackaged:2.5.0-b30 configuration runtime] for {}
14:20:36.972 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :app:runtime' started
14:20:36.972 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)' started
14:20:36.972 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)' in resolver cache: /Users/nicktombeur/.gradle/caches/modules-2/files-2.1/co.paralleluniverse/quasar-core/0.7.9/a429f8e45e7f7c99c206da73fc5500200153913e/quasar-core-0.7.9-jdk8.jar
14:20:36.972 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)'
14:20:36.972 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)' started
14:20:36.973 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)'
14:20:36.973 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)' started
14:20:36.973 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)'
14:20:36.973 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)' started
14:20:36.973 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)'
14:20:36.973 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)' started
14:20:36.973 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)'
14:20:36.973 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)' started
14:20:36.974 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)'
14:20:36.972 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.26.55.60 started (2 worker(s) in use).
14:20:36.974 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.26.55.60
14:20:36.974 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)' started
14:20:36.974 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)'
14:20:36.974 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)' started
14:20:36.975 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)' started
14:20:36.975 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)'
14:20:36.975 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)'
14:20:36.976 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)' started
14:20:36.975 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)' completed
14:20:36.976 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve quasar-core-jdk8.jar (co.paralleluniverse:quasar-core:0.7.9)'
14:20:36.976 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.26.55.60 completed (2 worker(s) in use)
14:20:36.976 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.26.55.60
14:20:36.979 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :app:runtime'
14:20:36.982 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :app:runtime' completed
14:20:36.982 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :app:runtime' started
14:20:36.983 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :app:runtime'
14:20:36.983 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :app:runtime' completed
14:20:37.403 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Execute build for :app:deployNodes'
14:20:37.403 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute build for :app:deployNodes' completed
14:20:37.403 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
14:20:37.403 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':app:deployNodes'
14:20:37.403 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Task :app:deployNodes'
14:20:37.403 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :app:deployNodes' completed
14:20:37.403 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :app:deployNodes (Thread[Task worker for ':',5,main]) completed. Took 0.452 secs.
14:20:37.404 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
14:20:37.404 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.26 completed (1 worker(s) in use)
14:20:37.404 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.26
14:20:37.404 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Task worker [Thread[Task worker for ':',5,main]] finished, busy: 5.7 secs, idle: 0.048 secs
14:20:37.404 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Run tasks'
14:20:37.404 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Run tasks' completed
14:20:37.406 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] 
14:20:37.406 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] FAILURE: Build failed with an exception.
14:20:37.406 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] 
14:20:37.406 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] * What went wrong:
14:20:37.406 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] Execution failed for task ':app:deployNodes'.
14:20:37.406 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] > Collection contains no element matching the predicate.
14:20:37.406 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] 
14:20:37.406 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] * Try:
14:20:37.406 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]  Run with --scan to get full insights.
14:20:37.406 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] 
14:20:37.406 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] * Exception is:
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] org.gradle.api.tasks.TaskExecutionException: Execution failed for task ':app:deployNodes'.
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeActions(ExecuteActionsTaskExecuter.java:110)
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:77)
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter.execute(OutputDirectoryCreatingTaskExecuter.java:51)
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter.execute(SkipUpToDateTaskExecuter.java:59)
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.ResolveTaskOutputCachingStateExecuter.execute(ResolveTaskOutputCachingStateExecuter.java:54)
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.ValidatingTaskExecuter.execute(ValidatingTaskExecuter.java:59)
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.SkipEmptySourceFilesTaskExecuter.execute(SkipEmptySourceFilesTaskExecuter.java:101)
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.FinalizeInputFilePropertiesTaskExecuter.execute(FinalizeInputFilePropertiesTaskExecuter.java:44)
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.CleanupStaleOutputsExecuter.execute(CleanupStaleOutputsExecuter.java:91)
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter.execute(ResolveTaskArtifactStateTaskExecuter.java:62)
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:59)
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:54)
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter.execute(ExecuteAtMostOnceTaskExecuter.java:43)
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:34)
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.run(EventFiringTaskExecuter.java:51)
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.internal.operations.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:317)
14:20:37.407 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.internal.operations.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:309)
14:20:37.408 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:185)
14:20:37.408 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:97)
14:20:37.408 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.internal.operations.DelegatingBuildOperationExecutor.run(DelegatingBuildOperationExecutor.java:31)
14:20:37.408 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:46)
14:20:37.408 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$ExecuteTaskAction.execute(DefaultTaskExecutionGraph.java:262)
14:20:37.408 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$ExecuteTaskAction.execute(DefaultTaskExecutionGraph.java:246)
14:20:37.408 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker$1.execute(DefaultTaskPlanExecutor.java:136)
14:20:37.408 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker$1.execute(DefaultTaskPlanExecutor.java:130)
14:20:37.408 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker.execute(DefaultTaskPlanExecutor.java:201)
14:20:37.408 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker.executeWithTask(DefaultTaskPlanExecutor.java:192)
14:20:37.408 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker.run(DefaultTaskPlanExecutor.java:130)
14:20:37.408 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:63)
14:20:37.409 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:46)
14:20:37.409 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:55)
14:20:37.409 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] Caused by: java.util.NoSuchElementException: Collection contains no element matching the predicate.
14:20:37.409 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at net.corda.plugins.Cordformation$Companion.getPluginFile(Cordformation.kt:77)
14:20:37.409 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at net.corda.plugins.Cordform$installRunScript$1.execute(Cordform.kt:29)
14:20:37.409 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at net.corda.plugins.Cordform$installRunScript$1.execute(Cordform.kt:17)
14:20:37.409 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.file.copy.FileCopier.createCopySpec(FileCopier.java:45)
14:20:37.409 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.file.copy.FileCopier.copy(FileCopier.java:50)
14:20:37.409 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.file.DefaultFileOperations.copy(DefaultFileOperations.java:167)
14:20:37.409 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.project.DefaultProject.copy(DefaultProject.java:1051)
14:20:37.409 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at net.corda.plugins.Cordform.installRunScript(Cordform.kt:27)
14:20:37.410 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at net.corda.plugins.Cordform.build(Cordform.kt:62)
14:20:37.410 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:73)
14:20:37.410 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:46)
14:20:37.410 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:39)
14:20:37.410 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:26)
14:20:37.410 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.AbstractTask$TaskActionWrapper.execute(AbstractTask.java:794)
14:20:37.410 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.AbstractTask$TaskActionWrapper.execute(AbstractTask.java:761)
14:20:37.410 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter$1.run(ExecuteActionsTaskExecuter.java:131)
14:20:37.410 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.internal.operations.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:317)
14:20:37.410 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.internal.operations.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:309)
14:20:37.410 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:185)
14:20:37.411 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:97)
14:20:37.411 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.internal.operations.DelegatingBuildOperationExecutor.run(DelegatingBuildOperationExecutor.java:31)
14:20:37.411 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeAction(ExecuteActionsTaskExecuter.java:120)
14:20:37.411 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeActions(ExecuteActionsTaskExecuter.java:99)
14:20:37.411 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter]   ... 30 more
14:20:37.411 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] 
14:20:37.411 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] 
14:20:37.411 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] * Get more help at https://help.gradle.org
14:20:37.411 [ERROR] [org.gradle.internal.buildevents.BuildResultLogger] 
14:20:37.411 [ERROR] [org.gradle.internal.buildevents.BuildResultLogger] BUILD FAILED in 7s

```
