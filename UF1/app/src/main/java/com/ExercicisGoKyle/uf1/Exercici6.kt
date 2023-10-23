package com.ExercicisGoKyle.uf1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Exercici6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercici6)

        val Button = findViewById<Button>(R.id.b1)

        Button.setOnClickListener() {
            Toast.makeText(this, "Botón apretado", Toast.LENGTH_SHORT).show()
        }
    }
}