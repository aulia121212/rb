package com.example.myapplication.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R

class KatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.katalog_balikpapan, container, false)

        val buttonLihatDetail1 = view.findViewById<Button>(R.id.button_lihat_detail1)
        buttonLihatDetail1.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment1)
        }

        val buttonLihatDetail2 = view.findViewById<Button>(R.id.button_lihat_detail2)
        buttonLihatDetail2.setOnClickListener {
            findNavController().navigate(R.id.action_katalogFragment_to_detailUMKMFragment2)
        }

        return view
    }
}
