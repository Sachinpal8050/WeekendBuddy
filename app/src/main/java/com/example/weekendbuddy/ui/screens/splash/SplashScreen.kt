package com.example.weekendbuddy.ui.screens.splash

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(  navigateToHome: () -> Unit,
                   navigateToLogin: () -> Unit) {

    LaunchedEffect(Unit) {
        delay(2000)
        val isLoggedIn = false

        if (isLoggedIn) {
            navigateToHome()
        } else {
            navigateToLogin()
        }
    }
    Column() {
        Text(
            text = "Splash screen",
        )
    }
}