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

class Adress: AppCompatActivity() {

    private lateinit var addressEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adress)

        addressEditText = findViewById(R.id.addressInput)

    }

    fun validateAddress(editText: EditText): Boolean {
        val adress = editText.text.toString().trim()

        if (adress.isEmpty()) {
            Toast.makeText(editText.context, "Адрес не может быть пустым", Toast.LENGTH_SHORT)
                .show()
            return false
        }

        val parts = adress.split(",").map { it.trim() }

        if (parts.size < 3) {
            Toast.makeText(
                editText.context,
                "Адрес должен содержать город, улицу и номер дома",
                Toast.LENGTH_SHORT
            ).show()
            return false
        }

        //тута проверочка на наличие г. ул. и д.

        if (!parts[0].startsWith("г.") || !parts[1].startsWith("ул.") || !parts[2].startsWith("д.")) {

            Toast.makeText(
                editText.context,
                "Неверный формат адреса. Используйте 'г.', 'ул.', 'д.'",
                Toast.LENGTH_LONG
            ).show()
            return false
        }

        return true
    }

    fun Save(view: View) {
        if (validateAddress(addressEditText)) {

            val intent = Intent(this, FullDom::class.java)
            startActivity(intent)
        }


    }
}
