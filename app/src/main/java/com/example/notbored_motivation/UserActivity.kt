package com.example.notbored_motivation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.notbored_motivation.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        // val termsAndCondition = findViewById<TextView>(R.id.clickTerms)

        binding =  ActivityUserBinding.inflate(layoutInflater)

        binding.buttonSave.setOnClickListener(this)

        binding.clickTerms.setOnClickListener(this)
        setContentView(binding.root)


    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_save) {
             handleSave()
        } else if (v.id == R.id.clickTerms) {
            startActivity(Intent(this, Terms::class.java))
        }
    }

    private fun handleSave() {
            startActivity(Intent(this, MainActivity::class.java))
    }

}