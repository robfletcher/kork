plugins {
  `java-library`
  groovy
}

dependencies {
  api(platform(project(":kork-dependencies")))

  implementation(project(":kork-security"))
  implementation(project(":kork-exceptions"))

  implementation("org.codehaus.groovy:groovy-all")
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("org.springframework.security:spring-security-core")
  implementation("com.netflix.spectator:spectator-api")
  implementation("com.fasterxml.jackson.core:jackson-annotations")
  implementation("com.hubspot.jinjava:jinjava")
  implementation("com.squareup.okhttp:okhttp")
  implementation("com.squareup.okhttp3:okhttp")
  implementation("com.squareup.retrofit:retrofit")
  implementation("com.google.guava:guava")

  compileOnly("org.springframework.boot:spring-boot-starter-actuator")

  testImplementation("org.spockframework:spock-core")
  testRuntimeOnly("cglib:cglib-nodep")
  testRuntimeOnly("org.objenesis:objenesis")
}
