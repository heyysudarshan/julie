plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

group = libs.versions.juliePreview.group.get()
version = libs.versions.juliePreview.version.get()

kotlin {
    androidTarget()

    jvm("desktop")

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64(),
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "ComposeApp"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation(libs.compose.multiplatform.ui)
            implementation(libs.compose.multiplatform.foundation)
        }
    }
}

android {
    namespace = libs.versions.juliePreview.androidLibrary.namespace.get()
    compileSdk = libs.versions.juliePreview.androidLibrary.compileSdk.get().toInt()
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/juliePreview"))