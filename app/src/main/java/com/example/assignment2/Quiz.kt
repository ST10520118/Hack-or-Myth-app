package com.example.assignment2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button
import android.widget.TextView

class Quiz : AppCompatActivity() {

    // Creating the Questions
    val question1  = "The Great Wall of China is visible from space."
    val question2  = "A group of flamingos is called a flamboyance."
    val question3  = "The human body has 206 bones."
    val question4  = "Lightning never strikes the same place twice."
    val question5  = "Goldfish have a memory of only 3 seconds."
    val question6  = "The Eiffel Tower is in Rome."
    val question7  = "Honey never spoils."
    val question8  = "Humans only use 10% of their brain."
    val question9  = "A day on Venus is longer than a year on Venus."
    val question10 = "Mount Everest is the tallest mountain in the world."

    // Creating the Answers
    val answer1  = false  // Not visible from space
    val answer2  = true   // A flamboyance is correct
    val answer3  = true   // 206 bones is correct
    val answer4  = false  // Lightning does strike the same place twice
    val answer5  = false  // Goldfish have longer memories
    val answer6  = false  // Eiffel Tower is in Paris
    val answer7  = true   // Honey never spoils
    val answer8  = false  // We use virtually all of our brain
    val answer9  = true   // A day on Venus is longer than its year
    val answer10 = true   // Mount Everest is tallest

    // Create variables to track score
    var currentQuestion = 0
    var score = 0

    // Creating UI items
    lateinit var txtQuestion: TextView
    lateinit var txtResult: TextView
    lateinit var btnTrue: Button
    lateinit var btnFalse: Button
    lateinit var btnQStart: Button
    lateinit var btnResults: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        // Link the UI elements
        txtQuestion = findViewById(R.id.txtQuestion)
        txtResult   = findViewById(R.id.txtResult)
        btnTrue     = findViewById(R.id.btnTrue)
        btnFalse    = findViewById(R.id.btnFalse)
        btnQStart   = findViewById(R.id.btnQStart)
        btnResults  = findViewById(R.id.btnResults)

        // When the screen loads, disable game controls
        btnTrue.isEnabled    = false
        btnFalse.isEnabled   = false
        btnResults.isEnabled = false
        txtQuestion.text     = "Press START to begin the quiz!"
        txtResult.text       = ""

        // START Button Clicked
        btnQStart.setOnClickListener {
            score           = 0
            currentQuestion = 1
            txtResult.text  = ""
            loadQuestion()
            btnTrue.isEnabled   = true
            btnFalse.isEnabled  = true
            btnQStart.isEnabled = false
        }

        // TRUE Button Clicked
        btnTrue.setOnClickListener {
            checkAnswer(true)
        }

        // FALSE Button Clicked
        btnFalse.setOnClickListener {
            checkAnswer(false)
        }

        // Clicked RESULTS Button
        btnResults.setOnClickListener {
            val intent = Intent(this, Results::class.java)
            intent.putExtra("FINAL_SCORE", score)
            intent.putExtra("TOTAL_QUESTIONS", 10)
            startActivity(intent)
        }
    }

    // Load the current question onto the screen
    fun loadQuestion() {
        if (currentQuestion == 1)  txtQuestion.text = "Q1: $question1"
        if (currentQuestion == 2)  txtQuestion.text = "Q2: $question2"
        if (currentQuestion == 3)  txtQuestion.text = "Q3: $question3"
        if (currentQuestion == 4)  txtQuestion.text = "Q4: $question4"
        if (currentQuestion == 5)  txtQuestion.text = "Q5: $question5"
        if (currentQuestion == 6)  txtQuestion.text = "Q6: $question6"
        if (currentQuestion == 7)  txtQuestion.text = "Q7: $question7"
        if (currentQuestion == 8)  txtQuestion.text = "Q8: $question8"
        if (currentQuestion == 9)  txtQuestion.text = "Q9: $question9"
        if (currentQuestion == 10) txtQuestion.text = "Q10: $question10"
    }

    // Check if the answer the user pressed is correct
    fun checkAnswer(userAnswer: Boolean) {

        var correctAnswer = false

        // Loop through all questions using if statements to find the current question
        for (i in 1..10) {
            if (i == currentQuestion) {
                if (i == 1)  correctAnswer = answer1
                if (i == 2)  correctAnswer = answer2
                if (i == 3)  correctAnswer = answer3
                if (i == 4)  correctAnswer = answer4
                if (i == 5)  correctAnswer = answer5
                if (i == 6)  correctAnswer = answer6
                if (i == 7)  correctAnswer = answer7
                if (i == 8)  correctAnswer = answer8
                if (i == 9)  correctAnswer = answer9
                if (i == 10) correctAnswer = answer10
                break
            }
        }

        // Check if the user was correct
        if (userAnswer == correctAnswer) {
            score++
            txtResult.text = "✅ Correct!"
        } else {
            txtResult.text = "❌ Wrong!"
        }

        // Move to the next question
        currentQuestion++

        // Check if there are more questions
        if (currentQuestion <= 10) {
            loadQuestion()
        } else {
            // All questions answered — end the game
            txtQuestion.text     = "Quiz complete! You scored $score out of 10."
            txtResult.text       = ""
            btnTrue.isEnabled    = false
            btnFalse.isEnabled   = false
            btnResults.isEnabled = true
            btnQStart.isEnabled  = false
        }
    }
}

