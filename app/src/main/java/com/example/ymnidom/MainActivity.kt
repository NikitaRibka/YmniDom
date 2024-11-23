package com.example.ymnidom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.text.InputType
import androidx.lifecycle.lifecycleScope
import io.github.jan.supabase.gotrue.auth
import io.github.jan.supabase.gotrue.providers.builtin.Email
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

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
            val emailview = emailEditText.text.toString()
            val passwordview = passwordEditText.text.toString()

            if (emailview.isEmpty() || passwordview.isEmpty()) {
                Toast.makeText(this, "Есть пустые поля", Toast.LENGTH_SHORT).show()

            }

            // Проверка почты на корректность
            else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(emailview).matches()) {
                Toast.makeText(this, "Некорректный адрес электронной почты", Toast.LENGTH_SHORT)
                    .show()

            }

            else {

                Toast.makeText(this, "Проверка прошла успешно", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, PineCode::class.java)
                startActivity(intent)

                val job = Job()
                val scope = CoroutineScope(Dispatchers.Main + job)
                if (job.isActive) {
                    lifecycleScope.launch {
                        var supabase = supa.getSB()
                        val user = supabase.auth.signInWith(Email) {
                            email = emailEditText?.text.toString()
                            password = passwordEditText?.text.toString()
                        }
                    }
                }

                if (!job.isActive) {
                    job.cancel()
                }

            }

        }

        registerButton.setOnClickListener {

            val intent = Intent(this, Adress::class.java)
            startActivity(intent)
        }
    }
}




