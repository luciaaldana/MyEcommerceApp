package com.example.myecommerceapp.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myecommerceapp.ui.theme.MyEcommerceAppTheme

@Composable
fun ProductListScreen() {
    Scaffold { innerPadding ->
        Text(
            text = "Product List Screen",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(innerPadding).padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProductListPreview() {
    MyEcommerceAppTheme {
        ProductListScreen()
    }
}