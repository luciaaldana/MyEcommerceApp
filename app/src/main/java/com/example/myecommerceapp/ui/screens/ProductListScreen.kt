package com.example.myecommerceapp.ui.screens

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appmodule.Product
import com.example.appmodule.ProductRepositoryFake
import com.example.myecommerceapp.ProfileActivity
import com.example.myecommerceapp.ui.theme.MyEcommerceAppTheme
import androidx.compose.ui.platform.LocalContext


@Composable
fun ProductListScreen(navController: NavController) {
    val repo = ProductRepositoryFake()
    val products = repo.productList()
    val context = LocalContext.current


    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Product List Screen",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(innerPadding).padding(16.dp),
            )
            Row (
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(16.dp)
            ) {
                Button(onClick = {
                    context.startActivity(
                        Intent(context, ProfileActivity::class.java)
                    )
                }) {
                    Text("Sing In")
                }
                Button (onClick = { navController.navigate("cart") }) {
                    Text("Go to cart")
                }
            }

            ProductList(products)
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
    MyEcommerceAppTheme {
        val navController = rememberNavController()

        ProductListScreen(navController)
    }
}