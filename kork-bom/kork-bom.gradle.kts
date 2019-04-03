plugins {
  `java-platform`
  `maven-publish`
}

javaPlatform {
  allowDependencies()
}

publishing {
  publications {
    named<MavenPublication>("nebula") {
      from(components["javaPlatform"])
    }
  }
}

dependencies {
  api(platform(project(":kork-dependencies")))
  constraints {
    api(project(":kork-artifacts"))
    api(project(":kork-aws"))
    api(project(":kork-core"))
    api(project(":kork-dynomite"))
    api(project(":kork-exceptions"))
    api(project(":kork-expressions"))
    api(project(":kork-hystrix"))
    api(project(":kork-jedis"))
    api(project(":kork-secrets"))
    api(project(":kork-secrets-aws"))
    api(project(":kork-security"))
    api(project(":kork-sql"))
    api(project(":kork-stackdriver"))
    api(project(":kork-swagger"))
    api(project(":kork-telemetry"))
    api(project(":kork-web"))
  }
}
