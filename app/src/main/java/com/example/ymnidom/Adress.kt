package com.example.ymnidom

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Adress: AppCompatActivity() {

    private lateinit var addressEditText: EditText
    private lateinit var savebutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adress)

        addressEditText = findViewById(R.id.addressInput)
        savebutton = findViewById(R.id.saveButton)

        savebutton.setOnClickListener {
            val text = addressEditText.text.toString()
            val pattern = Regex("""г\. (\p{L}+), ул\. (\p{L}+), д\. (\d+), кв\. (\d+)""")
            if (pattern.matches(text))
            {
                Toast.makeText(this, "Адрес корректен", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "Некорректный формат адреса.  Пример: г. Москва, ул. Ленина, д. 1, кв. 10", Toast.LENGTH_LONG).show()
            }
            }
        }

    }
