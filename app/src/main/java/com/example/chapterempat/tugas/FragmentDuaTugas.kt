package com.example.chapterempat.tugas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.chapterempat.R
import kotlinx.android.synthetic.main.fragment_dua_tugas.*

class FragmentDuaTugas : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dua_tugas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Btn3_tugas.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_fragmentDuaTugas_to_fragmenSatuTugas)
        }
    }
}