package com.example.fourpics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ChooseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)

        findViewById<Button>(R.id.btnLuzon).setOnClickListener { goToLuzon() }
        findViewById<Button>(R.id.btnVisayas).setOnClickListener { goToVisayas() }
        findViewById<Button>(R.id.btnMindanao).setOnClickListener { goToMindanao() }
        findViewById<Button>(R.id.btnHistory).setOnClickListener { goToHistory() }

    }
    private fun goToLuzon(){
        val intent = Intent(this, LuzonActivity::class.java)
        startActivity(intent)
        Toast.makeText(this, "You're now in the place of Luzon!", Toast.LENGTH_SHORT).show()
    }
    private fun goToVisayas(){
        val intent = Intent(this, VisayasActivity::class.java)
        startActivity(intent)
        Toast.makeText(this, "You're now in the place of Visayas!", Toast.LENGTH_SHORT).show()
    }
    private fun goToMindanao(){
        val intent = Intent(this, MindanaoActivity::class.java)
        startActivity(intent)
        Toast.makeText(this, "You're now in the place of Mindanao!", Toast.LENGTH_SHORT).show()
    }
    private fun goToHistory(){
        val intent = Intent(this, HistoryActivity::class.java)
        startActivity(intent)
    }
}