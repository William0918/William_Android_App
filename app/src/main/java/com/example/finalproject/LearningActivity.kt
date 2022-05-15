package com.example.finalproject

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_learning2.*
import kotlinx.android.synthetic.main.activity_preference.*

class LearningActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learning2)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val homeBtn = findViewById<Button>(R.id.homeButton)
        homeBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        shapesLearnButton.setOnClickListener {
                val intent = Intent(this, ShapeLearningActivity::class.java)
                startActivity(intent)

        }

            colorsLearnButton.setOnClickListener {
                val intent = Intent(this, ColorLearningActivity::class.java)
                startActivity(intent)

        }

            numbersLearnButton.setOnClickListener {
                val intent = Intent(this, NumberLearningActivity::class.java)
                startActivity(intent)
        }

            lettersLearnButton.setOnClickListener {
                val intent = Intent(this, LetterLearningActivity::class.java)
                startActivity(intent)
        }

            vehiclesLearnButton.setOnClickListener {
                val intent = Intent(this, VehicleLearningActivity::class.java)
                startActivity(intent)
        }

            animalsLearnButton.setOnClickListener {
                val intent = Intent(this, AnimalLearningActivity::class.java)
                startActivity(intent)
        }

    }

}





