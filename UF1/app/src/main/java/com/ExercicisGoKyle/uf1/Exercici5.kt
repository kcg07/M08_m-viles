package com.ExercicisGoKyle.uf1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Exercici5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercici5)

        val Button = findViewById<Button>(R.id.b1)

        Button.setOnClickListener {
            Log.d("botón1", "boton apretado")
        }
    }
}