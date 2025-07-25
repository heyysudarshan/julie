package julie.design.system.typography

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle

@Immutable
data class Typography(
    // tT
    val displayLarge: TextStyle = TextStyle(),
    val displayMedium: TextStyle = TextStyle(),
    val displaySmall: TextStyle = TextStyle(),

    // Headline type
    val headlineLarge: TextStyle = TextStyle(),
    val headlineMedium: TextStyle = TextStyle(),
    val headlineSmall: TextStyle = TextStyle(),

    // Title type
    val titleLarge: TextStyle = TextStyle(),
    val titleMedium: TextStyle = TextStyle(),
    val titleSmall: TextStyle = TextStyle(),

    // Label type
    val labelLarge: TextStyle = TextStyle(),
    val labelMedium: TextStyle = TextStyle(),
    val labelSmall: TextStyle = TextStyle(),

    // Type: Body Large
    val bodyLargeRegular: TextStyle = TextStyle(),
    val bodyLargeMedium: TextStyle = TextStyle(),
    val bodyLargeSemiBold: TextStyle = TextStyle(),
    val bodyLargeBold: TextStyle = TextStyle(),

    // Type: Body Medium
    val bodyMediumRegular: TextStyle = TextStyle(),
    val bodyMediumMedium: TextStyle = TextStyle(),
    val bodyMediumSemiBold: TextStyle = TextStyle(),
    val bodyMediumBold: TextStyle = TextStyle(),

    // Type: Body Small
    val bodySmallRegular: TextStyle = TextStyle(),
    val bodySmallMedium: TextStyle = TextStyle(),
    val bodySmallSemiBold: TextStyle = TextStyle(),
    val bodySmallBold: TextStyle = TextStyle()
)