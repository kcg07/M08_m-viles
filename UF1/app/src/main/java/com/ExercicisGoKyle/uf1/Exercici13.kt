package com.ExercicisGoKyle.uf1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Exercici13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercici13)

        val button = findViewById<Button>(R.id.b1)

        button.setOnClickListener() {
            Toast.makeText(this, "Registro Completo", Toast.LENGTH_SHORT).show()
        }
    }
}