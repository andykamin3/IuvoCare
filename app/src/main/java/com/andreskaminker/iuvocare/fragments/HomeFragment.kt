package com.andreskaminker.iuvocare.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.andreskaminker.iuvocare.R
import com.andreskaminker.iuvocare.dtypes.Appointment
import com.andreskaminker.iuvocare.dtypes.MedicationRequest
import com.andreskaminker.iuvocare.dtypes.Patient
import com.andreskaminker.iuvocare.dtypes.PatientActions
import com.andreskaminker.iuvocare.helpers.ActionAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Time
import java.sql.Timestamp
import java.time.Instant


class HomeFragment : Fragment() {
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var v: View
    private lateinit var actionDisplay: RecyclerView
    private lateinit var viewAdapter: ActionAdapter
    private lateinit var fabButton: FloatingActionButton
    private val currentPatient = Patient(123, "Andy")
    private val patientActions = arrayListOf<PatientActions>(
        MedicationRequest(111, "Ritalin 15mg", currentPatient, "18-07 19:30"),
        MedicationRequest(110, "Ibuprofeno 200mg", currentPatient, "18-07 20:30"),
        Appointment(304, "Dr. Korenblit", currentPatient, "10-07 10:00"),
        Appointment(304, "Dra. Levy", currentPatient, "13-07 10:00")
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
        fabButton = v.findViewById(R.id.fab)
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
    override fun onStart() {
        super.onStart()
        fabButton.setOnClickListener{
            val directions = HomeFragmentDirections.actionFragmentHomeToAddAppointmentFragment()
            v.findNavController().navigate(directions)
        }

    }


}