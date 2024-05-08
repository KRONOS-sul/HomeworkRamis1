package com.example.homeworkramis1

import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.homeworkramis1.databinding.ActivityTextBinding

class TextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTextBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mediaPlayer: MediaPlayer = MediaPlayer.create(this, R.raw.entering_sound)
        mediaPlayer.start()

        val intent = intent
        val password = intent.getStringExtra("password")
        binding.passTv.text = password
    }
}