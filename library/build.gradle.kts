plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

group = libs.versions.library.group.get()
version = libs.versions.library.version.get()

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
    namespace = libs.versions.library.androidLibrary.namespace.get()
    compileSdk = libs.versions.library.androidLibrary.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.library.androidLibrary.minSdk.get().toInt()
    }
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/library"))