package com.example.chapterempat.ketiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapterempat.R
import kotlinx.android.synthetic.main.activity_data_mahasiswa.*

class DataMahasiswaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_mahasiswa)

        val datamahasiswa = arrayListOf(
            DataMhs ( R.drawable.ic_baseline_home_24,"itadori", "19"),
            DataMhs ( R.drawable.ic_baseline_home_24,"gojo", "27"),
            DataMhs ( R.drawable.ic_baseline_home_24,"okkotsu", "20"),
            DataMhs ( R.drawable.ic_baseline_home_24,"nobara" ,"19"),
            DataMhs ( R.drawable.ic_baseline_home_24,"fushiguro", "19"),
            DataMhs ( R.drawable.ic_baseline_home_24,"panda" ,"20"),
            DataMhs ( R.drawable.ic_baseline_home_24,"ani" ,"23"),
        )
        val adapt = AdapterMahasiswa(datamahasiswa)
        val laymanager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        mahasiswa.layoutManager = laymanager
        mahasiswa.adapter = adapt
    }
}