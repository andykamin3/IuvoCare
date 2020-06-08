package com.andreskaminker.iuvocare.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.andreskaminker.iuvocare.R
import com.andreskaminker.iuvocare.fragments.nscren.TimePickerFragment
import kotlinx.android.synthetic.main.bottom_nav_bar.view.*

class AddAppointmentFragment : Fragment() {
    private lateinit var v: View
    private lateinit var appBar: View
    private lateinit var dateButton: Button
    private lateinit var timeButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        v = inflater.inflate(R.layout.fragment_add_appointment, container, false)
        appBar = v.findViewById(R.id.appBar)
        timeButton = v.findViewById(R.id.timeButton)
        dateButton = v.findViewById(R.id.dateButton)
        return v;
    }

    override fun onStart() {
        appBar.fab.setImageDrawable(resources.getDrawable(R.drawable.ic_pill))
        dateButton.setOnClickListener{
            TimePickerFragment()
                .show(childFragmentManager, "timePicker")
        }
        timeButton.setOnClickListener{
            TimePickerFragment()
                .show(childFragmentManager, "timePicker")
        }
        appBar.fab.setOnClickListener{
            val directions = AddAppointmentFragmentDirections.actionAddAppointmentFragmentToAddMedicationFragment()
            v.findNavController().navigate(directions)
        }
        super.onStart()
    }
}