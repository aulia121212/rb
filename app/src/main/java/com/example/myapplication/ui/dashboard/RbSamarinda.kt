package com.example.myapplication.ui.dashboard

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class RbSamarinda : Fragment() {

    lateinit var btnNarahubung: ImageButton // Menggunakan ImageButton untuk AppCompatImageButton
    lateinit var btnDaftar: ImageButton // Menggunakan ImageButton untuk link formulir pendaftaran

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.rb_samarinda, container, false)

        // Menginisialisasi ImageButton untuk narahubung
        btnNarahubung = view.findViewById(R.id.image_narahubung)
        btnNarahubung.setOnClickListener {
            val wpurl = "https://wa.me/+6285250803633?text=Hai, saya tertarik untuk bergabung dengan Rumah BUMN Samarinda. \n" +
                    "\n" +
                    "Saya memiliki produk yang bernama (Nama UMKM) dan produk saya bergerak dibidang (sebutkan bidang) dan memiliki keunikan berupa (sebutkan keunikan opsional). \n" +
                    "\n" +
                    "Mohon informasi lebih lanjut mengenai informasinya dan cara pendaftarannya "

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(wpurl)
            startActivity(intent)
        }

        // Menginisialisasi ImageButton untuk formulir pendaftaran
        btnDaftar = view.findViewById(R.id.image_daftar)
        btnDaftar.setOnClickListener {
            val formUrl = "https://bit.ly/JOINRUMAHBUMNSAMARINDA"

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(formUrl)
            startActivity(intent)
        }

        return view
    }
}
