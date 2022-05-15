package com.example.finalproject

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

import kotlinx.android.synthetic.main.activity_number_game.*

class NumberGameActivity : AppCompatActivity(), View.OnClickListener {
    private var mCurrentPosition:Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_game)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        mQuestionsList = NumberConstants.getNumberQuestions()

        setQuestion()

        option1.setOnClickListener(this)
        option2.setOnClickListener(this)
        option3.setOnClickListener(this)
        option4.setOnClickListener(this)
        submitBtn.setOnClickListener(this)

        val homeBtn = findViewById<Button>(R.id.homeButton)
        homeBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }

    private fun setQuestion(){

        val question = mQuestionsList!![mCurrentPosition - 1]

        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size){
            submitBtn.text = "FINISH"
        }else{
            submitBtn.text = "SUBMIT"
        }

        progressBar.progress = mCurrentPosition
        progress.text = "$mCurrentPosition" + "/" + progressBar.max

        numberQuestion.text = question.question
        numberImg.setImageResource(question.image)
        option1.text = question.optionOne
        option2.text = question.optionTwo
        option3.text = question.optionThree
        option4.text = question.optionFour
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0,option1)
        options.add(1,option2)
        options.add(2,option3)
        options.add(3,option4)

        for (option in options){
            option.setTextColor(Color.parseColor("#7a8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.option1 ->{
                selectedOptionView(option1,1)
            }
            R.id.option2 ->{
                selectedOptionView(option2,2)
            }
            R.id.option3 ->{
                selectedOptionView(option3,3)
            }
            R.id.option4 ->{
                selectedOptionView(option4,4)
            }
            R.id.submitBtn ->{
                if (mSelectedOptionPosition == 0){
                    mCurrentPosition ++

                    when {
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }else ->{
                        val intent = Intent(this,ResultActivity::class.java)
                        intent.putExtra(NumberConstants.CORRECT_ANSWERS, mCorrectAnswers)
                        intent.putExtra(NumberConstants.TOTAL_QUESTIONS, mQuestionsList!!.size)
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
                option1.background = ContextCompat.getDrawable(this,drawableView)
            }
            2 ->{
                option2.background = ContextCompat.getDrawable(this,drawableView)
            }
            3 ->{
                option3.background = ContextCompat.getDrawable(this,drawableView)
            }
            4 ->{
                option4.background = ContextCompat.getDrawable(this,drawableView)
            }
        }
    }
    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363a43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)

    }

}