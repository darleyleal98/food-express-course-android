package com.darleyleal.foodexpress.ui.activities.mainactivity.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.darleyleal.foodexpress.data.Produto
import java.text.NumberFormat
import java.util.Locale

@Composable
fun ProductItem(produto: Produto) {
    Surface(
        shape = RoundedCornerShape(15.dp),
        shadowElevation = 4.dp
    ) {
        Column(
            modifier = Modifier
                .width(200.dp)
                .heightIn(250.dp, 300.dp)
        ) {
            val imageSize = 100.dp
            Box(
                modifier = Modifier
                    .background(
                        brush = Brush.horizontalGradient(
                            listOf(
                                produto.cor, Color.LightGray
                            )
                        )
                    )
                    .fillMaxWidth()
                    .height(imageSize)
            ) {
                Image(
                    painterResource(id = produto.imagem),
                    contentDescription = "Imagem do produto",
                    modifier = Modifier
                        .offset(y = imageSize / 2)
                        .clip(CircleShape)
                        .align(Alignment.Center),
                    contentScale = ContentScale.Fit
                )
            }
            Spacer(modifier = Modifier.height(imageSize / 2))
            Column(modifier = Modifier.padding(all = 16.dp)) {
                Text(
                    text = produto.nome,
                    fontWeight = FontWeight(700), maxLines = 2, overflow = TextOverflow.Ellipsis,
                    fontSize = 18.sp, modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = formatarMoedaParaReal(produto.valor),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    fontSize = 12.sp
                )
            }
        }
    }
}

private fun formatarMoedaParaReal(valor: Float): String {
    val moedaFormatada: NumberFormat = NumberFormat.getCurrencyInstance(
        Locale("pt", "BR")
    )
    return moedaFormatada.format(valor)
}