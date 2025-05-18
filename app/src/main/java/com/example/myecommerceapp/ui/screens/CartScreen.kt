package com.example.myecommerceapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myecommerceapp.ui.theme.MyEcommerceAppTheme

@Composable
fun CartScreen(navController: NavController) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Shopping cart",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(innerPadding).padding(16.dp)
            )
            Text(
                text = "Your cart is empty",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(innerPadding).padding(16.dp)
            )
            Button (onClick = { navController.navigate("products") }) {
                Text("Go back to products")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CartScreenPreview() {
    MyEcommerceAppTheme {
        val navController = rememberNavController()

        CartScreen(navController)
    }
}

