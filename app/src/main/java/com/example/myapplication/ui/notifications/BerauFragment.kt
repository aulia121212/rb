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

class BerauFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_berau, container, false)

        // Tombol Back
        val buttonBack = view.findViewById<ImageButton>(R.id.button_back)
        buttonBack.setOnClickListener {
            requireActivity().onBackPressed() // Kembali ke aktivitas sebelumnya
            // atau
            // findNavController().navigateUp() // Kembali menggunakan NavController jika menggunakan Navigation Component
        }

        val berauLihatDetail1 = view.findViewById<Button>(R.id.berau_lihat_detail1)
        berauLihatDetail1.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_berau_to_navigation_berau1)
        }

        val berauLihatDetail2 = view.findViewById<Button>(R.id.berau_lihat_detail2)
        berauLihatDetail2.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_berau_to_navigation_berau2)
        }

        val berauLihatDetail3 = view.findViewById<Button>(R.id.berau_lihat_detail3)
        berauLihatDetail3.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_berau_to_navigation_berau3)
        }

        val berauLihatDetail4 = view.findViewById<Button>(R.id.berau_lihat_detail4)
        berauLihatDetail4.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_berau_to_navigation_berau4)
        }

        return view
    }
}
