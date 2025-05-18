package com.example.myecommerceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myecommerceapp.ui.theme.MyEcommerceAppTheme

class ProductDetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyEcommerceAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ShowProductDetailGreeting(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ShowProductDetailGreeting( modifier: Modifier = Modifier) {
    Text(
        text = "Hello! Welcome to Product Detail Screen",
        style = MaterialTheme.typography.titleLarge
    )
}