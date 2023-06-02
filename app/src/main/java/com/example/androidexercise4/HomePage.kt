package com.example.androidexercise4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidexercise4.databinding.ActivityHomePageBinding

class HomePage : AppCompatActivity() {
    private lateinit var binding : ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val username = intent.getStringExtra("username")
        val userpass = intent.getStringExtra("userpass")
        binding.txtUserName.text = "Mr.\n ${username.toString()} ${userpass.toString()}"

        binding.btnClose.setOnClickListener {
            finish()
        }
    }
}