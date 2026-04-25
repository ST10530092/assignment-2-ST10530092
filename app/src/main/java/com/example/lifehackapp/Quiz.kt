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
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Quiz : AppCompatActivity() {

    // Declaring and initializing UI components
    private var index = 0
    private var score = 0

    private var questionTxt: TextView? = null
    private var questionCountTxt: TextView? = null
    private var feedbackTxt: TextView? = null
    private var hackBtn: Button? = null
    private var mythBtn: Button? = null
    private var nextBtn: Button? = null

    // Questions based on commonly debated life hacks and myths
    private val questions = arrayOf(
        "Drinking a glass of water before a meal can help reduce how much you eat.",
        "Humans only use about 10% of their brain at any given time.",
        "Placing a wet phone in a bag of rice helps draw out moisture effectively.",
        "Getting less than 6 hours of sleep regularly has no effect on memory.",
        "Chewing gum while studying can help with concentration and recall.",
        "Reading in low light causes permanent damage to your eyesight.",
        "Drinking coffee immediately after waking up is less effective than waiting 90 minutes."
    )

    // Answers are aligned to each question above
    private val answers = booleanArrayOf(true, false, false, false, true, false, true)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        questionTxt = findViewById(R.id.questionTxt)
        questionCountTxt = findViewById(R.id.questionCountTxt)
        feedbackTxt = findViewById(R.id.feedbackTxt)
        hackBtn = findViewById(R.id.hackBtn)
        mythBtn = findViewById(R.id.mythBtn)
        nextBtn = findViewById(R.id.nextBtn)

        loadQuestion()
        //Hack or Myth functions incorporated in these buttons
        hackBtn?.setOnClickListener {
            checkAnswer(true)
        }

        mythBtn?.setOnClickListener {
            checkAnswer(false)
        }

        nextBtn?.setOnClickListener {
            goToNext()
        }

    }

    //This Loads the current question, clears any previous feedback and re-enables both answer buttons
    private fun loadQuestion() {
        questionTxt?.text = questions[index]
        questionCountTxt?.text = "Question ${index + 1} of ${questions.size}"
        feedbackTxt?.text = ""
        nextBtn?.visibility = View.INVISIBLE
        hackBtn?.isEnabled = true
        mythBtn?.isEnabled = true
    }

    private fun checkAnswer(userAnswer: Boolean) {
        // Declaration of the correct answer for the current question
        val correct = answers[index]

        // Disable both buttons so the user cannot change their answer
        hackBtn?.isEnabled = false
        mythBtn?.isEnabled = false

        if (userAnswer == correct) {
            score++
            feedbackTxt?.text = "Correct!"
        } else {
            feedbackTxt?.text = "Incorrect!"
        }

        nextBtn?.visibility = View.VISIBLE
    }

    //navigation to the Score screen if all questions are done
    private fun goToNext() {
        index++
        if (index < questions.size) {
            loadQuestion()
        } else {
            val intent = Intent(this, Score::class.java)
            intent.putExtra("score", score)
            startActivity(intent)
        }
    }

}
