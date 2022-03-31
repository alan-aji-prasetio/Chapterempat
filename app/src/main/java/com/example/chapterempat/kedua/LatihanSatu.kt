package com.example.chapterempat.kedua

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.chapterempat.R
import kotlinx.android.synthetic.main.activity_alert_dialog.*
import kotlinx.android.synthetic.main.activity_latihan_satu.*
import kotlinx.android.synthetic.main.fragment_satu.*

class LatihanSatu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_satu)

        BtnLatihanAlert.setOnClickListener {
            AlertDialog.Builder(this).setTitle("Latihan")
                .setMessage("Contoh pesan dari alert dialog standar")
                .setCancelable(true)
                .setIcon(R.drawable.ic_baseline_home_24)
                .show()
        }

        BtnLatihanAlert2.setOnClickListener {

            val angka1 = Ed_latihan1.text.toString()
            val angka2 = Ed_latihan2.text.toString()
            val Hasil = angka1.toInt() * angka2.toInt()
            val aa = AlertDialog.Builder(this)
            val ab = aa.create()
            aa.setTitle("Latihan 2")
            aa.setMessage("hasil dari perkalian diatas adalah $Hasil")
            aa.setNeutralButton("Dismiss") { dialogInterface: DialogInterface, i: Int -> ab.dismiss()
            }.show()
        }
    }
}