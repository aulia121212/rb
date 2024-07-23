package com.example.myapplication.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.TentangKamiBinding

class TentangKami : Fragment() {

    private var _binding: TentangKamiBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = TentangKamiBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.imageLokasi.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_tentang_kami_to_navigation_dashboard)
        }

        // Setup image button click listeners
        setupImageButtons()

        return view
    }

    private fun setupImageButtons() {
        binding.buttonRbBalikpapan.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_tentang_kami_to_rb_balikpapan)
        }

        binding.buttonRbBerau.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_tentang_kami_to_rb_berau)
        }

        binding.buttonRbKukar.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_tentang_kami_to_rb_kukar)
        }

        binding.buttonRbPpu.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_tentang_kami_to_rb_ppu)
        }

        binding.buttonRbSamarinda.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_tentang_kami_to_rb_samarinda)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
