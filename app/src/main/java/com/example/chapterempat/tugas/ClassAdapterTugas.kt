package com.example.chapterempat.tugas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chapterempat.R
import com.example.chapterempat.ketiga.AdapterMahasiswa
import com.example.chapterempat.ketiga.DataMhs
import kotlinx.android.synthetic.main.item_mahasiswa_adapter.view.*
import kotlinx.android.synthetic.main.item_mahasiswa_adapter.view.gambar1
import kotlinx.android.synthetic.main.item_tugas_adapter.view.*

class ClassAdapterTugas(val listdata : ArrayList<DataClassTugas>): RecyclerView.Adapter<ClassAdapterTugas.ViewHolder>() {
    class ViewHolder (layout: View) : RecyclerView.ViewHolder(layout) {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClassAdapterTugas.ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_tugas_adapter,parent,false)
        return ClassAdapterTugas.ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ClassAdapterTugas.ViewHolder, position: Int) {
        holder.itemView.gambar1.setImageResource(listdata[position].gambarApk)
        holder.itemView.TV_tugasnama.text = listdata [position].namaApk
        holder.itemView.TV_tugasnama2.text = listdata [position].developer
        holder.itemView.Tv_kategori.text = listdata [position].kategori
        holder.itemView.Tv_rating.text = listdata [position].rating
        holder.itemView.Tv_ukuran.text = listdata [position].ukuranApk
        holder.itemView.Tv_jmldownload.text = listdata [position].jmlDownload
    }

    override fun getItemCount(): Int {
        return listdata.size
    }

}

