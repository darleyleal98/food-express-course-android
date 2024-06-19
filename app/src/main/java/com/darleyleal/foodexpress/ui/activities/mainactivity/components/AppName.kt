package com.darleyleal.foodexpress.ui.activities.mainactivity.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.darleyleal.foodexpress.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
@OptIn(ExperimentalTextApi::class)
fun MostrarNomeDoApp(nome: String = "FoodExpress") {
    Row {
        val font = FontFamily(
            Font(
                R.font.poppins,
                variationSettings = FontVariation.Settings(
                    FontVariation.weight(950),
                    FontVariation.width(30f),
                    FontVariation.slant(-6f),
                )
            )
        )
        Text(
            text = nome,
            fontSize = 32.sp,
            fontWeight = FontWeight(600),
            fontFamily = font,
            color = Color.DarkGray,
            modifier = Modifier.padding(start = 16.dp, top = 16.dp, bottom = 16.dp)
        )
    }
}