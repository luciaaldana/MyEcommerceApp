package com.example.myecommerceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appmodule.Product
import com.example.appmodule.ProductRepositoryFake
import com.example.myecommerceapp.ui.theme.MyEcommerceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyEcommerceAppTheme {
                val repo = ProductRepositoryFake()
                val products = repo.productList()

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProductList(products, Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ProductList(products: List<Product>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        items(products) { product ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.secondaryContainer)
            ) {
                Column (modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)){
                    Text(text = product.name,
                        style = MaterialTheme.typography.titleLarge)
                    Text(text = "Price: $${product.price}", style = MaterialTheme.typography.bodyLarge)
                    Text(text = product.description, style = MaterialTheme.typography.bodyMedium)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductListPreview() {
    val repo = ProductRepositoryFake()
    val products = repo.productList()

    MyEcommerceAppTheme {
        ProductList(products = products, modifier = Modifier)
    }
}