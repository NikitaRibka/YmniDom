package com.example.ymnidom

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class FullDom : AppCompatActivity() {

    private lateinit var roomsTextView: TextView
    private lateinit var devicesTextView: TextView
    private lateinit var usersTextView: TextView
    private lateinit var settingImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fulldom)

        roomsTextView = findViewById(R.id.roomsTextView)
        devicesTextView = findViewById(R.id.devicesTextView)
        usersTextView = findViewById(R.id.usersTextView)
        settingImageView = findViewById(R.id.setting)

        val fragments = mapOf(
            R.id.roomsTextView to RoomsFragment(),
            R.id.devicesTextView to DeviceFragment(),
            R.id.usersTextView to UsersFragment()
        )
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,
            fragments[R.id.roomsTextView]!! as Fragment
        ).commit()

        roomsTextView.setOnClickListener { switchFragment(fragments[R.id.roomsTextView]!!) }
        devicesTextView.setOnClickListener { switchFragment(fragments[R.id.devicesTextView]!!) }
        usersTextView.setOnClickListener { switchFragment(fragments[R.id.usersTextView]!!) }

        settingImageView.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }

    private fun switchFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment)
        transaction.commit()
    }


}
