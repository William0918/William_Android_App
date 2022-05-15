package com.example.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_animal_game.*


class AnimalGameActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_game)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        mQuestionsList = AnimalConstants.getAnimalQuestions()

        setQuestion()

        animalOption1.setOnClickListener(this)
        animalOption2.setOnClickListener(this)
        animalOption3.setOnClickListener(this)
        animalOption4.setOnClickListener(this)
        submitBtn.setOnClickListener(this)

        val homeBtn = findViewById<Button>(R.id.homeButton)
        homeBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion(){

        val question = mQuestionsList!![mCurrentPosition - 1]

        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size){
            submitBtn.text = "FINISH"
        }else{
            submitBtn.text = "SUBMIT"
        }

        animalProgressBar.progress = mCurrentPosition
        animalProgress.text = "$mCurrentPosition" + "/" + animalProgressBar.max

        animalQuestion.text = question.question
        animalImg.setImageResource(question.image)
        animalOption1.text = question.optionOne
        animalOption2.text = question.optionTwo
        animalOption3.text = question.optionThree
        animalOption4.text = question.optionFour
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0,animalOption1)
        options.add(1,animalOption2)
        options.add(2,animalOption3)
        options.add(3,animalOption4)

        for (option in options){
            option.setTextColor(Color.parseColor("#7a8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.animalOption1 ->{
                selectedOptionView(animalOption1,1)
            }
            R.id.animalOption2 ->{
                selectedOptionView(animalOption2,2)
            }
            R.id.animalOption3 ->{
                selectedOptionView(animalOption3,3)
            }
            R.id.animalOption4 ->{
                selectedOptionView(animalOption4,4)
            }
            R.id.submitBtn ->{
                if (mSelectedOptionPosition == 0){
                    mCurrentPosition ++

                    when {
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }else ->{
                            val intent = Intent(this,ResultActivity::class.java)
                            intent.putExtra(AnimalConstants.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(AnimalConstants.TOTAL_QUESTIONS, mQuestionsList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                }else{
                    val question = mQuestionsList?.get(mCurrentPosition - 1)
                    if(question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition,R.drawable.wrong_option_border_bg)
                    }else{
                        mCorrectAnswers++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mQuestionsList!!.size){
                        submitBtn.text = "FINISH"

                    }else{
                        submitBtn.text = "GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition = 0

                }
            }
        }
    }
    private fun answerView(answer: Int, drawableView: Int){
        when (answer){
            1 ->{
                animalOption1.background = ContextCompat.getDrawable(this,drawableView)
            }
            2 ->{
                animalOption2.background = ContextCompat.getDrawable(this,drawableView)
            }
            3 ->{
                animalOption3.background = ContextCompat.getDrawable(this,drawableView)
            }
            4 ->{
                animalOption4.background = ContextCompat.getDrawable(this,drawableView)
            }
        }
    }
    private fun selectedOptionView(tv:TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363a43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)

    }

}