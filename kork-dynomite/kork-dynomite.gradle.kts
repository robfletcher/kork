plugins {
  `java-library`
}

dependencies {
  api(platform(project(":kork-dependencies")))

  implementation(project(":kork-jedis"))
  implementation("com.netflix.dyno:dyno-jedis") {
    exclude(group = "joda-time")
    exclude(group = "org.apache.httpcomponents")
    exclude(group = "org.slf4j")
  }

  testImplementation("junit:junit")
}
