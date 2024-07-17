package com.example.myapplication.ui.notifications

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class SmdDetail3 : Fragment() {

    lateinit var btn: ImageButton // Menggunakan ImageButton untuk AppCompatImageButton
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.smd_detail3, container, false)

        // Menginisialisasi ImageButton
        btn = view.findViewById(R.id.button_wa)
        btn.setOnClickListener {
            val wpurl = "https://wa.me/+6285250803633?text=Halo kak, saya ingin memesan Teh Jahe Merah Rempah apakah masih tersedia?"

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(wpurl)
            startActivity(intent)
        }

        return view
    }
}