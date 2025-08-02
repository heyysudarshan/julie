plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

group = libs.versions.juliePreviewShared.group.get()
version = libs.versions.juliePreviewShared.version.get()

kotlin {
    androidTarget()

    jvm("desktop")

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {

        }
    }
}

android {
    namespace = libs.versions.juliePreviewShared.androidLibrary.namespace.get()
    compileSdk = libs.versions.juliePreviewShared.androidLibrary.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.juliePreviewShared.androidLibrary.minSdk.get().toInt()
    }
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/juliePreviewShared"))