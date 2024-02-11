package com.exercicisgokyle.uf1_pelisproyecto0

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.exercicisgokyle.uf1_pelisproyecto0.databinding.ActivityMainBinding
import com.exercicisgokyle.uf1_pelisproyecto0.viewmodels.PeliculasViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: PeliculasViewModel
    private lateinit var adapterPeliculas: AdapterPeliculas

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[PeliculasViewModel::class.java]

        setupRecyclerView()

        viewModel.listaPeliculas.observe(this) {
            adapterPeliculas.listaPeliculas
            adapterPeliculas.notifyDataSetChanged()
            Log.d("MainActivity", "Data set to adapter")

            binding.cvCargar.setOnClickListener {
                viewModel.getPopular()
            }
        }
    }

    private fun setupRecyclerView() {
        val layoutManager = GridLayoutManager(this, 3)
        binding.ListaPeliculas.layoutManager = layoutManager
        adapterPeliculas = AdapterPeliculas(this, arrayListOf())
        binding.ListaPeliculas.adapter = adapterPeliculas
    }

}