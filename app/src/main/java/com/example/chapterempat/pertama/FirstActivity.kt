package com.example.chapterempat.pertama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chapterempat.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        Btn_toastandsnackbar.setOnClickListener {
            startActivity(Intent(this,NavComponentActivity::class.java))
        }

        Btn_1.setOnClickListener {
            val data = "coba lagi"
            Toast.makeText(this, "This is Toast $data", Toast.LENGTH_LONG).show()
        }
        Btn_3.setOnClickListener {
            Snackbar.make(it,"ini adalah Snackbar",Snackbar.LENGTH_SHORT).show()
        }

        Btn_4.setOnClickListener {
            Snackbar.make(it,"ini adalah Snackbar",Snackbar.LENGTH_SHORT)
                .setAction("show toast"){
                    Toast.makeText(this,"ini Toast dari snackbar 2",Toast.LENGTH_LONG).show()
                }.show()
        }

        Btn_5.setOnClickListener {
            val aa = Snackbar.make(it,"ini adalah Snackbar",Snackbar.LENGTH_INDEFINITE)
                aa.setAction("Dismiss"){
                    aa.dismiss()
                }
                    aa.show()
                }
    }
}