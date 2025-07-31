import com.vanniktech.maven.publish.SonatypeHost

plugins {
    alias(libs.plugins.maven.publish)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

group = libs.versions.library.group.get()
version = libs.versions.library.version.get()

kotlin {
    androidTarget {
        publishLibraryVariants("release")
    }

    jvm("desktop")

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
            implementation(libs.compose.multiplatform.ui)
            api(projects.designSystem)
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

mavenPublishing {
    coordinates(
        groupId = libs.versions.library.group.get(),
        artifactId = libs.versions.library.artifactId.get(),
        version = libs.versions.library.version.get()
    )

    pom {
        name.set("Julie Component Library")
        description.set("Julie Components library for Compose")
        inceptionYear.set("2025")
        url = "https://github.com/heyysudarshan/julie"
        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("repo")
            }
        }
        developers {
            developer {
                id.set("heyysudarshan")
                name.set("Sudarshan")
                url.set("https://github.com/heyysudarshan")
            }
        }
        scm {
            url.set("https://github.com/heyysudarshan/julie")
            connection.set("scm:git:https://github.com/heyysudarshan/julie.git")
            developerConnection.set("scm:git:ssh://git@github.com/heyysudarshan/julie.git")
        }
    }

    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/library"))