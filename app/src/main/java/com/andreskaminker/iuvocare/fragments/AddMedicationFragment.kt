package com.andreskaminker.iuvocare.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.andreskaminker.iuvocare.R
import com.andreskaminker.iuvocare.fragments.nscren.TimePickerFragment
import kotlinx.android.synthetic.main.activity_main.view.*


class AddMedicationFragment : Fragment() {
    private lateinit var v: View
    private lateinit var timeButton: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v =  inflater.inflate(R.layout.fragment_add_medication, container, false)

        timeButton = v.findViewById(R.id.timeButton)
        return v
    }

    override fun onStart() {
        val appBar = this.requireActivity().findViewById<View>(R.id.bar_coordinator_layout)
        appBar.fab.setImageDrawable(resources.getDrawable(R.drawable.ic_baseline_post_add_24))
        appBar.fab.setOnClickListener {
            val directions =
                AddMedicationFragmentDirections.actionAddMedicationFragmentToAddAppointmentFragment()
            v.findNavController().navigate(directions)
        }
        timeButton.setOnClickListener {
            TimePickerFragment()
                .show(childFragmentManager, "timePicker")
        }

        super.onStart()
    }


    //https://github.com/gantonious/MaterialDayPicker for the implementation of the week day picker using Calendar

}