package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_animal_learning.*

class ShapeLearningActivity : AppCompatActivity() {
    private val shapes = intArrayOf(R.drawable.shapecircle,
        R.drawable.shapediamond, R.drawable.shapeheart,R.drawable.shapeoval,R.drawable.shaperectangle,R.drawable.shapesquare, R.drawable.shapestar, R.drawable.shapetriangle)
    private var index = 0
    private val shapeText = arrayListOf("Circle","Diamond","Heart","Oval","Rectangle","Square","Star","Triangle")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shape_learning)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val homeBtn = findViewById<Button>(R.id.homeButton)
        homeBtn.setOnClickListener {
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


            imgSwitcher?.setImageResource(shapes[index])
            learningText?.text = "This is a " + shapeText[index]
            val imgIn = AnimationUtils.loadAnimation(
                this, android.R.anim.slide_in_left)
            imgSwitcher?.inAnimation = imgIn

            val imgOut = AnimationUtils.loadAnimation(
                this, android.R.anim.slide_out_right)
            imgSwitcher?.outAnimation = imgOut


            val prev = findViewById<Button>(R.id.prev)
            prev.setOnClickListener {
                index = if (index - 1 >= 0) index - 1 else 2
                imgSwitcher?.setImageResource(shapes[index])
                learningText?.text = "this is a " + shapeText[index]
            }

            val next = findViewById<Button>(R.id.next)
            next.setOnClickListener {
                index = if (index + 1 < shapes.size) index +1 else 0
                imgSwitcher?.setImageResource(shapes[index])
                learningText?.text = "This is a " + shapeText[index]
            }
    }
}