package com.example.chapterempat.tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.chapterempat.R
import kotlinx.android.synthetic.main.activity_alert_dialog.*
import kotlinx.android.synthetic.main.activity_tugas_dua.*
import kotlinx.android.synthetic.main.custom_dialog.*
import kotlinx.android.synthetic.main.custom_dialog.view.*
import kotlinx.android.synthetic.main.custom_tugas_satu.*
import kotlinx.android.synthetic.main.custom_tugas_satu.view.*

class TugasDua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas_dua)

        Btn_hitung.setOnClickListener {
            val barang = Ed_barang.text.toString()
            val jumlah = Ed_jumlah.text.toString().toInt()
            val harga = Ed_harga.text.toString().toInt()
            val total = jumlah * harga
            val customdialogtugas = LayoutInflater.from(this).inflate(R.layout.custom_tugas_satu, null, false)
            val ab = AlertDialog.Builder(this)
                .setView(customdialogtugas)
                .create()
                

            customdialogtugas.Btn_bayar.setOnClickListener {
                customdialogtugas.Tv_totalbelanja.text = total.toString()
                val bayar = customdialogtugas.Ed_bayar.text.toString().toInt()
                val kembalian = bayar - total
                Tv_barang.text = barang
                Tv_jumlah.text = jumlah.toString()
                Tv_harga.text = harga.toString()
                Tv_total.text = total.toString()
                Tv_kembalian.text = kembalian.toString()
                Toast.makeText(this,"$total",Toast.LENGTH_LONG).show()
                ab.dismiss()

            }
            ab.show()
        }
    }
}