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

class DetailUMKMFragment1 : Fragment() {

    private lateinit var btnWa: ImageButton
    private lateinit var btnBack: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.detail_umkm_1, container, false)

        // Initialize ImageButton for WhatsApp
        btnWa = view.findViewById(R.id.button_wa)
        btnWa.setOnClickListener {
            val wpurl = "https://wa.me/+6285179758586?text=Halo kak, saya ingin memesan produk Gothirty Handmade apakah masih tersedia?"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(wpurl)
            startActivity(intent)
        }

        // Initialize ImageButton for Back Navigation
        btnBack = view.findViewById(R.id.button_back)
        btnBack.setOnClickListener {
            findNavController().navigate(R.id.action_detailUMKMFragment1_to_katalogFragment)
        }

        return view
    }
}
