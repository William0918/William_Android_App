package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_animal_learning.*

class VehicleLearningActivity : AppCompatActivity() {
    private val vehicles = intArrayOf(R.drawable.vehiclebike,
        R.drawable.vehicleboat, R.drawable.vehiclecar,R.drawable.vehicleplane,R.drawable.vehicletruck)
    private var index = 0
    private val vehicletext = arrayListOf("Bike","Boat","Car","Plane","Truck")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vehicle_learning)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val homeBtn = findViewById<Button>(R.id.homeButton)
        homeBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val imgSwitcher = findViewById<ImageSwitcher>(R.id.imgSw)

        imgSwitcher?.setFactory {
            val imgView = ImageView(applicationContext)
            imgView.scaleType = ImageView.ScaleType.FIT_CENTER
            imgView.setPadding(8, 8, 8, 8)
            imgView
        }


        imgSwitcher?.setImageResource(vehicles[index])
        learningText?.text = "This is a " + vehicletext[index]
        val imgIn = AnimationUtils.loadAnimation(
            this, android.R.anim.slide_in_left)
        imgSwitcher?.inAnimation = imgIn

        val imgOut = AnimationUtils.loadAnimation(
            this, android.R.anim.slide_out_right)
        imgSwitcher?.outAnimation = imgOut


        val prev = findViewById<Button>(R.id.prev)
        prev.setOnClickListener {
            index = if (index - 1 >= 0) index - 1 else 2
            imgSwitcher?.setImageResource(vehicles[index])
            learningText?.text = "this is a " + vehicletext[index]
        }

        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener {
            index = if (index + 1 < vehicles.size) index +1 else 0
            imgSwitcher?.setImageResource(vehicles[index])
            learningText?.text = "This is a " + vehicletext[index]
        }

    }
}