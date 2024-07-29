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

class KukarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        val view = inflater.inflate(R.layout.fragment_kukar, container, false)

        // Tombol Back
        val buttonBack = view.findViewById<ImageButton>(R.id.button_back)
        buttonBack.setOnClickListener {
            requireActivity().onBackPressed() // Kembali ke aktivitas sebelumnya
            // atau
            // findNavController().navigateUp() // Kembali menggunakan NavController jika menggunakan Navigation Component
        }

        val kukarLihatDetail1 = view.findViewById<Button>(R.id.kukar_lihat_detail1)
        kukarLihatDetail1.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_kukar_to_navigation_kukar1)
        }

        val kukarLihatDetail2 = view.findViewById<Button>(R.id.kukar_lihat_detail2)
        kukarLihatDetail2.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_kukar_to_navigation_kukar2)
        }

        val kukarLihatDetail3 = view.findViewById<Button>(R.id.kukar_lihat_detail3)
        kukarLihatDetail3.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_kukar_to_navigation_kukar3)
        }

        val kukarLihatDetail4 = view.findViewById<Button>(R.id.kukar_lihat_detail4)
        kukarLihatDetail4.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_kukar_to_navigation_kukar4)
        }

        val kukarLihatDetail5 = view.findViewById<Button>(R.id.kukar_lihat_detail5)
        kukarLihatDetail5.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_kukar_to_navigation_kukar5)
        }

        val kukarLihatDetail6 = view.findViewById<Button>(R.id.kukar_lihat_detail6)
        kukarLihatDetail6.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_kukar_to_navigation_kukar6)
        }

        val kukarLihatDetail7 = view.findViewById<Button>(R.id.kukar_lihat_detail7)
        kukarLihatDetail7.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_kukar_to_navigation_kukar7)
        }

        val kukarLihatDetail8 = view.findViewById<Button>(R.id.kukar_lihat_detail8)
        kukarLihatDetail8.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_kukar_to_navigation_kukar8)
        }

        val kukarLihatDetail9 = view.findViewById<Button>(R.id.kukar_lihat_detail9)
        kukarLihatDetail9.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_kukar_to_navigation_kukar9)
        }

        val kukarLihatDetail10 = view.findViewById<Button>(R.id.kukar_lihat_detail10)
        kukarLihatDetail10.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_katalog_kukar_to_navigation_kukar10)
        }


        return view
    }
}
