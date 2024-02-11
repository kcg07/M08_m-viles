package com.exercicisgokyle.projecte1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar : Toolbar = findViewById(R.id.toolbar)
        toolbar.title = "Pokédex"

        setSupportActionBar(toolbar)
    }

    private fun setSupportActionBar(toolbar: Toolbar) {

    }
}