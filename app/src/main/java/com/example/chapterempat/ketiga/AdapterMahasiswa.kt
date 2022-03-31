package com.example.chapterempat.ketiga

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chapterempat.R
import kotlinx.android.synthetic.main.item_mahasiswa_adapter.view.*

class AdapterMahasiswa(val listdata : ArrayList<DataMhs>):RecyclerView.Adapter<AdapterMahasiswa.ViewHolder>() {
    class ViewHolder(layout: View) : RecyclerView.ViewHolder(layout) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterMahasiswa.ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_mahasiswa_adapter,parent,false)
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: AdapterMahasiswa.ViewHolder, position: Int) {
        holder.itemView.TV_3nama.text = listdata[position].nama
        holder.itemView.TV_3umur.text =listdata[position].umur
        holder.itemView.gambar1.setImageResource( listdata [position].gambar)
    }

    override fun getItemCount(): Int {
        return listdata.size
    }

}