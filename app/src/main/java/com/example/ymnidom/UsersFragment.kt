package com.example.ymnidom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class UsersFragment : Fragment()  {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_user, container, false)

        val datasetUsers = arrayOf("Сын", "Дочь", "Батя")
        val datasetUsersType = arrayOf(1, 2, 3)
        val roomAdapter = UsersAdapter(datasetUsers, datasetUsersType)

        val recyclerViewUsers: RecyclerView = view.findViewById(R.id.recyclerUsers)
        recyclerViewUsers.layoutManager = LinearLayoutManager(requireContext())
        recyclerViewUsers.adapter = roomAdapter

        return view
    }
}