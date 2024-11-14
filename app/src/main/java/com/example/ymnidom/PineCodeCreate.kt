package com.example.ymnidom

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class PineCodeCreate: AppCompatActivity() {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var imagepin1: ImageView
    private var nopin = R.drawable.pinnoractive
    private var pin = R.drawable.pinactive

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pinecodecreate)

        button1 = findViewById(R.id.btn1)
        button2 = findViewById(R.id.btn2)
        button3 = findViewById(R.id.btn3)
        button4 = findViewById(R.id.btn4)
        button5 = findViewById(R.id.btn5)
        button6 = findViewById(R.id.btn6)
        button7 = findViewById(R.id.btn7)
        button8 = findViewById(R.id.btn8)
        button9 = findViewById(R.id.btn9)
        imagepin1 = findViewById(R.id.pin1)
        //РОДОЛЖТЬ ТУТ ПИНЫ РАСТАВИТЬ И СВЕРХУ


        var myData = SharedPreferenceHelper.loadData(this)

        button1.setOnClickListener {
            if ()
            myData.numbers.add(1)
            SharedPreferenceHelper.saveData(this, myData)
        }

        button2.setOnClickListener {
            myData.numbers.add(2)
            SharedPreferenceHelper.saveData(this, myData)
        }

        }



    }
