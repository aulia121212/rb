package com.example.myapplication.ui.notifications

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R

class PenajamDetail8Fragment : Fragment() {

    private lateinit var btn: ImageButton
    private lateinit var btnBack: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_penajam_detail8, container, false)

        // Menginisialisasi ImageButton
        btn = view.findViewById(R.id.button_wa)
        btn.setOnClickListener {
            val wpurl = "https://wa.me/+6285346293404?text=Halo kak, saya ingin memesan Stik Kates apakah masih tersedia?"

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(wpurl)
            startActivity(intent)
        }

        btnBack = view.findViewById(R.id.button_back)
        btnBack.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_penajam8_to_navigation_katalog_penajam)
        }

        return view
    }
}