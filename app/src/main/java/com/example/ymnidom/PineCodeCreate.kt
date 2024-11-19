package com.example.ymnidom

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


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
    private lateinit var imagepin2: ImageView
    private lateinit var imagepin3: ImageView
    private lateinit var imagepin4: ImageView
    private var nopin = R.drawable.pinnoractive
    private var pin = R.drawable.pinactive
    private var const = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pinecodecreate)


        var myData = SharedPreferenceHelper.loadData(this)

        button1.setOnClickListener {
            if (const == 0) {
                imagepin1.setImageResource(pin);
            }
            if (const == 1) {
                imagepin2.setImageResource(pin);
            }
            if (const == 2) {
                imagepin3.setImageResource(pin);
            }
            if (const == 3) {
                imagepin4.setImageResource(pin);
                val intent = Intent(this, Adress::class.java)
                startActivity(intent)
            }
           const += 1
            myData.numbers.add(1)
            SharedPreferenceHelper.saveData(this, myData)
        }

        button2.setOnClickListener {
            if (const == 0) {
                imagepin1.setImageResource(pin);
            }
            if (const == 1) {
                imagepin2.setImageResource(pin);
            }
            if (const == 2) {
                imagepin3.setImageResource(pin);
            }
            if (const == 3) {
                imagepin4.setImageResource(pin);
                val intent = Intent(this, Adress::class.java)
                startActivity(intent)
            }
            const += 1
            myData.numbers.add(2)
            SharedPreferenceHelper.saveData(this, myData)
        }

        button3.setOnClickListener {
            if (const == 0) {
                imagepin1.setImageResource(pin);
            }
            if (const == 1) {
                imagepin2.setImageResource(pin);
            }
            if (const == 2) {
                imagepin3.setImageResource(pin);
            }
            if (const == 3) {
                imagepin4.setImageResource(pin);
                val intent = Intent(this, Adress::class.java)
                startActivity(intent)
            }
            const += 1
            myData.numbers.add(3)
            SharedPreferenceHelper.saveData(this, myData)
        }

        button4.setOnClickListener {
            if (const == 0) {
                imagepin1.setImageResource(pin);
            }
            if (const == 1) {
                imagepin2.setImageResource(pin);
            }
            if (const == 2) {
                imagepin3.setImageResource(pin);
            }
            if (const == 3) {
                imagepin4.setImageResource(pin);
                val intent = Intent(this, Adress::class.java)
                startActivity(intent)
            }
            const += 1
            myData.numbers.add(4)
            SharedPreferenceHelper.saveData(this, myData)
        }

        button5.setOnClickListener {
            if (const == 0) {
                imagepin1.setImageResource(pin);
            }
            if (const == 1) {
                imagepin2.setImageResource(pin);
            }
            if (const == 2) {
                imagepin3.setImageResource(pin);
            }
            if (const == 3) {
                imagepin4.setImageResource(pin);
                val intent = Intent(this, Adress::class.java)
                startActivity(intent)
            }
            const += 1
            myData.numbers.add(5)
            SharedPreferenceHelper.saveData(this, myData)
        }

        button6.setOnClickListener {
            if (const == 0) {
                imagepin1.setImageResource(pin);
            }
            if (const == 1) {
                imagepin2.setImageResource(pin);
            }
            if (const == 2) {
                imagepin3.setImageResource(pin);
            }
            if (const == 3) {
                imagepin4.setImageResource(pin);
                val intent = Intent(this, Adress::class.java)
                startActivity(intent)
            }
            const += 1
            myData.numbers.add(6)
            SharedPreferenceHelper.saveData(this, myData)
        }
        button7.setOnClickListener {
            if (const == 0) {
                imagepin1.setImageResource(pin);
            }
            if (const == 1) {
                imagepin2.setImageResource(pin);
            }
            if (const == 2) {
                imagepin3.setImageResource(pin);
            }
            if (const == 3) {
                imagepin4.setImageResource(pin);
                val intent = Intent(this, Adress::class.java)
                startActivity(intent)
            }
            const += 1
            myData.numbers.add(7)
            SharedPreferenceHelper.saveData(this, myData)
        }
        button8.setOnClickListener {
            if (const == 0) {
                imagepin1.setImageResource(pin);
            }
            if (const == 1) {
                imagepin2.setImageResource(pin);
            }
            if (const == 2) {
                imagepin3.setImageResource(pin);
            }
            if (const == 3) {
                imagepin4.setImageResource(pin);
                val intent = Intent(this, Adress::class.java)
                startActivity(intent)
            }
            const += 1
            myData.numbers.add(8)
            SharedPreferenceHelper.saveData(this, myData)
        }
        button9.setOnClickListener {
            if (const == 0) {
                imagepin1.setImageResource(pin);
            }
            if (const == 1) {
                imagepin2.setImageResource(pin);
            }
            if (const == 2) {
                imagepin3.setImageResource(pin);
            }
            if (const == 3) {
                imagepin4.setImageResource(pin);
                val intent = Intent(this, Adress::class.java)
                startActivity(intent)
            }
            const += 1
            myData.numbers.add(9)
            SharedPreferenceHelper.saveData(this, myData)
        }



    }
}