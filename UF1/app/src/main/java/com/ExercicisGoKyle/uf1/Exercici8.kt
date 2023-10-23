package com.ExercicisGoKyle.uf1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Exercici8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercici8)

        val editText = findViewById<EditText>(R.id.eText)
        val button = findViewById<Button>(R.id.b1)
        val textView = findViewById<TextView>(R.id.tView)

        button.setOnClickListener() {
            val text = editText.text.toString()
            textView.text = text
        }
    }
}