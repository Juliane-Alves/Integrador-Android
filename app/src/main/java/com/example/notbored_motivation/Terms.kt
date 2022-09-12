package com.example.notbored_motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notbored_motivation.databinding.ActivityItemAdapterBinding
import com.example.notbored_motivation.databinding.ActivityMainBinding
import com.example.notbored_motivation.databinding.ActivityTermsBinding

class Terms : AppCompatActivity() {

    lateinit var binding: ActivityTermsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTermsBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.idClose.setOnClickListener {
            finish()
        }
    }

}