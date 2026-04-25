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

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class Score : AppCompatActivity() {

    // Declaring private variables
    private var tvFinalScore: TextView? = null
    private var tvMessage: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        // Retrieves the score passed from the Quiz screen

        val score = intent.getIntExtra("score", 0)

        // Declaring and initializing UI components
        tvFinalScore = findViewById(R.id.tvFinalScore)
        tvMessage = findViewById(R.id.tvMessage)

        val btnRestart = findViewById<Button>(R.id.btnRestart)
        val btnExit = findViewById<Button>(R.id.btnExit)

        tvFinalScore?.text = "Score: $score / 7"

        // The when expression is used here because it is cleaner than a chain of if else statements
        tvMessage?.text = when {
            score == 7 -> "Perfect score! You really know your facts."
            score >= 5 -> "Well done. You have a solid understanding of what works and what does not."
            score >= 3 -> "Not bad. A few of those are easy to get wrong."
            else -> "Keep at it. These are tricky and worth looking up."
        }

        btnRestart.setOnClickListener {
            restartQuiz()
        }

        btnExit.setOnClickListener {
            exitApp()
        }

    }

    private fun restartQuiz() {
        val intent = Intent(this, Quiz::class.java)
        startActivity(intent)
        finish()
    }

    private fun exitApp() {
        finishAffinity()
        exitProcess(0)
    }

}
