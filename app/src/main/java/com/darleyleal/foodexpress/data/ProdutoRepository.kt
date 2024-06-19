package com.darleyleal.foodexpress.data

import androidx.compose.ui.graphics.Color
import com.darleyleal.foodexpress.R

class ProdutoRepository {
    companion object {
        val listaDeProdutos = listOf(
            Produto(
                "Torta Banoffee", 14.99f,
                R.drawable.bannofee, "Doces", Color.Red, false
            ),
            Produto(
                "Brownie", 15.99f,
                R.drawable.brownie, "Doces", Color.Red, true
            ),
            Produto(
                "Torta de Limão", 10.99f,
                R.drawable.lemon_pie, "Doces", Color.Red, false
            ),
            Produto(
                "Espresso", 5.99f,
                R.drawable.espresso_cf, "Cafés", Color.Blue, true
            ),
            Produto(
                "Latte", 11.99f, R.drawable.latte_img,
                "Cafés", Color.Blue, false
            ),
            Produto(
                "Iced Coffee", 13.99f,
                R.drawable.iced_coffee, "Cafés", Color.Blue, true
            )
        )
    }
}