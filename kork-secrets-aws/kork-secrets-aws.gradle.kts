plugins {
  `java-library`
}

dependencies {
  api(platform(project(":kork-dependencies")))

  api(project(":kork-secrets"))
  
  implementation("com.amazonaws:aws-java-sdk-s3")

  compileOnly("org.projectlombok:lombok")
  annotationProcessor("org.projectlombok:lombok:1.16.20")
}
