package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class PickingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picking2)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val homeBtn = findViewById<Button>(R.id.homeButton)
        homeBtn.setOnClickListener{
            val homeBtn = Intent(this, MainActivity::class.java)
            startActivity(homeBtn)
        }

        val learnBtn = findViewById<Button>(R.id.learnButton)
        learnBtn.setOnClickListener{
            val learnBtn = Intent(this, LearningActivity::class.java)
            startActivity(learnBtn)
        }

        val gameBtn = findViewById<Button>(R.id.gameButton)
        gameBtn.setOnClickListener{
            val gameBtn = Intent(this, GameActivity::class.java)
            startActivity(gameBtn)
        }
    }
}