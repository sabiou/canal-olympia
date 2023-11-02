package com.godi.canalolymp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.godi.canalolymp.R
import com.godi.canalolymp.ui.theme.CustomTheme

@Composable
fun OlympiaToolbar(
) {
    Row(
        modifier = Modifier
            .size(375.dp, 64.dp)
            .background(Color(0xFF0b1a62)),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            modifier = Modifier.size(40.dp),
            painter = painterResource(id = R.drawable.canal_olympia_logo),
            contentDescription = "logo"
        )
        LocationRow()
        LanguageRow()
        Button(
            onClick = { },
            modifier = Modifier.size(85.dp, 40.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = CustomTheme.colors.crimsonRed
            )
        ) {
            Text(
                text = "Login",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W600,
                    fontStyle = FontStyle.Normal,
                )
            )
        }
    }
}

@Composable
fun LocationRow() {
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        Image(
            modifier = Modifier.size(24.dp),
            imageVector = ImageVector.vectorResource(R.drawable.location),
            contentDescription = "location"
        )
        Text(
            text = "Niamey",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.W600,
                fontStyle = FontStyle.Normal,
                color = Color.White
            )
        )
    }
}

@Composable
fun LanguageRow() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Image(
            modifier = Modifier.size(24.dp),
            imageVector = ImageVector.vectorResource(R.drawable.language),
            contentDescription = "location"
        )
        Text(
            text = "Fr",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.W600,
                fontStyle = FontStyle.Normal,
                color = Color.White
            )
        )
    }
}

@Composable
@Preview
fun OlympiaToolbarPreview() {
    OlympiaToolbar()
}