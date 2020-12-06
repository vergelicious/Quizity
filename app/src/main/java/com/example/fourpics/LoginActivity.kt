package com.example.fourpics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.loginBtn).setOnClickListener {
            val user = findViewById<EditText>(R.id.username)
            val username = user.text.toString();

            val pass = findViewById<EditText>(R.id.password)
            val password = pass.text.toString();

            if (username.equals("reccalyn") && password.equals("1234")) {
                intent.putExtra(ConstantsL.USER_NAME, username.equals(""))
                login1()

            } else {
                Toast.makeText(this, "Incorrect username or password.", Toast.LENGTH_SHORT).show()
            }
        }
        findViewById<Button>(R.id.signUpBtn).setOnClickListener { signUp() }
    }
    private fun login1() {
        val intent = Intent(this, ChooseActivity::class.java)
        startActivity(intent)
        Toast.makeText(this, "You are now logged in", Toast.LENGTH_SHORT).show()
    }

    private fun signUp(){
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }
}