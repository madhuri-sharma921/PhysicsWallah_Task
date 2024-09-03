package com.example.characterdetails



import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CharacterViewModel : ViewModel() {
    private val _characters = MutableStateFlow<List<Character>>(emptyList())
    val characters: StateFlow<List<Character>> = _characters

    init {

        _characters.value = listOf(
            Character(
                id = 1,
                name = "Rick Sanchez",
                status = "Alive",
                species = "Human",
                gender = "Male",
                origin = Origin(name = "Earth", url = "https://example.com/origin/earth"),
                location = Location(name = "Earth", url = "https://rickandmortyapi.com/api/location/1"),
                image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
                episode = listOf("S01E01", "S01E02")
            ),
            Character(
                id = 2,
                name = "Morty Smith",
                status = "Alive",
                species = "Human",
                gender = "Male",
                origin = Origin(name = "Earth", url = "https://example.com/origin/earth"),
                location = Location(name = "Earth", url = "https://example.com/location/earth"),
                image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg",
                episode = listOf("S01E01", "S01E03")
            ),
            Character(
                id = 3,
                name = "Summer Smith",
                status = "Alive",
                species = "Human",
                gender = "Male",
                origin = Origin(name = "Earth", url = "https://example.com/origin/earth"),
                location = Location(name = "Earth", url = "https://example.com/location/earth"),
                image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg",
                episode = listOf("S01E01", "S01E03")
            ),
            Character(
                id = 4,
                name = "Beth  Smith",
                status = "Alive",
                species = "Human",
                gender = "Female",
                origin = Origin(name = "Earth", url = "https://example.com/origin/earth"),
                location = Location(name = "Earth", url = "https://example.com/location/earth"),
                image = "https://rickandmortyapi.com/api/character/avatar/4.jpeg",
                episode = listOf("S01E01", "S01E03")
            )
        )
    }
}
