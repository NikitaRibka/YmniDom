package com.example.ymnidom

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RoomsFragment : Fragment()  {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_room, container, false)

        val buttonroom = view.findViewById<ImageView>(R.id.plusroom)

        val datasetUsers = arrayOf("Ванная", "Дочь", "Кухня", "Дочь", "Дочь", "Дочь",)
        val datasetUsersType = arrayOf(1, 2, 3, 4, 5, 6)
        val roomAdapter = UsersAdapter(datasetUsers, datasetUsersType)

        val recyclerViewUsers: RecyclerView = view.findViewById(R.id.recyclerRoom)
        recyclerViewUsers.layoutManager = LinearLayoutManager(requireContext())
        recyclerViewUsers.adapter = roomAdapter

        buttonroom.setOnClickListener {
            val intent = Intent(requireContext(), AddKomnata::class.java)
            startActivity(intent)
        }

        return view
    }
}