package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_game2.*

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game2)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val homeBtn = findViewById<Button>(R.id.homeButton)
        homeBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

            shapesGameButton.setOnClickListener {
                val intent = Intent(this, ShapeGameActivity::class.java)
                startActivity(intent)
        }
            colorsGameButton.setOnClickListener {
                val intent = Intent(this, ColorGameActivity::class.java)
                startActivity(intent)
        }

            numbersGameButton.setOnClickListener {
                val intent = Intent(this, NumberGameActivity::class.java)
                startActivity(intent)
        }

            vehiclesGameButton.setOnClickListener {
                val intent = Intent(this, VehicleGameActivity::class.java)
                startActivity(intent)

        }

            animalsGameButton.setOnClickListener {
                val intent = Intent(this, AnimalGameActivity::class.java)
                startActivity(intent)
        }
    }
}