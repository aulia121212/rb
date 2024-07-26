package com.example.myapplication.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R

class PenajamFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_penajam, container, false)

        // Tombol Back
        val buttonBack = view.findViewById<ImageButton>(R.id.button_back)
        buttonBack.setOnClickListener {
            requireActivity().onBackPressed() // Kembali ke aktivitas sebelumnya
            // atau
            // findNavController().navigateUp() // Kembali menggunakan NavController jika menggunakan Navigation Component
        }

        val penajamLihatDetail1 = view.findViewById<Button>(R.id.ppu_lihat_detail1)
        penajamLihatDetail1.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_penajam_to_navigation_penajam1)
        }

        val penajamLihatDetail2 = view.findViewById<Button>(R.id.ppu_lihat_detail2)
        penajamLihatDetail2.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_penajam_to_navigation_penajam2)
        }
        val penajamLihatDetail3 = view.findViewById<Button>(R.id.ppu_lihat_detail3)
        penajamLihatDetail3.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_penajam_to_navigation_penajam3)
        }
        val penajamLihatDetail4 = view.findViewById<Button>(R.id.ppu_lihat_detail4)
        penajamLihatDetail4.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_penajam_to_navigation_penajam4)
        }
        val penajamLihatDetail5 = view.findViewById<Button>(R.id.ppu_lihat_detail5)
        penajamLihatDetail5.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_penajam_to_navigation_penajam5)
        }
        val penajamLihatDetail6 = view.findViewById<Button>(R.id.ppu_lihat_detail6)
        penajamLihatDetail6.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_penajam_to_navigation_penajam6)
        }
        val penajamLihatDetail7 = view.findViewById<Button>(R.id.ppu_lihat_detail7)
        penajamLihatDetail7.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_penajam_to_navigation_penajam7)
        }

        val penajamLihatDetail8 = view.findViewById<Button>(R.id.ppu_lihat_detail8)
        penajamLihatDetail8.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_penajam_to_navigation_penajam8)
        }

        return view
    }
}
