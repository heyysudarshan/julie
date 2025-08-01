package io.github.heyysudarshan.julie.design.system.typography

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Immutable
data class Typography(
    // Type: Display large
    val displayLargeRegular: TextStyle = TextStyle(
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = (-0.25).sp,
        fontWeight = FontWeight.Normal,
    ),
    val displayLargeMedium: TextStyle = displayLargeRegular.copy(fontWeight = FontWeight.Medium),
    val displayLargeSemiBold: TextStyle = displayLargeRegular.copy(fontWeight = FontWeight.SemiBold),
    val displayLargeBold: TextStyle = displayLargeRegular.copy(fontWeight = FontWeight.Bold),

    // Type: Display medium
    val displayMediumRegular: TextStyle = TextStyle(
        fontSize = 45.sp,
        lineHeight = 64.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.Normal,
    ),
    val displayMediumMedium: TextStyle = displayMediumRegular.copy(fontWeight = FontWeight.Medium),
    val displayMediumSemiBold: TextStyle = displayMediumRegular.copy(fontWeight = FontWeight.SemiBold),
    val displayMediumBold: TextStyle = displayMediumRegular.copy(fontWeight = FontWeight.Bold),

    // Type: Display small
    val displaySmallRegular: TextStyle = TextStyle(
        fontSize = 36.sp,
        lineHeight = 52.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.Normal,
    ),
    val displaySmallMedium: TextStyle = displaySmallRegular.copy(fontWeight = FontWeight.Medium),
    val displaySmallSemiBold: TextStyle = displaySmallRegular.copy(fontWeight = FontWeight.SemiBold),
    val displaySmallBold: TextStyle = displaySmallRegular.copy(fontWeight = FontWeight.Bold),

    // Type: Headline large
    val headlineLargeRegular: TextStyle = TextStyle(
        fontSize = 32.sp,
        lineHeight = 48.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.Normal,
    ),
    val headlineLargeMedium: TextStyle = headlineLargeRegular.copy(fontWeight = FontWeight.Medium),
    val headlineLargeSemiBold: TextStyle = headlineLargeRegular.copy(fontWeight = FontWeight.SemiBold),
    val headlineLargeBold: TextStyle = headlineLargeRegular.copy(fontWeight = FontWeight.Bold),

    // Type: Headline medium
    val headlineMediumRegular: TextStyle = TextStyle(
        fontSize = 28.sp,
        lineHeight = 44.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.Normal,
    ),
    val headlineMediumMedium: TextStyle = headlineMediumRegular.copy(fontWeight = FontWeight.Medium),
    val headlineMediumSemiBold: TextStyle = headlineMediumRegular.copy(fontWeight = FontWeight.SemiBold),
    val headlineMediumBold: TextStyle = headlineMediumRegular.copy(fontWeight = FontWeight.Bold),

    // Type: Headline small
    val headlineSmallRegular: TextStyle = TextStyle(
        fontSize = 24.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.Normal,
    ),
    val headlineSmallMedium: TextStyle = headlineSmallRegular.copy(fontWeight = FontWeight.Medium),
    val headlineSmallSemiBold: TextStyle = headlineSmallRegular.copy(fontWeight = FontWeight.SemiBold),
    val headlineSmallBold: TextStyle = headlineSmallRegular.copy(fontWeight = FontWeight.Bold),

    // Type: Title large
    val titleLargeRegular: TextStyle = TextStyle(
        fontSize = 22.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.Normal,
    ),
    val titleLargeMedium: TextStyle = titleLargeRegular.copy(fontWeight = FontWeight.Medium),
    val titleLargeSemiBold: TextStyle = titleLargeRegular.copy(fontWeight = FontWeight.SemiBold),
    val titleLargeBold: TextStyle = titleLargeRegular.copy(fontWeight = FontWeight.Bold),

    // Type: Title medium
    val titleMediumRegular: TextStyle = TextStyle(
        fontSize = 16.sp,
        lineHeight = 30.sp,
        letterSpacing = 0.15.sp,
        fontWeight = FontWeight.Medium,
    ),
    val titleMediumMedium: TextStyle = titleMediumRegular.copy(fontWeight = FontWeight.Medium),
    val titleMediumSemiBold: TextStyle = titleMediumRegular.copy(fontWeight = FontWeight.SemiBold),
    val titleMediumBold: TextStyle = titleMediumRegular.copy(fontWeight = FontWeight.Bold),

    // Type: Title small
    val titleSmallRegular: TextStyle = TextStyle(
        fontSize = 14.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.1.sp,
        fontWeight = FontWeight.Medium,
    ),
    val titleSmallMedium: TextStyle = titleSmallRegular.copy(fontWeight = FontWeight.Medium),
    val titleSmallSemiBold: TextStyle = titleSmallRegular.copy(fontWeight = FontWeight.SemiBold),
    val titleSmallBold: TextStyle = titleSmallRegular.copy(fontWeight = FontWeight.Bold),

    // Type: Body large
    val bodyLargeRegular: TextStyle = TextStyle(
        fontSize = 15.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.25.sp,
        fontWeight = FontWeight.Normal,
    ),
    val bodyLargeMedium: TextStyle = bodyLargeRegular.copy(fontWeight = FontWeight.Medium),
    val bodyLargeSemiBold: TextStyle = bodyLargeRegular.copy(fontWeight = FontWeight.SemiBold),
    val bodyLargeBold: TextStyle = bodyLargeRegular.copy(fontWeight = FontWeight.Bold),

    // Type: Body medium
    val bodyMediumRegular: TextStyle = TextStyle(
        fontSize = 14.sp,
        lineHeight = 30.sp,
        letterSpacing = 0.25.sp,
        fontWeight = FontWeight.Normal,
    ),
    val bodyMediumMedium: TextStyle = bodyMediumRegular.copy(fontWeight = FontWeight.Medium),
    val bodyMediumSemiBold: TextStyle = bodyMediumRegular.copy(fontWeight = FontWeight.SemiBold),
    val bodyMediumBold: TextStyle = bodyMediumRegular.copy(fontWeight = FontWeight.Bold),

    // Type: Body small
    val bodySmallRegular: TextStyle = TextStyle(
        fontSize = 12.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.25.sp,
        fontWeight = FontWeight.Normal,
    ),
    val bodySmallMedium: TextStyle = bodySmallRegular.copy(fontWeight = FontWeight.Medium),
    val bodySmallSemiBold: TextStyle = bodySmallRegular.copy(fontWeight = FontWeight.SemiBold),
    val bodySmallBold: TextStyle = bodySmallRegular.copy(fontWeight = FontWeight.Bold)
)