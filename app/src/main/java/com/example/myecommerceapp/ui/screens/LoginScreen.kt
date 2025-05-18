package com.example.myecommerceapp.ui.screens

import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myecommerceapp.MainActivity
import com.example.myecommerceapp.ui.sheets.RegisterBottomSheet
import com.example.myecommerceapp.ui.theme.MyEcommerceAppTheme

@Composable
fun LoginScreen(navController: NavController) {

    var showSheet by remember { mutableStateOf(false) }
    val context = LocalContext.current

    if(showSheet) {
        RegisterBottomSheet(onDismiss = {showSheet = false})
    }

    Scaffold { innerPadding ->
        Column(Modifier.padding(innerPadding).padding(16.dp)) {
            ShowProfileGreeting()
            Text(
                text = "Login Screen",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(innerPadding).padding(16.dp)
            )
            Button(
                onClick = { showSheet = true },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text(
                    text = "Don't have an account? Sign up",
                )
            }
            Button(onClick = {
                context.startActivity(
                    Intent(context, MainActivity::class.java)
                )}) {
                Text(
                    text = "Go back to products",
                )
            }
        }
    }
}

@Composable
fun ShowProfileGreeting(modifier: Modifier = Modifier) {
    Text(
        text = "Hello! Welcome to Profile Screen",
        style = MaterialTheme.typography.titleLarge
    )
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    val navController = rememberNavController()

    MyEcommerceAppTheme {
      LoginScreen(navController)
    }
}