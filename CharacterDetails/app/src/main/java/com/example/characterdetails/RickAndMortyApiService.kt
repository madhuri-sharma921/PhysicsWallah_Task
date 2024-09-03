package com.example.characterdetails

import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("character")
    suspend fun getCharacters(): CharacterResponse

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Int): Character
}
