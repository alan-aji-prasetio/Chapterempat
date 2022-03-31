package com.example.chapterempat.tugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapterempat.R
import com.example.chapterempat.ketiga.AdapterMahasiswa
import com.example.chapterempat.ketiga.DataMhs
import kotlinx.android.synthetic.main.activity_data_mahasiswa.*
import kotlinx.android.synthetic.main.activity_tugas_tiga.*

class TugasTigaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas_tiga)

        val datatugas = arrayListOf(
            DataClassTugas ( R.drawable.ic_baseline_home_24,"Binar Academy","Binar Academy","5", "Education","20MB","100K+"),
            DataClassTugas ( R.drawable.ic_baseline_home_24,"Binar X","Binar Academy","5", "Education","9.8MB","100M+"),
            DataClassTugas ( R.drawable.ic_baseline_home_24,"Binary Code Translator","TimeToast","4.5", "Tools","1.3MB","1M+"),
            DataClassTugas ( R.drawable.ic_baseline_home_24,"Autoterm Control SMS","Autoterm.ru","3.2", "Auto & Vehicles","2.0MB","1K+"),
            DataClassTugas ( R.drawable.ic_baseline_home_24,"Autoterm Control","Autoterm.ru","3.5", "Auto & Vehicles","6.9MB","10K+"),
            DataClassTugas ( R.drawable.ic_baseline_home_24,"Binar Challenge Binary Game ","Increatly","4.4", "Puzzle.Casual.Offline","45MB","100K+"),
            DataClassTugas ( R.drawable.ic_baseline_home_24,"GoToWebinar","LogMeln,Inc","4.6", "Business","27MB","100K+"),
        )
        val adapt = ClassAdapterTugas(datatugas)
        val laymanager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        tugasbro.layoutManager = laymanager
        tugasbro.adapter = adapt
    }
}
