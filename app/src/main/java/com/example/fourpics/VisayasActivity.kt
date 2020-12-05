package com.example.fourpics

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class VisayasActivity : AppCompatActivity(), View.OnClickListener {
    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<VisayasQuestions>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visayas)

        mUserName = intent.getStringExtra(ConstantsV.USER_NAME)
        mQuestionsList = ConstantsV.getQuestionsV()

        setQuestion()

        findViewById<TextView>(R.id.tv_option1).setOnClickListener(this)
        findViewById<TextView>(R.id.tv_option2).setOnClickListener(this)
        findViewById<TextView>(R.id.tv_option3).setOnClickListener(this)
        findViewById<TextView>(R.id.tv_option4).setOnClickListener(this)

        findViewById<Button>(R.id.btnSubmit).setOnClickListener(this)
    }

    private fun setQuestion(){

        val question = mQuestionsList!![mCurrentPosition-1]

        defaultOptionsView()

        if(mCurrentPosition == mQuestionsList!!.size){
            val btnSubmit = findViewById<Button>(R.id.btnSubmit)
            btnSubmit.text = "FINISH"
        }else{
            val btnSubmit = findViewById<Button>(R.id.btnSubmit)
            btnSubmit.text = "SUBMIT"
        }

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.progress = mCurrentPosition
        val tv_progress = findViewById<TextView>(R.id.tv_progress)
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max

        val tv_question1 = findViewById<TextView>(R.id.tv_question1)
        tv_question1.text = question!!.question

        val iv_image = findViewById<ImageView>(R.id.iv_image)
        iv_image.setImageResource(question.image)

        val tv_option1 = findViewById<TextView>(R.id.tv_option1)
        tv_option1.text = question.optionOne
        val tv_option2 = findViewById<TextView>(R.id.tv_option2)
        tv_option2.text = question.optionTwo
        val tv_option3 = findViewById<TextView>(R.id.tv_option3)
        tv_option3.text = question.optionThree
        val tv_option4 = findViewById<TextView>(R.id.tv_option4)
        tv_option4.text = question.optionFour
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        val tv_option1 = findViewById<TextView>(R.id.tv_option1)
        options.add(0, tv_option1)
        val tv_option2 = findViewById<TextView>(R.id.tv_option2)
        options.add(1, tv_option2)
        val tv_option3 = findViewById<TextView>(R.id.tv_option3)
        options.add(2, tv_option3)
        val tv_option4 = findViewById<TextView>(R.id.tv_option4)
        options.add(3, tv_option4)

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_option1 -> {
                val tv_option1 = findViewById<TextView>(R.id.tv_option1)
                selectedOptionView(tv_option1, 1)
            }
            R.id.tv_option2 -> {
                val tv_option2 = findViewById<TextView>(R.id.tv_option2)
                selectedOptionView(tv_option2, 2)
            }
            R.id.tv_option3 -> {
                val tv_option3 = findViewById<TextView>(R.id.tv_option3)
                selectedOptionView(tv_option3, 3)
            }
            R.id.tv_option4 -> {
                val tv_option4 = findViewById<TextView>(R.id.tv_option4)
                selectedOptionView(tv_option4, 4)
            }
            R.id.btnSubmit -> {
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition ++

                    when{
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }
                        else ->{
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(ConstantsV.USER_NAME, mUserName)
                            intent.putExtra(ConstantsV.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(ConstantsV.TOTAL_QUESTIONS, mQuestionsList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                } else{
                    val question = mQuestionsList?.get(mCurrentPosition-1)
                    if(question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    }else{
                        mCorrectAnswers ++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mQuestionsList!!.size){
                        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
                        btnSubmit.text = "FINISH"
                    } else{
                        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
                        btnSubmit.text = "GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 ->{
                val tv_option1 = findViewById<TextView>(R.id.tv_option1)
                tv_option1.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 ->{
                val tv_option2 = findViewById<TextView>(R.id.tv_option2)
                tv_option2.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 ->{
                val tv_option3 = findViewById<TextView>(R.id.tv_option3)
                tv_option3.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 ->{
                val tv_option4 = findViewById<TextView>(R.id.tv_option4)
                tv_option4.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }
    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
    }
}