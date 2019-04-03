plugins {
  `java-library`
  groovy
}

dependencies {
  api(platform(project(":kork-dependencies")))

  api("org.springframework.boot:spring-boot-autoconfigure")
  api("com.google.guava:guava")

  implementation("org.springframework.boot:spring-boot-starter-actuator")
  implementation("com.netflix.spectator:spectator-ext-gc")
  implementation("com.netflix.spectator:spectator-ext-jvm")
  implementation("com.netflix.spectator:spectator-web-spring")
  implementation("org.apache.commons:commons-lang3")
  implementation("org.yaml:snakeyaml")

  compileOnly("org.projectlombok:lombok")
  annotationProcessor("org.projectlombok:lombok:1.16.20")

  testImplementation("com.hubspot.jinjava:jinjava")
  testImplementation("org.spockframework:spock-core")
  testRuntimeOnly("cglib:cglib-nodep")
  testRuntimeOnly("org.objenesis:objenesis")
  testRuntimeOnly("org.slf4j:slf4j-simple")

  testImplementation("org.springframework:spring-test")
  testImplementation("org.springframework.boot:spring-boot-test")
  testImplementation("org.mockito:mockito-core")
}
