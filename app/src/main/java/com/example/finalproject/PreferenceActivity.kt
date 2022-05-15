package com.example.finalproject

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_preference.*

class PreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preference)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        loadData()

        saveButton.setOnClickListener{
            saveData()
        }

        val homeBtn = findViewById<Button>(R.id.homeButton)
        homeBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }


    private fun saveData() {
        val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.apply{
            putBoolean("BOOLEAN_KEY_SHAPE", shapeSwitch.isChecked)
            putBoolean("BOOLEAN_KEY_COLOR", colorSwitch.isChecked)
            putBoolean("BOOLEAN_KEY_NUMBER", numbersSwitch.isChecked)
            putBoolean("BOOLEAN_KEY_LETTER", letterSwitch.isChecked)
            putBoolean("BOOLEAN_KEY_VEHICLE", vehicleSwitch.isChecked)
            putBoolean("BOOLEAN_KEY_ANIMAL", animalSwitch.isChecked)
            putBoolean("BOOLEAN_KEY_UNDER_TWO", underTwoRadio.isChecked)
            putBoolean("BOOLEAN_KEY_OVER_TWO", overTwoRadioButton.isChecked)
        }.apply()
        Toast.makeText(this, "Preferences Saved",Toast.LENGTH_SHORT).show()    }

    private fun loadData() {
        val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val shapeBoolean = sharedPreferences.getBoolean("BOOLEAN_KEY_SHAPE",shapeSwitch.isChecked)
        val colorBoolean = sharedPreferences.getBoolean("BOOLEAN_KEY_COLOR",colorSwitch.isChecked)
        val numberBoolean = sharedPreferences.getBoolean("BOOLEAN_KEY_NUMBER",numbersSwitch.isChecked)
        val letterBoolean = sharedPreferences.getBoolean("BOOLEAN_KEY_LETTER",letterSwitch.isChecked)
        val vehicleBoolean = sharedPreferences.getBoolean("BOOLEAN_KEY_VEHICLE",vehicleSwitch.isChecked)
        val animalBoolean = sharedPreferences.getBoolean("BOOLEAN_KEY_ANIMAL",animalSwitch.isChecked)
        val underTwoBoolean = sharedPreferences.getBoolean("BOOLEAN_KEY_UNDER_TWO", underTwoRadio.isChecked)
        val overTwoBoolean = sharedPreferences.getBoolean("BOOLEAN_KEY_OVER_TWO", overTwoRadioButton.isChecked)

        shapeSwitch.isChecked = shapeBoolean
        colorSwitch.isChecked = colorBoolean
        numbersSwitch.isChecked = numberBoolean
        letterSwitch.isChecked = letterBoolean
        vehicleSwitch.isChecked = vehicleBoolean
        animalSwitch.isChecked = animalBoolean
        underTwoRadio.isChecked = underTwoBoolean
        overTwoRadioButton.isChecked = overTwoBoolean

    }
}