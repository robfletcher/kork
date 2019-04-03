plugins {
  `java-platform`
  `maven-publish`
}

javaPlatform {
  allowDependencies()
}

publishing {
  publications {
    named<MavenPublication>("nebula") {
      from(components["javaPlatform"])
    }
  }
}

val versions = mapOf(
    "aws"            to  "1.11.469",
    "coroutines"     to  "1.1.1",
    "groovy"         to  "2.4.15",
    "hystrix"        to  "1.4.21",
    "retrofit"       to  "1.9.0",
    "retrofit2"      to  "2.5.0",
    "slf4j"          to  "1.7.25",
    "spectator"      to  "0.75.0",
    "spek"           to  "1.1.5",
    "spock"          to  "1.1-groovy-2.4",
    "testcontainers" to  "1.10.7"
  )

dependencies {
  api(platform("org.jetbrains.kotlin:kotlin-bom:1.3.21"))
  api(platform("org.junit:junit-bom:5.4.1"))
  api(platform("com.fasterxml.jackson:jackson-bom:2.9.8"))
  api(platform("org.springframework.boot:spring-boot-dependencies:1.5.17.RELEASE"))
  api(platform("io.strikt:strikt-bom:0.19.7"))
  api(platform("com.squareup.okhttp3:okhttp-bom:3.12.0"))
  constraints {
    api("cglib:cglib-nodep:3.2.0")
    api("ch.qos.logback:logback-classic:1.2.3")
    api("com.amazonaws:aws-java-sdk-core:${versions["aws"]}")
    api("com.amazonaws:aws-java-sdk-s3:${versions["aws"]}")
    api("com.amazonaws:aws-java-sdk-sqs:${versions["aws"]}")
    api("com.amazonaws:aws-java-sdk:${versions["aws"]}")
    api("com.google.apis:google-api-services-monitoring:v3-rev477-1.25.0")
    api("com.h2database:h2:1.4.197")
    api("com.hubspot.jinjava:jinjava:2.4.12")
    api("com.netflix.archaius:archaius-core:0.7.5")
    api("com.netflix.dyno:dyno-jedis:1.6.4")
    api("com.netflix.eureka:eureka-client:1.9.2")
    api("com.netflix.hystrix:hystrix-core:${versions["hystrix"]}")
    api("com.netflix.hystrix:hystrix-javanica:${versions["hystrix"]}")
    api("com.netflix.spectator:spectator-api:${versions["spectator"]}")
    api("com.netflix.spectator:spectator-ext-aws:${versions["spectator"]}")
    api("com.netflix.spectator:spectator-ext-gc:${versions["spectator"]}")
    api("com.netflix.spectator:spectator-ext-jvm:${versions["spectator"]}")
    api("com.netflix.spectator:spectator-web-spring:${versions["spectator"]}")
    api("com.netflix.spinnaker.embedded-redis:embedded-redis:0.8.0")
    api("com.netflix.spinnaker.moniker:moniker:0.2.0")
    api("com.squareup.okhttp:okhttp:2.7.0")
    api("com.squareup.retrofit2:converter-jackson:${versions["retrofit2"]}")
    api("com.squareup.retrofit2:retrofit-mock:${versions["retrofit2"]}")
    api("com.squareup.retrofit2:retrofit:${versions["retrofit2"]}")
    api("com.squareup.retrofit:retrofit:${versions["retrofit"]}")
    api("com.zaxxer:HikariCP:2.5.1")
    api("commons-io:commons-io:2.5")
    api("de.danielbechler:java-object-diff:0.95")
    api("de.huxhorn.sulky:de.huxhorn.sulky.ulid:8.2.0")
    api("dev.minutest:minutest:1.5.0")
    api("io.mockk:mockk:1.9.2")
    api("io.reactivex:rxjava:1.3.8")
    api("junit:junit:4.12")
    api("mysql:mysql-connector-java:8.0.15")
    api("org.apache.commons:commons-lang3:3.7")
    api("org.assertj:assertj-core:3.11.1")
    api("org.codehaus.groovy:groovy-all:${versions["groovy"]}")
    api("org.codehaus.groovy:groovy:${versions["groovy"]}")
    api("org.funktionale:funktionale-partials:1.2")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:${versions["coroutines"]}")
    api("org.jetbrains.spek:spek-api:${versions["spek"]}")
    api("org.jetbrains.spek:spek-junit-platform-engine:${versions["spek"]}")
    api("org.jooq:jooq:3.11.9")
    api("org.liquibase:liquibase-core:3.6.3")
    api("org.mockito:mockito-core:2.23.4")
    api("org.objenesis:objenesis:2.5.1")
    api("org.projectlombok:lombok:1.16.20")
    api("org.slf4j:jcl-over-slf4j:${versions["slf4j"]}")
    api("org.slf4j:slf4j-api:${versions["slf4j"]}")
    api("org.slf4j:slf4j-simple:${versions["slf4j"]}")
    api("org.spockframework:spock-core:${versions["spock"]}")
    api("org.spockframework:spock-spring:${versions["spock"]}")
    api("org.testcontainers:mysql:${versions["testcontainers"]}")
    api("org.yaml:snakeyaml:1.23")
    api("redis.clients:jedis:2.9.3")
  }
}
