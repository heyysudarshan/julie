package io.github.heyysudarshan.julie.design.system.api

import androidx.compose.runtime.staticCompositionLocalOf
import io.github.heyysudarshan.julie.design.system.colorScheme.ColorScheme
import io.github.heyysudarshan.julie.design.system.typography.Typography

internal val localTypography = staticCompositionLocalOf { Typography() }
internal val LocalColorScheme = staticCompositionLocalOf { ColorScheme() }