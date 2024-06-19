package com.darleyleal.foodexpress.ui.activities.mainactivity.components.catalogitems

import androidx.compose.runtime.Composable
import com.darleyleal.foodexpress.ui.activities.mainactivity.components.ProductSection

/**Representam as categorias de itens na UI*/

@Composable
fun ListingPromotionsItems() {
    ProductSection("Promoções")
}

@Composable
fun SweetItems() {
    ProductSection("Doces")
}

@Composable
fun CoffeeItems() {
    ProductSection("Cafés")
}