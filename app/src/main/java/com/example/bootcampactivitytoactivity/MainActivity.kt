package com.example.bootcampactivitytoactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bootcampactivitytoactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val detailButton = binding.detailButton
        detailButton.setOnClickListener {
            intentDetail(view)
        }
    }

    private fun intentDetail(view: View?) {
        startActivity(Intent(this, DetailActivity::class.java))
    }
}