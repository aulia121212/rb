package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menyembunyikan status bar dan tombol navigasi
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN or
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        setContentView(R.layout.activity_screen)
        val thread: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(1000)
                } catch (ex: InterruptedException) {
                    ex.printStackTrace()
                } finally {
                    startActivity(Intent(this@Screen, MainActivity::class.java))
                    finish()
                }
            }
        }
        thread.start()
    }
}
