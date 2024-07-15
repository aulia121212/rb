package com.example.myapplication.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Initialize ViewModel
        val dashboardViewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)

        // Bind data to views
        val textView = binding.textLokasi
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        // Handle button click to navigate to TentangKami Fragment
        binding.imageBtntentang.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_tentangKami)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
