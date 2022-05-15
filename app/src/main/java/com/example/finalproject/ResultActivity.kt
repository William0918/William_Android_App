package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val totalQuestionsA = intent.getIntExtra(AnimalConstants.TOTAL_QUESTIONS, 0)
        val correctAnswersA = intent.getIntExtra(AnimalConstants.CORRECT_ANSWERS, 0)

        scoreTextview.text = "Your score is $correctAnswersA out of $totalQuestionsA!"

        finishButton.setOnClickListener{
            startActivity(Intent(this, GameActivity::class.java))
        }
        val homeBtn = findViewById<Button>(R.id.homeButton)
        homeBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}