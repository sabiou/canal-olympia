package com.godi.canalolymp.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.godi.canalolymp.ui.theme.CanalOlympiaTheme
import com.godi.canalolymp.ui.theme.CanalOlympiaTheme.LocalCustomColors

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

object CanalOlympiaTheme {
    @Immutable
    data class CustomColors(
        val crimsonRed: Color,
        val indigo: Color,
        val royalBlue: Color,
        val lightPurple: Color,
        val coolGray: Color,
    )

    /**
     * Default instance of the custom theme colors.
     */
    val canalOlympiaColors = CustomColors(
        crimsonRed = Color(0xFFBC002E),
        indigo = Color(0xFF5C16C5),
        royalBlue = Color(0xFF0B1A62),
        lightPurple = Color(0xFFBF94FF),
        coolGray = Color(0xFFADADB8)
    )

    val LocalCustomColors = staticCompositionLocalOf { canalOlympiaColors }
}

/**
 * Composable function for applying the custom theme colors to the content.
 *
 * @param content The content to apply the custom theme to.
 */
@Composable
fun CustomTheme(content: @Composable () -> Unit) {
    val customThemeColors = CanalOlympiaTheme.canalOlympiaColors
    CompositionLocalProvider(LocalCustomColors provides customThemeColors) {
        MaterialTheme(
            content = content
        )
    }
}


/**
 * Provides access to the custom theme colors from the current composition.
 *
 * Usage: `val customThemeColors = CustomTheme.colors`
 */
object CustomTheme {
    val colors: CanalOlympiaTheme.CustomColors
        @Composable
        get() = LocalCustomColors.current
}

@Composable
fun CanalOlympiaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}