package com.example.myapplication.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R

class TentangKami : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.tentang_kami, container, false)

        val buttonRbBalikpapan = view.findViewById<Button>(R.id.button_rb_balikpapan)
        buttonRbBalikpapan.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_tentangKami)
        }
        return view

    }
}
