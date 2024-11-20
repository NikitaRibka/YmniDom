package com.example.ymnidom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class DeviceFragment : Fragment()  {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_device, container, false)
        val imageView: ImageView = view.findViewById(R.id.largeImageView)

        imageView.setImageResource(R.drawable.nazad)

        return view
    }
}