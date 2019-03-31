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
            findViewById<TextView>(R.id.textView).text = (findViewById<TextView>(R.id.textView).text.toString().toInt() + 1).toString()
        }

        val subButton = findViewById<Button>(R.id.button4)
        subButton.setOnClickListener {
            findViewById<TextView>(R.id.textView).text = (findViewById<TextView>(R.id.textView).text.toString().toInt() - 1).toString()
        }

        val lap1Button = findViewById<Button>(R.id.button5)
        lap1Button.setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "1"
        }

        val lap3Button = findViewById<Button>(R.id.button6)
        lap3Button.setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "3"
        }

        val lap5Button = findViewById<Button>(R.id.button7)
        lap5Button.setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "5"
        }

        val lap10Button = findViewById<Button>(R.id.button8)
        lap10Button.setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "10"
        }

        val sendButton = findViewById<Button>(R.id.button9)
        sendButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("message", findViewById<TextView>(R.id.textView).text.toString())
            startActivity(intent)
        }
    }
}
