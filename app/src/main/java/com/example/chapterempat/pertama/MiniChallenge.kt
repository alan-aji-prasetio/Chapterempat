package com.example.chapterempat.pertama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chapterempat.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_mini_challenge.*

class MiniChallenge : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mini_challenge)

        Btn_6.setOnClickListener {
            val a = ed_1.text.toString()
            Toast.makeText(this, "Welcome $a", Toast.LENGTH_LONG).show()
        }
        Btn_7.setOnClickListener {
            Snackbar.make(it, "yey", Snackbar.LENGTH_SHORT).setAction("kehalaman selanjutnya") { startActivity(Intent(this, halamandua::class.java))
            }.show()

        }
    }
}
