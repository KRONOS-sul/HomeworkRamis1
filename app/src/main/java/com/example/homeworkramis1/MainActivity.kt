package com.example.homeworkramis1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.homeworkramis1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            sendBtn.setOnClickListener {
                val data = passwordEt.text.toString()

                if (data != "") {
                    val intent = Intent(this@MainActivity, TextActivity::class.java)
                    intent.putExtra("password", data)
                    startActivity(intent)
                } else {
                    Toast.makeText(this@MainActivity, "Введите пароль!!!", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }

    }
}