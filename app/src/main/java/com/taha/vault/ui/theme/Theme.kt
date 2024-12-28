package com.taha.vault.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// Samsung One UI Colors
private val SamsungBlue = Color(0xFF1259C3)
private val SamsungLightBlue = Color(0xFF4C94FF)
private val SamsungGray = Color(0xFF4C4C4C)
private val SamsungLightGray = Color(0xFFCFCFCF)
private val SamsungBackground = Color(0xFFF7F7F7)
private val SamsungDarkBackground = Color(0xFF000000)
private val SamsungSurface = Color(0xFFFFFFFF)
private val SamsungDarkSurface = Color(0xFF121212)

private val SamsungDarkColorScheme = darkColorScheme(
    primary = SamsungLightBlue,
    secondary = SamsungLightGray,
    tertiary = SamsungBlue,
    background = SamsungDarkBackground,
    surface = SamsungDarkSurface,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White
)

private val SamsungLightColorScheme = lightColorScheme(
    primary = SamsungBlue,
    secondary = SamsungGray,
    tertiary = SamsungLightBlue,
    background = SamsungBackground,
    surface = SamsungSurface,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color.Black,
    onSurface = Color.Black
)

@Composable
fun VaultTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    // Samsung doesn't use dynamic colors, so we'll remove that option
    val colorScheme = if (darkTheme) {
        SamsungDarkColorScheme
    } else {
        SamsungLightColorScheme
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            // Samsung uses a transparent status bar in most cases
            window.statusBarColor = Color.Transparent.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}