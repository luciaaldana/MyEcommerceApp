package com.example.myecommerceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.myecommerceapp.ui.navigation.ProfileVanGraph
import com.example.myecommerceapp.ui.theme.MyEcommerceAppTheme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyEcommerceAppTheme {
                    ProfileVanGraph()
            }
        }
    }
}
