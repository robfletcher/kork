plugins {
  `java-library`
}

dependencies {
  api(platform(project(":kork-dependencies")))

  implementation("org.springframework.boot:spring-boot-autoconfigure")
  implementation("io.springfox:springfox-swagger2:2.7.0")
  implementation("io.springfox:springfox-swagger-ui:2.7.0")
}
