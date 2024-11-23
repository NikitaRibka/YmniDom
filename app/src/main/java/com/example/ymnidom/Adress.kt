package com.example.ymnidom

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.postgrest.from
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class Adress: AppCompatActivity() {

    private lateinit var EditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adress)
        EditText = findViewById(R.id.addressInput)

        val supa = createSupabaseClient(
            supabaseUrl = "https://uhonejuffamtcebrradq.supabase.co",
            supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InVob25lanVmZmFtdGNlYnJyYWRxIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MzE0ODMzNzEsImV4cCI6MjA0NzA1OTM3MX0.2M2ALvpPpPFa60igaz-kNHVLs7LtaU5ouxkveVdyqqM"
        ) {
            install(Postgrest)
        }

        val EditTexte: EditText = findViewById(R.id.addressInput)
        val SaveButtone: Button = findViewById(R.id.saveButton)

        SaveButtone.setOnClickListener {
            val inputText = EditTexte.text.toString()

            MainScope().launch {
                val response =
                    SupaDataClass(id = 1, Name = "krytak", Address = EditTexte.text.toString())
                supa.from("Home").insert(response)
            }
            val regex = Regex("""^.*\s*,\s*ул\.\s*.*\s*,\s*д\.\s*\d+$""")

            if (regex.matches(inputText)) {

                val address = EditTexte.text.toString()
                val intent = Intent(this, FullDom::class.java)
                intent.putExtra("address", address)
                startActivity(intent)

                startActivity(intent)
            } else {

                Toast.makeText(
                    this,
                    "Неверный формат адреса. Введите адрес в формате:\nГород, ул. Улица, д. Номер дома",
                    Toast.LENGTH_LONG
                ).show()
            }

        }
    }
}