plugins {
  `java-library`
  groovy
}

dependencies {
  api(platform(project(":kork-dependencies")))

  testImplementation("org.codehaus.groovy:groovy-all")
  testImplementation("org.spockframework:spock-core")
  testRuntimeOnly("cglib:cglib-nodep")
  testRuntimeOnly("org.objenesis:objenesis")

  testImplementation("com.hubspot.jinjava:jinjava")
}
