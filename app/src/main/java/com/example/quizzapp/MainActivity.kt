package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var edtTextUserName = findViewById<EditText>(R.id.edtTextUserName)
        //var btnRegister = findViewById<Button>(R.id.btnRegister)
        btnRegister.setOnClickListener {
            if(edtTextUserName.text.toString().isEmpty())
            {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }
            else
            {
                //Use Intent to move to the next Activity
                val intent = Intent(this, QuizUIActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}