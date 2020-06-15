package com.andreskaminker.iuvohelp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.andreskaminker.iuvohelp.R
import com.andreskaminker.iuvohelp.dtypes.Appointment
import com.andreskaminker.iuvohelp.dtypes.MedicationRequest
import com.andreskaminker.iuvohelp.dtypes.Patient
import com.andreskaminker.iuvohelp.dtypes.PatientActions
import com.andreskaminker.iuvohelp.helpers.ActionAdapter
import kotlinx.android.synthetic.main.activity_main.view.*


class HomeFragment : Fragment() {
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var v: View
    private lateinit var actionDisplay: RecyclerView
    private lateinit var viewAdapter: ActionAdapter
    private val currentPatient = Patient("123", "Andy", "andykamin3@gmail.com", arrayOf(""))
    private val patientActions = arrayListOf<PatientActions>(
        MedicationRequest("111", "Ritalin 15mg", currentPatient, "18-07 19:30"),
        MedicationRequest("110", "Ibuprofeno 200mg", currentPatient, "18-07 20:30"),
        Appointment("304", "Dr. Korenblit", currentPatient, "10-07 10:00"),
        Appointment("304", "Dra. Levy", currentPatient, "13-07 10:00")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_home, container, false)
        viewAdapter = ActionAdapter(patientActions)
        actionDisplay = v.findViewById(R.id.actionDisplay)
        linearLayoutManager = LinearLayoutManager(context)
        actionDisplay.apply {
            layoutManager = linearLayoutManager
            adapter = viewAdapter
        }
        return v
    }

    override fun onStart() {
        val appBar = this.requireActivity().findViewById<View>(R.id.bar_coordinator_layout)
        appBar.visibility = View.VISIBLE
        appBar.fab.setOnClickListener {
            val directions = HomeFragmentDirections.actionFragmentHomeToAddAppointmentFragment()
            v.findNavController().navigate(directions)
        }
        super.onStart()


    }


}