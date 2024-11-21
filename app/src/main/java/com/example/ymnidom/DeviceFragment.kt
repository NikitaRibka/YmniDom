package com.example.ymnidom

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DeviceFragment : Fragment()  {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_device, container, false)

        val buttondevice = view.findViewById<ImageView>(R.id.plusdevice)

        val datasetDevice = arrayOf("Дааочь", "Дочааь", "Дочааь",  )
        val datasetDeviceType = arrayOf(1, 2, 3, 4, 5, 6)
        val deviceAdapter = DeviceAdapter(datasetDevice, datasetDeviceType)

        val recyclerViewDevice: RecyclerView = view.findViewById(R.id.recyclerDevice)
        recyclerViewDevice.layoutManager = LinearLayoutManager(requireContext())
        recyclerViewDevice.adapter = deviceAdapter

        buttondevice.setOnClickListener {
            val intent = Intent(requireContext(), AddYstroistva::class.java)
            startActivity(intent)
        }

        return view
    }
}