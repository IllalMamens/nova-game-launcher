package com.nova.gamelauncher.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = CyberNeonCyan,
    secondary = CyberNeonPink,
    tertiary = CyberNeonYellow,
    background = CyberBg,
    surface = CyberCard,
    onBackground = CyberTextPrimary,
    onSurface = CyberTextPrimary
)

@Composable
fun NovaTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        content = content
    )
}
