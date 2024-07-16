package com.example.myapplication.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentDashboardBinding

class TentangKami : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.tentang_kami, container, false)

        binding.imageLokasi.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_tentang_kami_to_dashboard)
        }


        val buttonRbBalikpapan = view.findViewById<ImageButton>(R.id.button_rb_balikpapan)
        buttonRbBalikpapan.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_tentang_kami_to_rb_balikpapan)
        }

        val buttonRbBerau = view.findViewById<ImageButton>(R.id.button_rb_berau)
        buttonRbBerau.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_tentang_kami_to_rb_berau)
        }
        val buttonRbKukar = view.findViewById<ImageButton>(R.id.button_rb_kukar)
        buttonRbKukar.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_tentang_kami_to_rb_kukar)
        }
        val buttonRbPPU = view.findViewById<ImageButton>(R.id.button_rb_ppu)
        buttonRbPPU.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_tentang_kami_to_rb_ppu)
        }
        val buttonRbSamarinda = view.findViewById<ImageButton>(R.id.button_rb_samarinda)
        buttonRbSamarinda.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_tentang_kami_to_rb_samarinda)
        }
        return view
    }
}
