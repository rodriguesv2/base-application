package br.com.rubensrodrigues.baseapplication.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = AlizarinCrimson,
    secondary = SantasGray,
    background = SteelGray,
    onBackground = Mischka
)

@Composable
fun MovieTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = DarkColorPalette,
        shapes = Shapes,
        content = content
    )
}