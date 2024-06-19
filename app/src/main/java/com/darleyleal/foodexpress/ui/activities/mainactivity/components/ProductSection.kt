package com.darleyleal.foodexpress.ui.activities.mainactivity.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.darleyleal.foodexpress.data.Produto
import com.darleyleal.foodexpress.data.ProdutoRepository

@Composable
fun ProductSection(
    categoria: String,
    listaDeProdutos: List<Produto> = ProdutoRepository.listaDeProdutos
) {
    Column(
        modifier = Modifier
            .padding(top = 8.dp, bottom = 16.dp)
    ) {
        Text(
            text = categoria,
            fontSize = 16.sp,
            fontWeight = FontWeight(600),
            modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)
        )
        Row(
            modifier = Modifier
                .horizontalScroll(state = ScrollState(0), enabled = true)
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            for (item in listaDeProdutos) {
                if (item.categoria == categoria) {
                    ProductItem(item)
                } else if (categoria == "Promoções" && item.promocao) {
                    ProductItem(item)
                }
            }
        }
    }
}