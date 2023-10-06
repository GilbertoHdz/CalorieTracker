plugins {
  `android-library`
  `kotlin-android`
} // for some reason we can't apply this in gradle module file but in submodules we can

apply(from = "$rootDir/base-module.gradle")

android {
  namespace = "com.gilbertohdz.core"
}