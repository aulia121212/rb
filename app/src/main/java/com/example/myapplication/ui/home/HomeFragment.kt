package com.example.myapplication.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Gunakan binding.root untuk findViewById
        val buttonNext1 = binding.root.findViewById<ImageButton>(R.id.klik)
        buttonNext1.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_navigation_home_ceo)
        }

        val buttonNext2 = binding.root.findViewById<ImageButton>(R.id.klikcfo)
        buttonNext2.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_navigation_home_cfo)
        }

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        // If you need to set the images programmatically, you can do it here
        val imageHome: ImageView = binding.imageHome
        val imageBersama: ImageView = binding.imageBersama

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
