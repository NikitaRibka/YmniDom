package com.example.ymnidom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.text.InputType

class MainActivity : AppCompatActivity() {
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailEditText = findViewById(R.id.email_edit_text)
        passwordEditText = findViewById(R.id.password_edit_text)
        loginButton = findViewById(R.id.save_button)
        registerButton = findViewById(R.id.register)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Проверка полей на пустоту
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Есть пустые поля", Toast.LENGTH_SHORT).show()

            }

            // Проверка почты на корректность
            else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this, "Некорректный адрес электронной почты", Toast.LENGTH_SHORT)
                    .show()

            }

            else {
                // Проверка прошла успешно, переход на следующий экран
                Toast.makeText(this, "Проверка прошла успешно", Toast.LENGTH_SHORT).show()

                // Создание Intent для запуска нового Activity
                val intent = Intent(this, PineCode::class.java)

                // Запуск нового Activity
                startActivity(intent)
            }

        }

        registerButton.setOnClickListener {

            val intent = Intent(this, FullDom::class.java)
            startActivity(intent)
        }
    }
}




