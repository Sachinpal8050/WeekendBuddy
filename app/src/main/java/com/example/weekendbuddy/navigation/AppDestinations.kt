package com.example.weekendbuddy.navigation

interface AppDestinations {
    val route: String
}

object Splash : AppDestinations {
    override val route = "splash"
}

object LogIn : AppDestinations {
    override val route = "login"
}

object Home : AppDestinations {
    override val route = "home"
}