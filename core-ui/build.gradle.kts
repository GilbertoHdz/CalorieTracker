plugins {
  `android-library`
  `kotlin-android`
}

apply(from = "$rootDir/compose-module.gradle")

android {
  namespace = "com.gilbertohdz.core_ui"
}
