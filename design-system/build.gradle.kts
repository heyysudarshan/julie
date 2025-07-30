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

    sourceSets {
        commonMain.dependencies {
            implementation(libs.compose.multiplatform.ui)
        }
    }
}

android {
    namespace = libs.versions.designSystem.androidLibrary.namespace.get()
    compileSdk = libs.versions.designSystem.androidLibrary.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.designSystem.androidLibrary.minSdk.get().toInt()
    }
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/designSystem"))