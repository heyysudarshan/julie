package io.github.heyysudarshan.julie.design.system.colorScheme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import io.github.heyysudarshan.julie.design.system.api.JulieTheme

/**
 * Defines a set of colors used to style UI components when using the Julie theme.
 *
 * All components in the Julie design system use the colors from this class automatically. You can
 * create light and dark versions of the color scheme with this class and apply them using the
 * [JulieTheme] API.
 */
@Immutable
data class ColorScheme(
    val backgroundColor: Color = Color.Unspecified,
    val primaryColor: Color = Color.Unspecified,
    val secondaryColor: Color = Color.Unspecified,
    val primaryFontColor: Color = Color.Unspecified,
    val secondaryFontColor: Color = Color.Unspecified,
)