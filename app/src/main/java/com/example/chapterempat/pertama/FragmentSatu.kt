package com.example.chapterempat.pertama

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.chapterempat.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_satu.*


class FragmentSatu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Btn_latihan1.setOnClickListener {
            Toast.makeText(requireContext(), "This is Toast",Toast.LENGTH_LONG).show()
        }
        Btn_latihan2.setOnClickListener {
            Snackbar.make(it,"YATTA",Snackbar.LENGTH_INDEFINITE).setAction("move") {
                Navigation.findNavController(view).navigate(R.id.action_fragmentSatu_to_fragmentDua)
            }.show()
            }
        }
    }
