package com.example.fourpics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class HistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val questionsList = ConstantsH.getHistory()
        Log.i("Questions Size", "${questionsList.size}")

        val currentPosition = 1
        val question : HistoryQuestions? = questionsList[currentPosition -1]

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.progress = currentPosition

        val tv_progress = findViewById<TextView>(R.id.tv_progress)
        tv_progress.text = "$currentPosition" + "/" + progressBar.max

        val tv_question1 = findViewById<TextView>(R.id.tv_question1)
        tv_question1.text = question!!.question

        val iv_image = findViewById<ImageView>(R.id.iv_image)
        iv_image.setImageResource(question.image)

        val tv_option1 = findViewById<TextView>(R.id.tv_option1)
        tv_option1.text = question.optionOne
        val tv_option2 = findViewById<TextView>(R.id.tv_option2)
        tv_option2.text = question.optionTwo
    }
}