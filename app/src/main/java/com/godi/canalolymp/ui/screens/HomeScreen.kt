package com.godi.canalolymp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.godi.canalolymp.components.OlympiaToolbar
import com.godi.canalolymp.ui.theme.CustomTheme

@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = CustomTheme.colors.royalBlue
    ) {
        Column {
            OlympiaToolbar()
        }
    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen()
}