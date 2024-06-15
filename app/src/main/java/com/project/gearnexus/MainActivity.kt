package com.project.gearnexus

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

import com.project.gearnexus.databinding.ActivityHomeScreenBinding
import com.project.gearnexus.databinding.ActivityMainBinding
@SuppressLint("CustomSplashScreen")

class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this, Home_Screen::class.java)
            startActivity(intent)
            finish()

        }, 1500)


    }
}