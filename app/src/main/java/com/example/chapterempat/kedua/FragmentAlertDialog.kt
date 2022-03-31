package com.example.chapterempat.kedua

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.chapterempat.R
import kotlinx.android.synthetic.main.fragment_alert_dialog.*

class FragmentAlertDialog : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alert_dialog, container, false)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        Btn_proses.setOnClickListener {
            val umur = Ed_umur.text.toString()
            Toast.makeText(requireContext(),"umur anda $umur", Toast.LENGTH_SHORT).show()
            dismiss()
        }
    }
}