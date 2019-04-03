plugins {
  `java-library`
  groovy
}

dependencies {
  api(platform(project(":kork-dependencies")))

  api("org.springframework.boot:spring-boot-autoconfigure")
  api("org.springframework.boot:spring-boot-starter-actuator")
  api("com.netflix.archaius:archaius-core")
  api("com.netflix.eureka:eureka-client")
  api("com.amazonaws:aws-java-sdk-core")
  api("com.netflix.spectator:spectator-api")
  api("com.netflix.spectator:spectator-ext-aws")
  api("com.netflix.spectator:spectator-ext-gc")
  api("com.netflix.spectator:spectator-ext-jvm")
  api("com.netflix.spectator:spectator-web-spring")
  api(project(":kork-secrets-aws"))
  api("com.google.code.findbugs:jsr305:3.0.2")
  api("com.netflix.netflix-commons:netflix-eventbus:0.3.0")
  api("javax.inject:javax.inject:1")
  api("commons-configuration:commons-configuration:1.8")

  compileOnly("org.projectlombok:lombok")
  annotationProcessor("org.projectlombok:lombok:1.16.20")

  testImplementation("org.codehaus.groovy:groovy-all")
  testImplementation("org.mockito:mockito-core")
  testImplementation("org.spockframework:spock-core")
  testRuntimeOnly("cglib:cglib-nodep")
  testRuntimeOnly("org.objenesis:objenesis")
  testRuntimeOnly("org.slf4j:slf4j-simple")
}
