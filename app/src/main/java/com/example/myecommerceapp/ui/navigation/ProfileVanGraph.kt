package com.example.myecommerceapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.myecommerceapp.ui.screens.*

@Composable
fun ProfileVanGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(navController) }
    }
}
