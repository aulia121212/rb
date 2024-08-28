package com.example.myapplication.ui.faq

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R

class FAQFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_f_a_q, container, false)

        val buttonTanya1 = view.findViewById<ImageButton>(R.id.tanya1)
        buttonTanya1.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_faq_to_navigation_faq1)
        }

        val buttonTanya2 = view.findViewById<ImageButton>(R.id.tanya2)
        buttonTanya2.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_faq_to_navigation_faq2)
        }

        val buttonTanya3 = view.findViewById<ImageButton>(R.id.tanya3)
        buttonTanya3.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_faq_to_navigation_faq3)
        }

        val buttonTanya4 = view.findViewById<ImageButton>(R.id.tanya4)
        buttonTanya4.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_faq_to_navigation_faq4)
        }

        val buttonTanya5 = view.findViewById<ImageButton>(R.id.tanya5)
        buttonTanya5.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_faq_to_navigation_faq5)
        }

        val buttonTanya6 = view.findViewById<ImageButton>(R.id.tanya6)
        buttonTanya6.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_faq_to_navigation_faq6)
        }

        val buttonTanya7 = view.findViewById<ImageButton>(R.id.tanya7)
        buttonTanya7.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_faq_to_navigation_faq7)
        }

        return view
    }
}
