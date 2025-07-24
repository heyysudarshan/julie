### About Julie

Julie is a component library and design system that helps you build beautiful, consistent, and
accessible user interfaces with ease. It offers a wide range of UI elements like `buttons`, `text
fields`, and `cards`, so you can focus on your app’s functionality while Julie handles the design.

Designed for `Compose Multiplatform`, Julie works seamlessly across `Android`, `desktop`, `web`, and
`iOS` with a shared codebase using `Compose Multiplatform`. It's also available for web projects
using `React`, bringing the same smooth animations and high-quality UI/UX to every platform.

### Installation guide

To get started, add the Julie library to your existing Gradle project. To include Julie in any
module, copy and paste the following line into your module's `build.gradle.kts` file under the
dependencies block as shown below.

#### For Android projects

```groovy
dependencies {
    // Other dependencies will go here
    implementation("io.github.heyysudarshan:julie:1.0.0-alpha")
}
```

#### For Compose Multiplatform projects

```kotlin
kotlin {
    sourceSets {
        commonMain.dependencies {
            // Other dependencies will go here
            implementation("io.github.heyysudarshan:julie:1.0.0-alpha")
        }
    }
}  
```

If your project uses a version catalog for centralized dependency management, add the following line
to your `libs.versions.toml` file:

```
[versions]
# Other version declarations will go here
julie = "1.0.0-alpha"

[libraries]
# Other libraries declarations will go here
julie = { module = "io.github.heyysudarshan:julie", version.ref = "julie" }
```

Then you can refer to the dependency in your `build.gradle` like this:

#### For Android projects

```groovy
dependencies {
    // Other dependencies will go here
    implementation(libs.julie)
}
```

#### For Compose Multiplatform projects

```kotlin
kotlin {
    sourceSets {
        commonMain.dependencies {
            // Other dependencies will go here
            implementation(libs.julie)
        }
    }
}  
```

### Thank you 🙌

Thank you for checking out this project! What started as a personal project is now evolving into
something more meaningful. If you're a designer with suggestions, I'd love to hear them. Please
think about giving the GitHub repository a star if you value the work. Happy coding!