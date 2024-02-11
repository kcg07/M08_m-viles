package com.exercicisgokyle.uf1_pelisproyecto0.network.response

import com.exercicisgokyle.uf1_pelisproyecto0.models.PeliculaModel
import com.google.gson.annotations.SerializedName

data class PeliculaResponse(
    @SerializedName("results")
    var resultados: List<PeliculaModel>
)
