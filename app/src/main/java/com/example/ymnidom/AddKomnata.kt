package com.example.ymnidom

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AddKomnata : AppCompatActivity() {

    private lateinit var backImageView: ImageView
    private lateinit var saveButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addkomnata)

        backImageView = findViewById(R.id.back_room)
        saveButton = findViewById(R.id.saveButton_room)

        backImageView.setOnClickListener {
            val intent = Intent(this, FullDom::class.java)
            startActivity(intent)
        }
        saveButton.setOnClickListener {
            Toast.makeText(this, "Успешно сохранено", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, FullDom::class.java)
            startActivity(intent)
        }

            val datasetAddKomnata = arrayOf("Дааочь", "Дочааь", "Дочааь",  )
            val datasetAddKomnataType = arrayOf(1, 2, 3, 4, 5, 6)
            val addkomnataAdapter = AddKomnataAdapter(datasetAddKomnata, datasetAddKomnataType)

            val recyclerViewAddKomnata: RecyclerView = findViewById(R.id.recyclerAddKomnata)
            recyclerViewAddKomnata.layoutManager = LinearLayoutManager(applicationContext)
            recyclerViewAddKomnata.adapter = addkomnataAdapter

    }
}