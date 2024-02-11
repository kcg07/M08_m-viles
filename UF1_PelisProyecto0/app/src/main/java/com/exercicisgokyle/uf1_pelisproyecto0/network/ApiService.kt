package com.exercicisgokyle.uf1_pelisproyecto0.network

import com.exercicisgokyle.uf1_pelisproyecto0.network.response.PeliculaResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("popular")
    suspend fun getPopular(
        @Query("api_key") apiKey: String
    ): Response<PeliculaResponse>
}