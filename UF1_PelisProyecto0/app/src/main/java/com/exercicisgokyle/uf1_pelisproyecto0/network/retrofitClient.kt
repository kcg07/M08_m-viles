package com.exercicisgokyle.uf1_pelisproyecto0.network

import com.exercicisgokyle.uf1_pelisproyecto0.core.constants
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object retrofitClient {
    val apiService: apiService by lazy {
        Retrofit.Builder()
            .baseUrl(constants.URL_BASE)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(apiService::class.java)
    }
}