package com.example.fourpics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val totalQuestions = intent.getIntExtra(ConstantsL.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(ConstantsL.CORRECT_ANSWERS, 0)

        val tv_score = findViewById<TextView>(R.id.tv_score)
        tv_score.text = "Your Score is $correctAnswers out of $totalQuestions!"

        val btn_finish = findViewById<Button>(R.id.btn_finish)
        btn_finish.setOnClickListener{
            startActivity(Intent(this, ChooseActivity::class.java))
        }

        findViewById<Button>(R.id.btn_history).setOnClickListener { goToHistory() }
    }

    private fun goToHistory(){
        val intent = Intent(this, HistoryActivity::class.java)
        startActivity(intent)
    }
}