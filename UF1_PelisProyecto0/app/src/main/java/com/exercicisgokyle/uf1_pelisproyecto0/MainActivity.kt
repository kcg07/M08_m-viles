package com.exercicisgokyle.uf1_pelisproyecto0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.exercicisgokyle.uf1_pelisproyecto0.viewmodels.PeliculasViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: PeliculasViewModel
    private lateinit var adapterPeliculas: AdapterPeliculas

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[PeliculasViewModel::class.java]

        setupRecyclerView()

        viewModel.listaPeliculas.observe(this) {
            adapterPeliculas.listaPeliculas
            adapterPeliculas.notifyDataSetChanged()
            Log.d("MainActivity", "Data set to adapter")
        }
    }

    private fun setupRecyclerView() {
        val recyclerView: RecyclerView = findViewById(R.id.Lista_Peliculas)
        val layoutManager = GridLayoutManager(this, 3)
        recyclerView.layoutManager = layoutManager

        adapterPeliculas = AdapterPeliculas(this, arrayListOf())
        recyclerView.adapter = adapterPeliculas
    }

}