package com.darleyleal.foodexpress.data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Produto(
    val nome: String,
    val valor: Float,
    @DrawableRes
    val imagem: Int,
    val categoria: String,
    val cor: Color,
    val promocao: Boolean
)