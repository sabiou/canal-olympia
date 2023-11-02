package com.godi.canalolymp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.godi.canalolymp.ui.theme.CustomTheme

@Composable
fun CategoryTag(
    onSelected: () -> Unit
) {
    var isSelected by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .clickable {
                isSelected = !isSelected
            }
            .width(130.dp)
            .height(36.dp)
            .background(
                color = if (isSelected) CustomTheme.colors.royalBlue else Color(0xFFFFFFFF),
                shape = RoundedCornerShape(size = 20.dp)
            )
            .padding(start = 14.dp, top = 8.dp, end = 6.dp, bottom = 10.dp)
    ) {
        Text(
            text = "Les nouveautés",
            style = TextStyle(
                color = if (isSelected) Color.White else CustomTheme.colors.royalBlue
            )
        )
    }
}

@Composable
@Preview
fun CategoryTagPreview() {
    CategoryTag {}
}