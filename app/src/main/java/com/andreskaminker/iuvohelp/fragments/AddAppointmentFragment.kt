package com.andreskaminker.iuvohelp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.andreskaminker.iuvohelp.R
import com.andreskaminker.iuvohelp.fragments.nscren.TimePickerFragment
import kotlinx.android.synthetic.main.activity_main.view.*


class AddAppointmentFragment : Fragment() {
    private lateinit var v: View
    private lateinit var dateButton: Button
    private lateinit var timeButton: Button
    private val TAG = "AddAppointmentFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        v = inflater.inflate(R.layout.fragment_add_appointment, container, false)

        timeButton = v.findViewById(R.id.timeButton)
        dateButton = v.findViewById(R.id.dateButton)
        return v
    }

    override fun onStart() {
        val appBar = this.requireActivity().findViewById<View>(R.id.bar_coordinator_layout)
        appBar.fab.setImageDrawable(resources.getDrawable(R.drawable.ic_pill))
        appBar.fab.setOnClickListener {
            val directions =
                AddAppointmentFragmentDirections.actionAddAppointmentFragmentToAddMedicationFragment()
            v.findNavController().navigate(directions)
        }

        dateButton.setOnClickListener {
            TimePickerFragment()
                .show(childFragmentManager, "timePicker")
        }
        timeButton.setOnClickListener {
            TimePickerFragment()
                .show(childFragmentManager, "timePicker")
        }
        super.onStart()
    }
}