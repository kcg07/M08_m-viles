package com.exercicisgokyle.uf1_pelisproyecto0.models

import com.google.gson.annotations.SerializedName
import java.io.Serial

data class PeliculaModel(
    @SerializedName("id")
    var id: String,
    @SerializedName("original_title")
    var nombrePelicula: String,
    @SerializedName("overview")
    var sinopsis: String,
    @SerializedName("poster_path")
    var cartel: String,
    @SerializedName("release_date")
    var fechaLanzamiento: String,
    @SerializedName("vote_average")
    var votoPromedio: String
)
