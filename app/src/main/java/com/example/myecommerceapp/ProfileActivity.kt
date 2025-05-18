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

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyEcommerceAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {innerPadding ->
                    ShowProfileGreeting(Modifier.padding(innerPadding))
                }
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