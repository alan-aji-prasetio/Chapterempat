package com.example.chapterempat.kedua

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.chapterempat.R
import kotlinx.android.synthetic.main.activity_alert_dialog.*
import kotlinx.android.synthetic.main.custom_dialog.*
import kotlinx.android.synthetic.main.custom_dialog.view.*

class AlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        BtnAlert1.setOnClickListener {
            AlertDialog.Builder(this).setTitle("Title Example")
                .setMessage("Contoh pesan dari alert dialog standar")
                .setCancelable(true)
                .setIcon(R.drawable.ic_baseline_home_24)
                .show()
        }
        BtnAlert2.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Hapus Data")
                .setMessage("Yakin Hapus Data Anda")
                .setCancelable(true)
                .setPositiveButton("Ya") { dialogInterface: DialogInterface, i: Int ->
// ACTION YANG AKAN TERJADI KETIKA KLIK YA
                    Toast.makeText(this, "data akan dihapus", Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("Tidak") { dialogInterface: DialogInterface, i: Int ->
// ACTION JIKA KLIK TIDAK
                    Toast.makeText(this, "data tidak dihapus", Toast.LENGTH_LONG).show()
                }
                .show()
        }
        BtnAlert3.setOnClickListener {
            val aa = AlertDialog.Builder(this)
            val ab = aa.create()
            aa.setTitle("Example of Dismiss")
            aa.setMessage("isi Massage dari example of dismiss")
            aa.setPositiveButton("ya"){ dialogInterface: DialogInterface, i: Int ->
            Toast.makeText(this,"Data akan terhapus",Toast.LENGTH_LONG).show()
            }
            aa.setNeutralButton("Dismiss"){ dialogInterface: DialogInterface, i: Int ->
            ab.dismiss()
            }
                .show()
        }
        BtnAlert4.setOnClickListener {
            val customdialog = LayoutInflater.from(this).inflate(R.layout.custom_dialog, null, false)
            val ab = AlertDialog.Builder(this)
                .setView(customdialog)
                .create()

            customdialog.BtnCustomAlert.setOnClickListener {
                val nama = customdialog.Ed_nama.text.toString()
                Tv_nama.text = nama
                Toast.makeText(this, "$nama", Toast.LENGTH_LONG).show()
                ab.dismiss()
            }
            ab.show()
        }

            BtnAlert5.setOnClickListener {
                FragmentAlertDialog().show(supportFragmentManager,"abc")

            }


    }
}