plugins {
  `java-library`
  groovy
}

dependencies {
  api(platform(project(":kork-dependencies")))
  
  implementation(project(":kork-core"))
  implementation("commons-io:commons-io")
  implementation("com.hubspot.jinjava:jinjava")

  compileOnly("org.projectlombok:lombok")
  annotationProcessor("org.projectlombok:lombok:1.16.20")

  testImplementation("org.codehaus.groovy:groovy-all")
  testImplementation("org.spockframework:spock-core")
  testRuntimeOnly("cglib:cglib-nodep")
  testRuntimeOnly("org.objenesis:objenesis")
}
