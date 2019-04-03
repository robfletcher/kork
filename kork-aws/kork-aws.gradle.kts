/*
 * Copyright 2018 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
plugins {
  `java-library`
  groovy
}

dependencies {
  api(platform(project(":kork-dependencies")))

  implementation("org.codehaus.groovy:groovy-all")
  implementation("com.hubspot.jinjava:jinjava")
  implementation("org.springframework.boot:spring-boot-autoconfigure")
  implementation("com.amazonaws:aws-java-sdk-core")
  implementation("com.amazonaws:aws-java-sdk")
  implementation("com.jcraft:jsch.agentproxy.jsch:0.0.9")
  implementation("com.jcraft:jsch.agentproxy.connector-factory:0.0.9")
  implementation("com.aestasit.infrastructure.sshoogr:sshoogr:0.9.25")

  testImplementation("org.spockframework:spock-core")
  testRuntimeOnly("cglib:cglib-nodep")
  testRuntimeOnly("org.objenesis:objenesis")
}
