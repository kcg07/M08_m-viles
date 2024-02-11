package com.exercicisgokyle.uf1_pelisproyecto0.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.exercicisgokyle.uf1_pelisproyecto0.core.Constants
import com.exercicisgokyle.uf1_pelisproyecto0.models.PeliculaModel
import com.exercicisgokyle.uf1_pelisproyecto0.network.RetrofitClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class PeliculasViewModel: ViewModel() {
    private var _listaPeliculas = MutableLiveData<List<PeliculaModel>>()

    var listaPeliculas: LiveData<List<PeliculaModel>> = _listaPeliculas

    fun getPopular() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = RetrofitClient.apiService.getPopular(Constants.API_KEY)
            withContext(Dispatchers.Main) {
                _listaPeliculas.value = response.body()!!.resultados.sortedByDescending { it.nombrePelicula }
            }

        }
    }
}