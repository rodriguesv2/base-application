package br.com.rubensrodrigues.baseapplication.ui.features

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.rubensrodrigues.baseapplication.ui.MovieList

private enum class Graph {
    Home, SeeAll, Details
}

@Composable
fun MovieNavGraph() {
    val navController = rememberNavController()
    navController.enableOnBackPressed(true)
    NavHost(
        navController = navController,
        startDestination = Graph.Home.name
    ) {
        composable(route = Graph.Home.name) {
            //TODO
            MovieList()
        }
        composable(route = Graph.SeeAll.name) {
            //TODO
        }
        composable(route = Graph.Details.name) {
            //TODO
        }
    }
}