package com.example.myapplication.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.R

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Rumah BUMN adalah program yang dirancang oleh Badan Usaha Milik Negara (BUMN) untuk mendukung dan memberdayakan Usaha Mikro, Kecil, dan Menengah (UMKM) melalui pelatihan, pendampingan, dan akses ke berbagai sumber daya yang penting bagi perkembangan bisnis.\n" +
                "\n" +
                "Rumah BUMN Kalimantan Timur hadir untuk mendukung pertumbuhan UMKM lokal dengan memberikan pelatihan bisnis, pendampingan teknis, dan akses ke jaringan pemasaran. Dengan dukungan dari BUMN, UMKM di Kalimantan Timur dapat meningkatkan kualitas produk, memperluas pasar, dan meningkatkan daya saing mereka di tingkat lokal maupun nasional. Bergabunglah dengan Rumah BUMN Kalimantan Timur dan jadilah bagian dari ekosistem yang mendorong kesuksesan bisnis Anda."
    }
    val text: LiveData<String> = _text

    private val _image = MutableLiveData<Int>().apply {
        value = R.drawable.benefitall
    }
    val image: LiveData<Int> = _image
}
