package com.darleyleal.foodexpress.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.darleyleal.foodexpress.ui.activities.mainactivity.components.MostrarNomeDoApp
import com.darleyleal.foodexpress.ui.activities.mainactivity.components.catalogitems.CoffeeItems
import com.darleyleal.foodexpress.ui.activities.mainactivity.components.catalogitems.ListingPromotionsItems
import com.darleyleal.foodexpress.ui.activities.mainactivity.components.catalogitems.SweetItems

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState(), enabled = true)) {
        MostrarNomeDoApp()
        ListingPromotionsItems()
        SweetItems()
        CoffeeItems()
    }
}