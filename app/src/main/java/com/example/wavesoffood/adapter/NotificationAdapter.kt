package com.example.wavesoffood.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wavesoffood.databinding.FragmentNotifactionBottonBinding
import com.example.wavesoffood.databinding.NotificationItemBinding

class NotificationAdapter(private var notification:ArrayList<String>,private var notificationImage:ArrayList<Int>):RecyclerView.Adapter<NotificationAdapter.NotificastionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificastionViewHolder {
        val binding = NotificationItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return NotificastionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NotificastionViewHolder, position: Int) {
        holder.bind(position)
    }
    override fun getItemCount(): Int = notification.size
    inner class NotificastionViewHolder(private val binding: NotificationItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int){
            binding.apply {
                notificationTextView .text = notification[position]
                notificationImageView.setImageResource(notificationImage[position])
            }
        }

    }
}