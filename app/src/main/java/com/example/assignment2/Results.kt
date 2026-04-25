package com.example.assignment2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView

class Results : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_results)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Link UI elements
        val txtFinalScore = findViewById<TextView>(R.id.txtFinalScore)
        val txtMemo = findViewById<TextView>(R.id.txtMemo)
        val btnShowMemo = findViewById<Button>(R.id.btnShowMemo)
        val btnClose = findViewById<Button>(R.id.btnClose)

        // Get the score passed from the Quiz screen
        val finalScore = intent.getIntExtra("FINAL_SCORE", 0)
        val totalQuestions = intent.getIntExtra("TOTAL_QUESTIONS", 10)

        // When the screen loads, show the final score and hide the memo
        txtFinalScore.text = "You scored $finalScore out of $totalQuestions!"
        txtMemo.text = ""

        // The MEMO Button is clicked
        btnShowMemo.setOnClickListener {
            txtMemo.text =
                "Q1:  The Great Wall of China is visible from space. \nANSWER: FALSE\n\n" +
                        "Q2:  A group of flamingos is called a flamboyance. \nANSWER: TRUE\n\n" +
                        "Q3:  The human body has 206 bones. \nANSWER: TRUE\n\n" +
                        "Q4:  Lightning never strikes the same place twice. \nANSWER: FALSE\n\n" +
                        "Q5:  Goldfish have a memory of only 3 seconds. \nANSWER: FALSE\n\n" +
                        "Q6:  The Eiffel Tower is in Rome. \nANSWER: FALSE\n\n" +
                        "Q7:  Honey never spoils. \nANSWER: TRUE\n\n" +
                        "Q8:  Humans only use 10% of their brain. \nANSWER: FALSE\n\n" +
                        "Q9:  A day on Venus is longer than a year on Venus. \nANSWER: TRUE\n\n" +
                        "Q10: Mount Everest is the tallest mountain in the world. \nANSWER: TRUE"
        }

        //  CLOSE Button is clicked
        btnClose.setOnClickListener {
            finishAffinity()  // Closes the app completely
        }
    }
}