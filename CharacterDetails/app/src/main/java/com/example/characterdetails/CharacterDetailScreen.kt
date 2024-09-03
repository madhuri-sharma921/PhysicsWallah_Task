package com.example.characterdetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter

@Composable
fun CharacterDetailScreen(characterId: Int) {
    val viewModel: CharacterViewModel = viewModel()
    val characters by viewModel.characters.collectAsState()
    val character = characters.find { it.id == characterId }

    LaunchedEffect(characterId) {

    }

    character?.let {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = it.name, style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Status: ${it.status}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Species: ${it.species}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Origin: ${it.origin.name}", style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Image(
                painter = rememberImagePainter(it.image),
                contentDescription = null,
                modifier = Modifier.size(200.dp)
            )
        }
    } ?: run {
        // Handle case where character is null
        Text(text = "Character not found", style = MaterialTheme.typography.bodyMedium)
    }
}
