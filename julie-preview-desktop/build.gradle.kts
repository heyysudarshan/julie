plugins {
    alias(libs.plugins.kotlin.compiler)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose.hot.reload)
}

group = libs.versions.juliePreviewDesktop.group.get()
version = libs.versions.juliePreviewDesktop.version.get()

dependencies {
    implementation(compose.desktop.currentOs)
    implementation(projects.juliePreview)
}

compose.desktop {
    application {
        mainClass = libs.versions.juliePreviewDesktop.mainClass.get()
    }
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/juliePreviewDesktop"))