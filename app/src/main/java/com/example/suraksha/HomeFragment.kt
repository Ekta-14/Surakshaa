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

            MemberModel("Ekta Jain",R.drawable.ic_family_member_f,"94%","6M","WiFi","20:06"),
            MemberModel("Josh",R.drawable.ic_family_member_m,"65%","23K","4G","05:09"),
            MemberModel("Jack",R.drawable.ic_family_member_m,"94%","2K","WiFi","12:09"),
            MemberModel("Arushi Sharma",R.drawable.ic_family_member_f,"87%","1000","No Signal","06:56"),
            MemberModel("Leetika Gupta",R.drawable.ic_family_member_f,"67%","32K","WiFi","19:09"),
            MemberModel("Manish Kumar",R.drawable.ic_family_member_m,"23%","45M","Wifi","15:09"),
            MemberModel("Divya Gupta",R.drawable.ic_family_member_f,"29%","560","4G","21:09"),
            MemberModel("Menika Jha",R.drawable.ic_family_member_f,"100%","1K","4G","20:15"),
            MemberModel("Kartik Gupta",R.drawable.ic_family_member_m,"55%","447K","Wifi","12:11")
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