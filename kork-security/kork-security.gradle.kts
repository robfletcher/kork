plugins {
  `java-library`
  groovy
}

dependencies {
  api(platform(project(":kork-dependencies")))

  api("org.springframework.security:spring-security-core")

  implementation("org.codehaus.groovy:groovy-all")
  implementation("com.hubspot.jinjava:jinjava")
  implementation("com.fasterxml.jackson.core:jackson-core")
  implementation("com.fasterxml.jackson.core:jackson-databind")
  implementation("com.fasterxml.jackson.core:jackson-annotations")
  implementation("org.slf4j:jcl-over-slf4j")
  implementation("ch.qos.logback:logback-classic")

  testImplementation("org.spockframework:spock-core")
  testRuntimeOnly("cglib:cglib-nodep")
  testRuntimeOnly("org.objenesis:objenesis")
}
