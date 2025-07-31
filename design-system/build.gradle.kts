import com.vanniktech.maven.publish.SonatypeHost

plugins {
    alias(libs.plugins.maven.publish)
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

mavenPublishing {
    coordinates(
        groupId = libs.versions.designSystem.group.get(),
        artifactId = libs.versions.designSystem.artifactId.get(),
        version = libs.versions.designSystem.version.get()
    )

    pom {
        name.set("Julie Design System")
        description.set("Design System for Julie")
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