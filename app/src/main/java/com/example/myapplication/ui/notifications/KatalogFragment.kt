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

class KatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View {
        val view = inflater.inflate(R.layout.katalog_balikpapan, container, false)

        // Tombol Back
        val buttonBack = view.findViewById<ImageButton>(R.id.button_back)
        buttonBack.setOnClickListener {
            requireActivity().onBackPressed() // Kembali ke aktivitas sebelumnya
            // atau
            // findNavController().navigateUp() // Kembali menggunakan NavController jika menggunakan Navigation Component
        }

        val buttonLihatDetail1 = view.findViewById<Button>(R.id.button_lihat_detail1)
        buttonLihatDetail1.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment1)
        }

        val buttonLihatDetail2 = view.findViewById<Button>(R.id.button_lihat_detail2)
        buttonLihatDetail2.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment2)
        }

        val buttonLihatDetail3 = view.findViewById<Button>(R.id.button_lihat_detail3)
        buttonLihatDetail3.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment3)
        }

        val buttonLihatDetail4 = view.findViewById<Button>(R.id.button_lihat_detail4)
        buttonLihatDetail4.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment4)
        }

        val buttonLihatDetail5 = view.findViewById<Button>(R.id.button_lihat_detail5)
        buttonLihatDetail5.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment5)
        }

        val buttonLihatDetail6 = view.findViewById<Button>(R.id.button_lihat_detail6)
        buttonLihatDetail6.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment6)
        }

        val buttonLihatDetail7 = view.findViewById<Button>(R.id.button_lihat_detail7)
        buttonLihatDetail7.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment7)
        }

        val buttonLihatDetail8 = view.findViewById<Button>(R.id.button_lihat_detail8)
        buttonLihatDetail8.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment8)
        }

        val buttonLihatDetail9 = view.findViewById<Button>(R.id.button_lihat_detail9)
        buttonLihatDetail9.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment9)
        }

        val buttonLihatDetail10 = view.findViewById<Button>(R.id.button_lihat_detail10)
        buttonLihatDetail10.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment10)
        }

        val buttonLihatDetail11 = view.findViewById<Button>(R.id.button_lihat_detail11)
        buttonLihatDetail11.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment11)
        }

        val buttonLihatDetail12 = view.findViewById<Button>(R.id.button_lihat_detail12)
        buttonLihatDetail12.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment12)
        }

        val buttonLihatDetail13 = view.findViewById<Button>(R.id.button_lihat_detail13)
        buttonLihatDetail13.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment13)
        }

        val buttonLihatDetail14 = view.findViewById<Button>(R.id.button_lihat_detail14)
        buttonLihatDetail14.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment14)
        }

        val buttonLihatDetail15 = view.findViewById<Button>(R.id.button_lihat_detail15)
        buttonLihatDetail15.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment15)
        }

        val buttonLihatDetail16 = view.findViewById<Button>(R.id.button_lihat_detail16)
        buttonLihatDetail16.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment16)
        }

        val buttonLihatDetail17 = view.findViewById<Button>(R.id.button_lihat_detail17)
        buttonLihatDetail17.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment17)
        }

        val buttonLihatDetail18 = view.findViewById<Button>(R.id.button_lihat_detail18)
        buttonLihatDetail18.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment18)
        }

        val buttonLihatDetail19 = view.findViewById<Button>(R.id.button_lihat_detail19)
        buttonLihatDetail19.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment19)
        }

        val buttonLihatDetail20 = view.findViewById<Button>(R.id.button_lihat_detail20)
        buttonLihatDetail20.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment20)
        }

        return view
    }
}
