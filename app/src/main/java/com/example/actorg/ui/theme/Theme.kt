package com.example.actorg.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
        primary = yellow,
        primaryVariant = yellowVariant,
        secondary = Teal200,

        background = dark,
        onPrimary = grayDark,
        onBackground = Color.White,
        onSurface = Color.White

)

private val LightColorPalette = lightColors(
        primary = green,
        primaryVariant = greenVariant,
        secondary = Teal200,

        background = Color.White,
        surface = Color.White,
        onPrimary = grayWhite,
        onSecondary = Color.Black,
        onBackground = Color.Black,
        onSurface = Color.Black,
)

@Composable
fun ActorgTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
            colors = colors,
            typography = Typography,
            shapes = Shapes,
            content = content
    )
}