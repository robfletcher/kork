plugins {
  `java-library`
}

dependencies {
  api(platform(project(":kork-dependencies")))

  api("redis.clients:jedis")
  api("com.netflix.spinnaker.embedded-redis:embedded-redis")
}
