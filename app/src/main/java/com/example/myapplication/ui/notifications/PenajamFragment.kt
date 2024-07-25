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

        return view
    }
}
