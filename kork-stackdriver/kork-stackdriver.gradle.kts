/*
 * Copyright 2016 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
plugins {
  `java-library`
}

dependencies {
  api(platform(project(":kork-dependencies")))

  implementation("io.reactivex:rxjava")
  implementation("com.netflix.spectator:spectator-api")
  implementation("com.netflix.spectator:spectator-web-spring")
  implementation("com.google.apis:google-api-services-monitoring")

  // Force component bringing this in to already support spring boot configure.
  compileOnly("org.springframework.boot:spring-boot-autoconfigure")

  testImplementation("org.mockito:mockito-core")
  testImplementation("junit:junit")
}
