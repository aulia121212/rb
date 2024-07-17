package com.example.myapplication.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R

class SamarindaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_samarinda, container, false)

        val smdLihatDetail1 = view.findViewById<Button>(R.id.smd_lihat_detail1)
        smdLihatDetail1.setOnClickListener {
            findNavController().navigate(R.id.action_samarindaKatalog_to_smdDetail1)
        }

        val smdLihatDetail2 = view.findViewById<Button>(R.id.smd_lihat_detail2)
        smdLihatDetail2.setOnClickListener {
            findNavController().navigate(R.id.action_samarindaKatalog_to_smdDetail2)
        }

        val smdLihatDetail3 = view.findViewById<Button>(R.id.smd_lihat_detail3)
        smdLihatDetail3.setOnClickListener {
            findNavController().navigate(R.id.action_samarindaKatalog_to_smdDetail3)
        }

        val smdLihatDetail4 = view.findViewById<Button>(R.id.smd_lihat_detail4)
        smdLihatDetail4.setOnClickListener {
            findNavController().navigate(R.id.action_samarindaKatalog_to_smdDetail4)
        }


        return view
    }
}
