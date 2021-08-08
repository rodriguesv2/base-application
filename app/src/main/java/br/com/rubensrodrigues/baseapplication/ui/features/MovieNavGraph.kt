package br.com.rubensrodrigues.baseapplication.ui.features

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun MovieNavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ""/*TODO*/
    ) {

    }
}