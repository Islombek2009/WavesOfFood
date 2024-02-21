package com.example.wavesoffood

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavesoffood.adapter.NotificationAdapter
import com.example.wavesoffood.databinding.FragmentNotifactionBottonBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import java.util.ArrayList


class Notifaction_Botton_Fragment : BottomSheetDialogFragment() {
    private lateinit var binding:FragmentNotifactionBottonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
        binding = FragmentNotifactionBottonBinding.inflate(layoutInflater,container,false)
        val notification = listOf("Your order has been Canceled Successfully","Order has been taken by the driver","Congrats Your Order Placed")
        val notifactionImages = listOf(R.drawable.sademoji,R.drawable.truck,R.drawable.congratulation
        )
        val adapter = NotificationAdapter(
            ArrayList(notification),
            ArrayList(notifactionImages)
        )
binding.notificationRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.notificationRecyclerView.adapter = adapter
            return binding.root
        }

    companion object {

    }
}