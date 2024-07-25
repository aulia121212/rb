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

class NotificationsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_notifications, container, false)

        val buttonLihatKatalog = view.findViewById<ImageButton>(R.id.button_lihat_katalog)
        buttonLihatKatalog.setOnClickListener {
            findNavController().navigate(R.id.action_notificationsFragment_to_katalogFragment)
        }

        val buttonLihatKatalog2 = view.findViewById<ImageButton>(R.id.button_lihat_katalog2)
        buttonLihatKatalog2.setOnClickListener {
            findNavController().navigate(R.id.action_notificationsFragment_to_samarindaKatalog)
        }

        val buttonLihatKatalog3 = view.findViewById<ImageButton>(R.id.button_lihat_katalog3)
        buttonLihatKatalog3.setOnClickListener {
            findNavController().navigate(R.id.action_notificationsFragment_to_berauKatalog)
        }

        val buttonLihatKatalog4 = view.findViewById<ImageButton>(R.id.button_lihat_katalog4)
        buttonLihatKatalog4.setOnClickListener {
            findNavController().navigate(R.id.action_notificationsFragment_to_penajamKatalog)
        }

        val buttonLihatKatalog5 = view.findViewById<ImageButton>(R.id.button_lihat_katalog5)
        buttonLihatKatalog5.setOnClickListener {
            findNavController().navigate(R.id.action_notificationsFragment_to_kukarKatalog)
        }

        return view
    }
}
