package com.example.ymnidom

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AddYstroistva : AppCompatActivity() {

    private lateinit var backImageView: ImageView
    private lateinit var saveButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addystroistva)

        backImageView = findViewById(R.id.back_device)
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



        val datasetAddYstroistva = arrayOf("Дааочь", "Дочааь" )
        val datasetAddYstroistvaType = arrayOf(1, 2, 3, 4, 5, 6)
        val addystroistvaAdapter = AddYstroistvaAdapter(datasetAddYstroistva, datasetAddYstroistvaType)

        val recyclerViewAddYstroistva: RecyclerView = findViewById(R.id.recyclerAddYstroistva)
        recyclerViewAddYstroistva.layoutManager = LinearLayoutManager(applicationContext)
        recyclerViewAddYstroistva.adapter = addystroistvaAdapter
    }
}