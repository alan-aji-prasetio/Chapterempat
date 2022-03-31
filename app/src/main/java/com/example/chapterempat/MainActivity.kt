package com.example.chapterempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapterempat.pertama.MiniChallenge
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Btn_2.setOnClickListener {
            val intent1 = Intent(this, MiniChallenge::class.java)
            startActivity(intent1)

        }

    }
}