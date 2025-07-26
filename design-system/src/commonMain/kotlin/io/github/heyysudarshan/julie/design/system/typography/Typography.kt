package io.github.heyysudarshan.julie.design.system.typography

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

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
    val displayLargeRegular: TextStyle = TextStyle(),
    val displayLargeMedium: TextStyle = displayLargeRegular.copy(fontWeight = FontWeight.Medium),
    val displayLargeSemiBold: TextStyle = displayLargeRegular.copy(fontWeight = FontWeight.SemiBold),
    val displayLargeBold: TextStyle = displayLargeRegular.copy(fontWeight = FontWeight.Bold),
)