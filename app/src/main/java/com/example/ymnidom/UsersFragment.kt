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

class UsersFragment : Fragment()  {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_user, container, false)

        val buttonuser = view.findViewById<ImageView>(R.id.plususer)

        val datasetUsers = arrayOf("Сын", "Дочь", "Батя")
        val datasetUsersType = arrayOf(1, 2, 3)
        val usersAdapter = UsersAdapter(datasetUsers, datasetUsersType)

        val recyclerViewUsers: RecyclerView = view.findViewById(R.id.recyclerUser)
        recyclerViewUsers.layoutManager = LinearLayoutManager(requireContext())
        recyclerViewUsers.adapter = usersAdapter

        buttonuser.setOnClickListener {
            val intent = Intent(requireContext(), AddPolzovati::class.java)
            startActivity(intent)
        }

        return view
    }
}