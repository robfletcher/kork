plugins {
  `java-library`
}

tasks.withType<Test> {
  useJUnitPlatform()
}

dependencies {
  api(platform(project(":kork-dependencies")))

  implementation("com.fasterxml.jackson.core:jackson-databind")
  implementation("org.springframework:spring-context")
  implementation("org.slf4j:slf4j-api")

  compileOnly("org.projectlombok:lombok")
  annotationProcessor("org.projectlombok:lombok:1.16.20")

  testImplementation("org.assertj:assertj-core")
  testImplementation("org.junit.jupiter:junit-jupiter-api")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
  testRuntimeOnly("org.slf4j:slf4j-simple")

  testCompileOnly("org.projectlombok:lombok")
  testAnnotationProcessor("org.projectlombok:lombok:1.16.20")
}
