package com.example.chapterempat.tugas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.chapterempat.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_fragmen_satu_tugas.*

class FragmenSatuTugas : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmen_satu_tugas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Btn1_tugas.setOnClickListener {
            val name = ed_1_tugas.text.toString()
            Toast.makeText(requireContext(),"Wellcome $name",Toast.LENGTH_LONG).show()
        }
        Btn2_tugas.setOnClickListener {
            Snackbar.make(it,"YATTA",Snackbar.LENGTH_INDEFINITE).setAction("move") {
                Navigation.findNavController(view).navigate(R.id.action_fragmenSatuTugas_to_fragmentDuaTugas)
            }.show()
        }
    }

}