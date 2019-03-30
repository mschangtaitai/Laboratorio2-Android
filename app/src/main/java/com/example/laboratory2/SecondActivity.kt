package com.example.laboratory2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val homeButton = findViewById<Button>(R.id.button10)
        homeButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val addButton = findViewById<Button>(R.id.button3)
        addButton.setOnClickListener {
            val changingText = findViewById<TextView>(R.id.textView)
            val num = changingText.text.toString().toInt() + 1
            changingText.setText(num)
        }

        val subButton = findViewById<Button>(R.id.button4)
        subButton.setOnClickListener {
            val changingText = findViewById<TextView>(R.id.textView)
            val num = changingText.text.toString().toInt() - 1
            changingText.setText(num)
        }
    }
}
