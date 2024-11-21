package com.example.ymnidom

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddPolzovati : AppCompatActivity() {

    private lateinit var backImageView: ImageView
    private lateinit var saveButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addpolzovati)

        backImageView = findViewById(R.id.back_user)
        saveButton = findViewById(R.id.saveButton_device)

        backImageView.setOnClickListener {
            val intent = Intent(this, FullDom::class.java)
            startActivity(intent)
        }
        saveButton.setOnClickListener {
            Toast.makeText(this, "Успешно сохранено", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, FullDom::class.java)
            startActivity(intent)
        }
    }
}