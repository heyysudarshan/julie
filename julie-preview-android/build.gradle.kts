import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.android.application)
    alias(libs.plugins.compose.compiler)
}

group = libs.versions.juliePreviewAndroid.group.get()
version = libs.versions.juliePreviewAndroid.version.get()

android {
    namespace = libs.versions.juliePreviewAndroidApp.namespace.get()
    compileSdk = libs.versions.juliePreviewAndroidApp.compileSdk.get().toInt()

    defaultConfig {
        applicationId = libs.versions.juliePreviewAndroidApp.applicationId.get()
        targetSdk = libs.versions.juliePreviewAndroidApp.targetSdk.get().toInt()
        minSdk = libs.versions.juliePreviewAndroidApp.minSdk.get().toInt()
        versionCode = libs.versions.juliePreviewAndroidApp.versionCode.get().toInt()
        versionName = libs.versions.juliePreviewAndroidApp.versionName.get()
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlin.compilerOptions {
        jvmTarget = JvmTarget.JVM_11
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(project(":julie-preview"))
    implementation(libs.core.splashscreen)
    implementation(libs.activity.compose)
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/juliePreviewAndroid"))