package com.exercicisgokyle.uf1_pelisproyecto0.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.exercicisgokyle.uf1_pelisproyecto0.core.constants
import com.exercicisgokyle.uf1_pelisproyecto0.models.PeliculaModel
import com.exercicisgokyle.uf1_pelisproyecto0.network.retrofitClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class PeliculasViewModel: ViewModel() {
    private var _listaPeliculas = MutableLiveData<List<PeliculaModel>>()

    var listaPeliculas: LiveData<List<PeliculaModel>> = _listaPeliculas

    fun getPopular() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = retrofitClient.apiService.getPopular(constants.API_KEY)
            withContext(Dispatchers.Main) {
                _listaPeliculas.value = response.body()!!.resultados.sortedByDescending { it.nombrePelicula }
            }

        }
    }
}