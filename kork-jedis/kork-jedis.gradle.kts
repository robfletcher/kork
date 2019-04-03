plugins {
  `java-library`
  groovy
}

dependencies {
  api(platform(project(":kork-dependencies")))

  api("org.springframework.boot:spring-boot-starter-actuator")
  api("redis.clients:jedis")

  implementation(project(":kork-core"))
  implementation("com.netflix.spectator:spectator-api")

  testImplementation("com.hubspot.jinjava:jinjava")
  testImplementation(project(":kork-jedis-test"))
  testImplementation("org.codehaus.groovy:groovy-all")
  testImplementation("org.spockframework:spock-core")
  testRuntimeOnly("cglib:cglib-nodep")
  testRuntimeOnly("org.objenesis:objenesis")
}
