package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LetterLearningActivity : AppCompatActivity() {
    private val letters = intArrayOf(R.drawable.lettera,
        R.drawable.letterb, R.drawable.letterc,R.drawable.letterd,R.drawable.lettere,R.drawable.letterf,R.drawable.letterg,
        R.drawable.letterh, R.drawable.letteri,R.drawable.letterj,R.drawable.letterk,R.drawable.letterl,R.drawable.letterm,
        R.drawable.lettern, R.drawable.lettero,R.drawable.letterp,R.drawable.letterq,R.drawable.letterr,R.drawable.letter_s,
        R.drawable.lettert, R.drawable.letteru,R.drawable.letterv,R.drawable.letterw,R.drawable.letterx,R.drawable.lettery,
        R.drawable.letterz)
    private var index = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letter_learning)

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


        imgSwitcher?.setImageResource(letters[index])

        val imgIn = AnimationUtils.loadAnimation(
            this, android.R.anim.slide_in_left)
        imgSwitcher?.inAnimation = imgIn

        val imgOut = AnimationUtils.loadAnimation(
            this, android.R.anim.slide_out_right)
        imgSwitcher?.outAnimation = imgOut


        val prev = findViewById<Button>(R.id.prev)
        prev.setOnClickListener {
            index = if (index - 1 >= 0) index - 1 else 2
            imgSwitcher?.setImageResource(letters[index])
        }

        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener {
            index = if (index + 1 < letters.size) index +1 else 0
            imgSwitcher?.setImageResource(letters[index])
        }

    }
}