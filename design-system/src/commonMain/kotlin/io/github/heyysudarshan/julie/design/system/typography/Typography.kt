package io.github.heyysudarshan.julie.design.system.typography

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 **
 * *Typography* class for the Julie Design System.
 *
 * This class contains all the text styles provided by the Julie design system.
 * You can use these styles in your application without any modifications,
 * as all properties follow the specifications defined by the Julie design system by default.
 *
 * Each text style is available in the following weights:
 * 1. Normal
 * 2. Medium
 * 3. SemiBold
 * 4. Bold
 *
 * To learn more about the Julie Typography, see
 * [Typography](http://heyysudarshan.github.io/julie/design-system/typography).
 */
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
)