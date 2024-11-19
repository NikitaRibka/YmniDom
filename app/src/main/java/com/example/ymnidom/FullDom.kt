package com.example.ymnidom

import android.os.Bundle
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class FullDom : AppCompatActivity() {

    private lateinit var roomsTextView: TextView
    private lateinit var devicesTextView: TextView
    private lateinit var usersTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fulldom)

        roomsTextView = findViewById(R.id.roomsTextView)
        devicesTextView = findViewById(R.id.devicesTextView)
        usersTextView = findViewById(R.id.usersTextView)


    }


}
