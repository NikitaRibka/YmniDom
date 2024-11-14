package com.example.ymnidom

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivityRegister : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var registerButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_register)

        usernameEditText= findViewById(R.id.username_edit_text)
        emailEditText = findViewById(R.id.email_edit_text_reg)
        passwordEditText = findViewById(R.id.password_edit_text_reg)
        loginButton = findViewById(R.id.save_button_reg)
        registerButton = findViewById(R.id.register_reg)

        registerButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Проверка полей на пустоту
            if (email.isEmpty() || password.isEmpty() || username.isEmpty()) {
                Toast.makeText(this, "Пожалуйста, заполните все поля", Toast.LENGTH_SHORT).show()

            }

            // Проверка почты на корректность
           else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this, "Некорректный адрес электронной почты", Toast.LENGTH_SHORT)
                    .show()

            }

            else if (password.length < 8) {
                Toast.makeText(this, "Пароль должен быть не менее 8 символов", Toast.LENGTH_SHORT).show()

            }

            else {
                // Проверка прошла успешно, переход на следующий экран
                Toast.makeText(this, "Проверка прошла успешно", Toast.LENGTH_SHORT).show()

                // Создание Intent для запуска нового Activity
                val intent = Intent(this, PineCodeCreate::class.java)

                // Запуск нового Activity
                startActivity(intent)
            }


        }

        loginButton.setOnClickListener {
            // Создание Intent для запуска нового Activity
            val intent = Intent(this, MainActivity::class.java)

            // Запуск нового Activity
            startActivity(intent)

        }
    }
}
