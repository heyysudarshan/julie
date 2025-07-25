plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

group = libs.versions.designSystem.group.get()
version = libs.versions.designSystem.version.get()

kotlin {
    androidTarget()

    jvm("desktop")

    iosX64()
    iosArm64()
    iosSimulatorArm64()
}

android {
    namespace = libs.versions.designSystem.namespace.get()
    compileSdk = libs.versions.designSystem.compileSdk.get().toInt()
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/designSystem"))