package com.example.laboratory2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var trainings = HistoryList(lapHistory = ArrayList())
        trainings.add(1)
        trainings.add(4)
        trainings.add(2)
        trainings.add(3)

        var listView = findViewById<ListView>(R.id.list_item)
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,trainings.lapHistory)
        listView.adapter = adapter

        val nextButton = findViewById<Button>(R.id.button2)
        nextButton.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        val eraseButton = findViewById<Button>(R.id.button)
        eraseButton.setOnClickListener{
            trainings.add(34)
            trainings.lapHistory.clear()
            }
    }

}
