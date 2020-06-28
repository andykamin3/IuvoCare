package com.andreskaminker.iuvocare.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.andreskaminker.iuvocare.R
import com.andreskaminker.iuvocare.dtypes.*
import com.andreskaminker.iuvocare.helpers.AdapterAction
import kotlinx.android.synthetic.main.activity_main.view.*


class HomeFragment : Fragment() { //TODO: Add implementation of tabbed display.
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var v: View
    private lateinit var actionDisplay: RecyclerView
    private lateinit var viewAdapter: AdapterAction
    private val currentPatient = Patient("123", "Andy", "andykamin3@gmail.com", "")
    private val tempResult = DateResult()
    private val patientActions = arrayListOf<PatientActions>(
        MedicationRequest("111", "Ritalin 15mg", currentPatient, emptyList(), "", TimeResult(2, 3)),
        MedicationRequest(
            "110",
            "Ibuprofeno 200mg",
            currentPatient,
            emptyList(),
            "",
            TimeResult(2, 3)
        )

        /*Appointment("304", "Dr. Korenblit", currentPatient, "10-07 10:00"),
        Appointment("304", "Dra. Levy", currentPatient, "13-07 10:00")*/
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tempResult.apply {
            mMinutes = 10
            mMonth = 6
            mHour = 12
            mYear = 2019
            mDay = 21
        }
        val tempAppointment = Appointment(
            id = "2223",
            description = "Cita con el Dr. Korenblit",
            title = "Cardiólogo",
            patient = currentPatient,
            scheduledFor = tempResult
        )
        patientActions.add(tempAppointment)
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_home, container, false)
        viewAdapter = AdapterAction(patientActions)
        actionDisplay = v.findViewById(R.id.actionDisplay)
        linearLayoutManager = LinearLayoutManager(context)
        actionDisplay.apply {
            layoutManager = linearLayoutManager
            adapter = viewAdapter
        }
        return v
    }

    override fun onStart() {
        val appBar = requireActivity().findViewById<View>(R.id.bar_coordinator_layout)
        appBar.visibility = View.VISIBLE
        appBar.fab.setOnClickListener {
            val directions = HomeFragmentDirections.actionFragmentHomeToAddAppointmentFragment()
            v.findNavController().navigate(directions)
        }
        super.onStart()
    }

}