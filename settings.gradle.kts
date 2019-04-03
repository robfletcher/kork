/*
 * Copyright 2014 Netflix, Inc.
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

include(
  "kork-dependencies",
  "kork-bom",
  "kork-core",
  "kork-jedis-test",
  "kork-swagger",
  "kork-security",
  "kork-web",
  "kork-hystrix",
  "kork-stackdriver",
  "kork-exceptions",
  "kork-artifacts",
  "kork-jedis",
  "kork-dynomite",
  "kork-aws",
  "kork-secrets",
  "kork-secrets-aws",
  "kork-sql",
  "kork-sql-test",
  "kork-test",
  "kork-telemetry",
  "kork-expressions"
)

rootProject.name = "kork"

fun ProjectDescriptor.setBuildFile() {
  buildFileName = "$name.gradle.kts"
  children.forEach {
    it.setBuildFile()
  }
}

rootProject.children.forEach {
  it.setBuildFile()
}

