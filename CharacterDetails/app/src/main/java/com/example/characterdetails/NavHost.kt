package com.example.characterdetails


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun NavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "characterList") {
        composable("characterList") { CharacterListScreen(navController) }
        composable("characterDetail/{characterId}") { backStackEntry ->
            CharacterDetailScreen(
                characterId = backStackEntry.arguments?.getString("characterId")?.toIntOrNull() ?: 0
            )
        }
    }
}
