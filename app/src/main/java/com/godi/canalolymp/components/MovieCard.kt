package com.godi.canalolymp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.godi.canalolymp.R

@Composable
fun MovieCard() {
    Card(
        modifier = Modifier
            .size(130.dp, 190.dp)
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.movie1), contentDescription = "",
        )
    }
}

@Composable
@Preview
fun MovieCardPreview() {
    MovieCard()
}