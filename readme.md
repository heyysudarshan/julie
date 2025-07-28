![Developed for Compose Multiplatform Logo](https://github.com/heyysudarshan/julie/blob/main/assets/compose-multiplatform-tag.svg)
![Release tag](https://github.com/heyysudarshan/julie/blob/main/assets/release-tag.svg)
![Android release tag](https://github.com/heyysudarshan/julie/blob/main/assets/android-tag.svg)

### About Julie

Julie is a component library and design system developed for
[Compose Multiplatform](https://www.jetbrains.com/compose-multiplatform/). It empowers developers to
design beautiful, consistent, and accessible user interfaces across various platforms.

Designed for `Compose Multiplatform`, Julie works seamlessly across `Android`, `Desktop`, `Web`, and
`iOS` with a shared codebase using
[Kotlin Multiplatform](https://www.jetbrains.com/kotlin-multiplatform/).

> ***Note***: Julie does not support `XML`, `SwiftUI`, or any other toolkits. It is primarily
> designed for `Compose Multiplatform`.
>
> However, you can use Julie in your regular `Jetpack Compose` projects
> without any issues. Julie offers support for `React JS` on the web; however, this support is
> limited and is not the library's main focus.

It offers a wide range of UI components, such as `buttons`, `text fields`, `cards`, and pretty much
everything you need to create a beautiful and rich user interface for your products. See
[Components](http://heyysudarshan.github.io/julie/components) for a list of all available
components in Julie.

### Learning guide

If you're new to Julie, then don't worry; check out the
[Julie learning guide](http://heyysudarshan.github.io/julie/learn-julie) to learn how to use Julie
effectively in your project. The guide not only teaches you how to use each component but also
explains the design thinking behind it. Also, if you're new to the world of `UI/UX`, the guide also
covers important topics on how to build user-centric applications.

### Installation guide

To get started, add the Julie dependency to your existing [Gradle](https://gradle.org/) project. To
make Julie available in any module's classpath, copy and paste the following line into your module's
`build.gradle.kts` file under the `dependencies` block as shown below.

#### For Android project

```kotlin
dependencies {
    // Other dependencies will go here
    implementation("io.github.heyysudarshan:julie:1.0.0")
}
```

For quickly copying the dependency, you can use the following command:

```kotlin
implementation("io.github.heyysudarshan:julie:1.0.0")
```

#### For Compose Multiplatform project

```kotlin
kotlin {
    sourceSets {
        commonMain.dependencies {
            // Other dependencies will go here
            implementation("io.github.heyysudarshan:julie:1.0.0")
        }
    }
}  
```

For quickly copying the dependency, you can use the following command:

```kotlin
implementation("io.github.heyysudarshan:julie:1.0.0")
```

If your project uses a version catalog for centralized dependency management, add the following
lines to your `libs.versions.toml` file:

```
[versions]
# Other version declarations will go here
julie = "1.0.0"

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

For quickly copying the dependency, you can use the following command:

```kotlin
implementation(libs.julie)
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

For quickly copying the dependency, you can use the following command:

```kotlin
implementation(libs.julie)
```

### For React projects

If you're using `React`, you can install the library using the following command:

```shell
npm i julie-react
```

### Contributing

If you like this project and want to extend it for your use case, then consider contributing to
Julie. See [Contributing](http://heyysudarshan.github.io/julie/contribute) to learn how you can
contribute to this project. You can also choose to fork this project repository and make any changes
you want while keeping those changes private; however, this approach won't contribute to the
project's growth.

Contributing to Julie will help other developers benefit from the changes you made and help Julie
grow beyond another `open-source` project on `GitHub`.

### Understanding the project structure

If you're willing to contribute or are curious about how the source code of this project is
structured, this section is for you. The project is divided into multiple modules to make it easier
to organize, especially for scalable projects.

- `design-system`: This is a `Kotlin Multiplatform` library module that contains the design system,
  which forms the foundation of the library. It includes typography, color schemes, and the spacing
  system.

### Why Julie

// Yet to be added

### Thank you 🙌

Thank you so much for checking out the Julie project. I started it as a personal project, but soon I
realized it could help others too. So, I decided to open-source it so it can grow beyond what it is
today. If you like my work or this project, feel free to give a star to the repository. Happy
coding! 