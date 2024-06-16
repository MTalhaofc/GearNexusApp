package com.project.gearnexus

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.project.gearnexus.databinding.ActivityChatsScreenBinding
import com.project.gearnexus.databinding.ActivityHomeScreenBinding

class Chats_Screen : AppCompatActivity() {
    lateinit var binding:ActivityChatsScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatsScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val bottomNavigationView = binding.bottomNavigation
        bottomNavigationView.selectedItemId = com.project.gearnexus.R.id.bottom_home
        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.bottom_home ->{
                    startActivity(
                        Intent(
                            applicationContext,
                            Home_Screen::class.java
                        )
                    )
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }
                R.id.bottom_search ->            {
                    startActivity(
                        Intent(
                            applicationContext,
                            Search_Screen::class.java
                        )
                    )
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_add_new ->    {
                    startActivity(
                        Intent(
                            applicationContext,
                            Add_new_Screen::class.java
                        )
                    )
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_chat -> return@setOnItemSelectedListener true

                R.id.bottom_profile -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            Profile_Screen::class.java
                        )
                    )
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }
                else -> false
            }
        }


    }
}