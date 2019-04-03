/*
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

buildscript {
  repositories {
    mavenCentral()
    jcenter()
    gradlePluginPortal()
    maven(url = "https://dl.bintray.com/spinnaker/gradle/")
  }
  dependencies {
    classpath("com.netflix.spinnaker.gradle:spinnaker-dev-plugin:5.2.0")
  }
}

plugins {
  id("nebula.kotlin") version "1.3.21" apply false
  id("org.jetbrains.kotlin.plugin.allopen") version "1.3.21" apply false
}

allprojects {
  apply(plugin = "spinnaker.base-project")

  group = "com.netflix.spinnaker.kork"

  repositories {
    jcenter()
  }
}
