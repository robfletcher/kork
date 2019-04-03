plugins {
  `java-library`
}

dependencies {
  api(platform(project(":kork-dependencies")))

  implementation(project(":kork-sql"))
  implementation("com.h2database:h2")
}
