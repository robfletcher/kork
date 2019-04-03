plugins {
  `java-library`
  groovy
}

dependencies {
  api(platform(project(":kork-dependencies")))

  implementation("org.codehaus.groovy:groovy-all")
  implementation("com.hubspot.jinjava:jinjava")
  implementation("com.netflix.spectator:spectator-api")
  implementation("org.springframework:spring-context")
  implementation("org.springframework:spring-beans")
  implementation("com.netflix.hystrix:hystrix-core")
  implementation("com.netflix.hystrix:hystrix-javanica")

  testImplementation("org.spockframework:spock-core")
  testRuntimeOnly("cglib:cglib-nodep")
  testRuntimeOnly("org.objenesis:objenesis")
}
