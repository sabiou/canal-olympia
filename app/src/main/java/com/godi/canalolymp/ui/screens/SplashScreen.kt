package com.godi.canalolymp.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.godi.canalolymp.ui.theme.CanalOlympiaTheme
import com.godi.canalolymp.ui.theme.CustomTheme

@Composable
fun SplashScreen() {}

@Composable
@Preview
fun SplashScreenPreview() {
    CanalOlympiaTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = CustomTheme.colors.crimsonRed
        ) {
            SplashScreen()
        }
    }
}