package com.project.gearnexus

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.project.gearnexus.databinding.ActivityHomeScreenBinding

class Home_Screen : AppCompatActivity() {
    lateinit var binding: ActivityHomeScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavigationView = binding.bottomNavigation
        bottomNavigationView.selectedItemId = com.project.gearnexus.R.id.bottom_home
        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                com.project.gearnexus.R.id.bottom_home -> return@setOnItemSelectedListener true
                com.project.gearnexus.R.id.bottom_search -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            Search_Screen::class.java
                        )
                    )
                    overridePendingTransition(com.project.gearnexus.R.anim.slide_in_right, com.project.gearnexus.R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }
                com.project.gearnexus.R.id.bottom_add_new -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            Add_new_Screen::class.java
                        )
                    )
                    overridePendingTransition(com.project.gearnexus.R.anim.slide_in_right, com.project.gearnexus.R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }
                com.project.gearnexus.R.id.bottom_chat -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            Chats_Screen::class.java
                        )
                    )
                    overridePendingTransition(com.project.gearnexus.R.anim.slide_in_right, com.project.gearnexus.R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }
                com.project.gearnexus.R.id.bottom_profile -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            Profile_Screen::class.java
                        )
                    )
                    overridePendingTransition(com.project.gearnexus.R.anim.slide_in_right, com.project.gearnexus.R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }
                else -> false
            }
        }
    }
}
