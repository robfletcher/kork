plugins {
  `java-library`
  groovy
}

dependencies {
  api(platform(project(":kork-dependencies")))

  implementation("com.netflix.spectator:spectator-api")
  implementation("com.google.guava:guava")

  testImplementation("org.codehaus.groovy:groovy-all")
  testImplementation("com.hubspot.jinjava:jinjava")
  testImplementation("org.spockframework:spock-core")
  testRuntimeOnly("cglib:cglib-nodep")
  testRuntimeOnly("org.objenesis:objenesis")
}
