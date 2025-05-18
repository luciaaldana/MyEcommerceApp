package com.example.myecommerceapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.myecommerceapp.ui.screens.*

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "products") {
        composable("login") { LoginScreen(navController) }
        composable("cart") { CartScreen(navController) }
        composable("products") { ProductListScreen(navController) }
    }
}
