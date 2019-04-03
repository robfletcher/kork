import com.netflix.spinnaker.gradle.project.SpinnakerProjectPlugin
import org.gradle.api.JavaVersion.*

initscript {
  repositories {
    jcenter()
    maven(url = "https://dl.bintray.com/spinnaker/gradle/")
    maven(url = "https://plugins.gradle.org/m2/")
  }
  dependencies {
    classpath("com.netflix.spinnaker.gradle:spinnaker-gradle-project:5.2.0")
  }
}

// Can't use the plugin ID (spinnaker.project) on init scripts for some reason.
apply<SpinnakerProjectPlugin>()

// c&p this because NetflixOss reverts it to 1.7 and ends up getting applied last.
allprojects {
  project.afterEvaluate {
    project.plugins.withType<JavaBasePlugin>() {
      val convention = project.convention.getPlugin<JavaPluginConvention>()
      convention.sourceCompatibility = VERSION_1_8
      convention.targetCompatibility = VERSION_1_8
    }
  }
}
