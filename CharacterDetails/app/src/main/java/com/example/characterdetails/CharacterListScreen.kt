package com.example.characterdetails


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@Composable
fun CharacterListScreen(navController: NavController) {
    val viewModel: CharacterViewModel = viewModel()
    val characters by viewModel.characters.collectAsState()

    LazyColumn {
        items(characters) { character ->
            CharacterItem(character = character, onClick = {
                navController.navigate("characterDetail/${character.id}")
            })
        }
    }
}

@Composable
fun CharacterItem(character: Character, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(8.dp)
    ) {
        AsyncImage(
            model = character.image, // URL or resource ID
            contentDescription = null,
            modifier = Modifier.size(60.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(text = character.name, style = MaterialTheme.typography.titleMedium)
            Text(text = character.species, style = MaterialTheme.typography.bodyMedium)
        }
    }
}
