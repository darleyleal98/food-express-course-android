package com.darleyleal.foodexpress.ui.activities.mainactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.darleyleal.foodexpress.ui.activities.mainactivity.components.App
import com.darleyleal.foodexpress.ui.theme.FoodExpressTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodExpressTheme {
                Surface {
                    App()
                }
            }
        }
    }
}