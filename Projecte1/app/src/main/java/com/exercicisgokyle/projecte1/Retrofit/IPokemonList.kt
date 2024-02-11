package com.exercicisgokyle.projecte1.Retrofit

import com.exercicisgokyle.projecte1.Model.Pokedex
import io.reactivex.Observable
import retrofit2.http.GET

interface IPokemonList {
    @get:GET("pokedex.json")
    val listPokemon: Observable<Pokedex>
}