package com.example.weekendbuddy.navigation

import com.example.weekendbuddy.ui.screens.splash.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.weekendbuddy.ui.screens.Home.HomeScreen
import com.example.weekendbuddy.ui.screens.login.LogInScreen


@Composable
fun AppNavHost (navController: NavHostController) {
    NavHost(navController = navController, startDestination= Splash.route){
        composable(Splash.route){
            SplashScreen( navigateToHome = {
                navController.navigate(Home.route) {
                    popUpTo(Splash.route) { inclusive = true }
                }
            },
                navigateToLogin = {
                    navController.navigate(LogIn.route) {
                        popUpTo(Splash.route) { inclusive = true }
                    }
                })
        }

        composable(LogIn.route) {
            LogInScreen()
        }

        composable(Home.route){
            HomeScreen()
        }
    }

}
