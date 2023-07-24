package com.example.suraksha

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MemberAdapter(private val listMember: List<MemberModel>) : RecyclerView.Adapter<MemberAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val item = inflater.inflate(R.layout.family_member, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listMember[position]
        holder.name.text = item.name
        holder.imageUser.setImageResource(item.imageUser)
        holder.battery.text=item.battery
        holder.share.text=item.share
        holder.wifi.text=item.share
        holder.time.text=item.time
    }

    override fun getItemCount(): Int {
        return listMember.size
    }

    public class ViewHolder(private val item: View) : RecyclerView.ViewHolder(item) {
        val name: TextView = item.findViewById<TextView>(R.id.text_family_member_name)
        val imageUser: ImageView = item.findViewById<ImageView>(R.id.image_family_member)
        var battery:TextView=item.findViewById<TextView>(R.id.text_family_member_battery)
        val share=item.findViewById<TextView>(R.id.text_share)
        val wifi=item.findViewById<TextView>(R.id.text_wifi)
        val time=item.findViewById<TextView>(R.id.text_time)
    }
}