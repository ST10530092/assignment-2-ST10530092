/*
* Project: Life Hack or Urban Myth Android App
 * Student Name: Kgopotso Thupi
 * Student Number: ST10530092
 * * Code Attribution and References:
 * The logic for button listeners, validation, when expressions, and array initialization
 * was adapted from Thupi (2026a), Thupi (2026b), and Thupi (2026c).
 * * Reference List:
 * Thupi, K. (2026a). The Social Spark App. [Unpublished project logic].
 * Thupi, K. (2026b). Gen App. [Unpublished project logic].
 * Thupi, K. (2026c). Flashcard App. [Unpublished project logic].
 */



package com.example.lifehackapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Declaring and initializing UI component
        val startBtn = findViewById<Button>(R.id.startBtn)

        //Start quiz function incorporated in the start button
        startBtn.setOnClickListener {
            goToQuiz()
        }

    }
    private fun goToQuiz() {
        val intent = Intent(this, Quiz::class.java)
        startActivity(intent)
    }

}