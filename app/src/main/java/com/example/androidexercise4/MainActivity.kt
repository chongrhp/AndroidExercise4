package com.example.androidexercise4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.androidexercise4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener{
            val myIntent = Intent(this, HomePage::class.java)

            if(binding.edtUserName.text.toString() == "Riecho" && binding.edtPassword.text.toString() == "Pinanonang") {
                myIntent.putExtra("username", binding.edtUserName.text.toString())
                myIntent.putExtra("userpass", binding.edtPassword.text.toString())
                startActivity(myIntent)
                finish()
            } else {
                Toast.makeText(applicationContext,"Wrong user name and password!",Toast.LENGTH_LONG).show()
            }
        }
    }
}
