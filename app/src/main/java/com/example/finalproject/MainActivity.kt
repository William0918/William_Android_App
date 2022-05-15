package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val pickingHomeButton = findViewById<Button>(R.id.learnButton)
        pickingHomeButton.setOnClickListener{
            val intent = Intent(this, PickingActivity::class.java)
            startActivity(intent)
        }
        val preferenceButton = findViewById<Button>(R.id.preferenceButton)
        preferenceButton.setOnClickListener{
            val intent = Intent(this, PreferenceActivity::class.java)
            startActivity(intent)
        }
        val helpButton = findViewById<Button>(R.id.helpButton)
        helpButton.setOnClickListener{
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
        }
    }
}