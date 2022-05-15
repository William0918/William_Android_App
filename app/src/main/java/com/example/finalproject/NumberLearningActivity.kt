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

class NumberLearningActivity : AppCompatActivity() {
    private val numberImg = intArrayOf(R.drawable.number0,
        R.drawable.number1, R.drawable.number2,R.drawable.number3,R.drawable.number4,R.drawable.number5, R.drawable.number6, R.drawable.number7,R.drawable.number8,R.drawable.number9)
    private var index = 0
    private val numberText = arrayListOf("Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_learning)

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


        imgSwitcher?.setImageResource(numberImg[index])
        learningText?.text = "This is the number " + numberText[index]
        val imgIn = AnimationUtils.loadAnimation(
            this, android.R.anim.slide_in_left)
        imgSwitcher?.inAnimation = imgIn

        val imgOut = AnimationUtils.loadAnimation(
            this, android.R.anim.slide_out_right)
        imgSwitcher?.outAnimation = imgOut


        val prev = findViewById<Button>(R.id.prev)
        prev.setOnClickListener {
            index = if (index - 1 >= 0) index - 1 else 2
            imgSwitcher?.setImageResource(numberImg[index])
            learningText?.text = "This is the number " + numberText[index]
        }

        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener {
            index = if (index + 1 < numberImg.size) index +1 else 0
            imgSwitcher?.setImageResource(numberImg[index])
            learningText?.text = "This is the number " + numberText[index]
        }

    }
}