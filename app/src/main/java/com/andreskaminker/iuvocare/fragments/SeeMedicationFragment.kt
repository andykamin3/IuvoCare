package com.andreskaminker.iuvocare.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.andreskaminker.iuvocare.R

class SeeMedicationFragment : Fragment() {
    private lateinit var v: View

    private lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_see_medication, container, false)
        recyclerView = v.findViewById(R.id.recyclerMedications)


        return v
    }

}