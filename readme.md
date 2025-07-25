### About Julie

Julie is a component library and design system created for
[Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform). It empowers developers
to design beautiful, consistent, and accessible user interfaces across various platforms.

Designed for `Compose Multiplatform`, Julie works seamlessly across `Android`, `Desktop`, `Web`, and
`iOS` with a shared codebase using Kotlin Multiplatform.

It offers a wide range of UI components, such as `buttons`, `text fields`, `cards`, and pretty much
everything you need to create a beautiful and rich user interface for your products.

Note: Julie does not support `XML`, `SwiftUI`, or any other toolkits. It is primarily designed for
`Compose Multiplatform`. However, you can use Julie in your regular `Jetpack Compose` projects
without any issues. Julie offers support for `React JS` on the web; however, this support is limited
and is not the library's main focus.

### Learning guide

Check out the [Julie learning guides](http://heyysudarshan.github.io/julie/learn-julie) to learn how
to use Julie effectively in your project. The guide not only teaches you how to use each component
but also explains the design thinking behind it.

### Installation guide

To get started, add the Julie library to your existing Gradle project. To include Julie in any
module, copy and paste the following line into your module's `build.gradle.kts` file under the
`dependencies` block as shown below.

#### For Android projects

```groovy
dependencies {
    // Other dependencies will go here
    implementation("io.github.heyysudarshan:julie:1.0.0")
}
```

#### For Compose Multiplatform projects

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

If your project uses a version catalog for centralized dependency management, add the following line
to your `libs.versions.toml` file:

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

### For React projects

```kotlin
npm i julie - react
```

### Why Julie?

With so many component libraries out there, it’s fair to ask, why build another one? Android
developers often rely on Google’s `Material 3`, while web developers use libraries like `Shadcn` or
`TailwindCSS`. But these are mostly platform-specific. Even though `Material 3` supports
`Compose Multiplatform`, I found it lacking the visual appeal and smooth experience I was aiming
for. That said, its design guidelines are still highly valuable.

That’s why I set out to build this component library and design system. While it takes inspiration
from Material 3’s typography and principles, it introduces visually appealing and thoughtfully
crafted components from the start. The goal is to maintain a cohesive visual style and user
experience across all platforms.

### Thank you 🙌

Thank you for checking out this project! What started as a personal project is now evolving into
something more meaningful. If you're a designer with suggestions, I'd love to hear them. Please
think about giving the GitHub repository a star if you value the work. Happy coding!