package com.example.suraksha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val memberList = listOf<MemberModel>(
            MemberModel("Ekta"),
            MemberModel("Lavanya Jain"),
            MemberModel("Josh"),
            MemberModel("Arushi"),
            MemberModel("Neeta"),
            MemberModel("Manish"),
            MemberModel("Arushi"),
            MemberModel("Arushi"),
            MemberModel("Ekta")
        )

        val adapter = MemberAdapter(memberList)

        val recyclerView = requireView().findViewById<RecyclerView>(R.id.rv_family_member)
        recyclerView.layoutManager=LinearLayoutManager(requireContext())
        recyclerView.adapter=adapter

    }

    companion object {

        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}