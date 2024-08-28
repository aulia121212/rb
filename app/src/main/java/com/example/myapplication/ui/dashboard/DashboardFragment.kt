package com.example.myapplication.ui.dashboard

import android.content.Intent
import android.net.Uri
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

        // Setup button click to open Google Maps
        binding.buttonLokasiBalikpapan.setOnClickListener {
            openGoogleMapsBalikpapan()
        }

        binding.buttonLokasiSamarinda.setOnClickListener {
            openGoogleMapsSamarinda()
        }

        binding.buttonLokasiBerau.setOnClickListener {
            openGoogleMapsBerau()
        }

        binding.buttonLokasiPpu.setOnClickListener {
            openGoogleMapsPpu()
        }

        binding.buttonLokasiKukar.setOnClickListener {
            openGoogleMapsKukar()
        }

        return root
    }

    private fun openGoogleMapsBalikpapan() {
        val wpurl =
            "https://www.google.com/maps/place/Rumah+BUMN+Balikpapan/@-1.2739897,116.8311271,17z/data=!3m1!4b1!4m6!3m5!1s0x2df1475a1ddfbc4f:0xec443d285f8690f7!8m2!3d-1.2739897!4d116.833702!16s%2Fg%2F11rdt5lvlk?entry=ttu"

        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(wpurl)
        startActivity(intent)
    }
    private fun openGoogleMapsSamarinda() {
        val wpurl =
            "https://www.google.com/maps/place/Rumah+BUMN+Telkom+Samarinda/@-0.502006,117.1407607,17z/data=!3m1!4b1!4m6!3m5!1s0x2df67fa750a3dea3:0x907048d8fec7afc2!8m2!3d-0.502006!4d117.1433356!16s%2Fg%2F11fzfdlyxd?entry=ttu"

        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(wpurl)
        startActivity(intent)
    }
    private fun openGoogleMapsBerau() {
        val wpurl =
            "https://www.google.com/maps/place/RUMAH+BUMN+BERAU/@2.1476215,117.5030515,17z/data=!3m1!4b1!4m6!3m5!1s0x320df59b0cbeee5f:0xdad7272a38539d38!8m2!3d2.1476215!4d117.5056264!16s%2Fg%2F11vynntm_8?entry=ttu"

        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(wpurl)
        startActivity(intent)
    }

    private fun openGoogleMapsPpu() {
        val wpurl =
            "https://www.google.com/maps/place/Rumah+BUMN+Penajam/@-1.3588426,116.6587504,17z/data=!3m1!4b1!4m6!3m5!1s0x2df13de24113171b:0x76adbe6fbba5ab54!8m2!3d-1.3588426!4d116.6613253!16s%2Fg%2F11t4wgzfdw?entry=ttu"

        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(wpurl)
        startActivity(intent)
    }

    private fun openGoogleMapsKukar() {
        val wpurl =
            "https://www.google.com/maps/place/Rumah+BUMN+Kutai+Kartanegara/@-0.4225793,116.9895842,17z/data=!3m1!4b1!4m6!3m5!1s0x2df67bacd72678cd:0x39c9c6af317a356d!8m2!3d-0.4225793!4d116.9921591!16s%2Fg%2F11rndznwr1?entry=ttu"

        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(wpurl)
        startActivity(intent)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
