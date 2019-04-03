import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  `java-library`
  id("nebula.kotlin") //version "1.3.21"
  id("org.jetbrains.kotlin.plugin.spring") //version "1.3.21"
}

dependencies {
  api(platform(project(":kork-dependencies")))

  implementation(project(":kork-core"))
  implementation(project(":kork-security"))

  implementation("org.springframework:spring-jdbc")
  implementation("org.springframework:spring-tx")
  api("org.jooq:jooq")
  api("org.liquibase:liquibase-core")
  api("com.zaxxer:HikariCP")

  testImplementation("org.springframework.boot:spring-boot-starter-actuator")
  testImplementation("org.springframework.boot:spring-boot-starter-web")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
  testRuntimeOnly(project(":kork-sql-test"))
}

dependencies {
  testImplementation("org.junit.jupiter:junit-jupiter-api")
  testImplementation("org.junit.platform:junit-platform-runner")
  testImplementation("org.jetbrains.spek:spek-api")
  testImplementation("com.nhaarman:mockito-kotlin:1.5.0")
  testImplementation("org.assertj:assertj-core")
  testImplementation("io.strikt:strikt-core")

  testRuntimeOnly("org.junit.platform:junit-platform-launcher")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
  testRuntimeOnly("org.junit.vintage:junit-vintage-engine")
  testRuntimeOnly("org.jetbrains.spek:spek-junit-platform-engine")
}

tasks.withType<Test> {
  useJUnitPlatform {
    includeEngines("spek", "junit-vintage", "junit-jupiter")
  }
}

//configurations.all {
//  resolutionStrategy {
//    eachDependency { details ->
//      if (details.requested.group == "org.jetbrains.kotlin") {
//        details.useVersion(kotlinVersion)
//      }
//    }
//  }
//}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    jvmTarget = "1.8"
    languageVersion = "1.3"
    freeCompilerArgs += "-progressive"
  }
}
