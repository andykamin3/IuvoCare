package com.andreskaminker.iuvocare.fragments

import android.app.TimePickerDialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TimePicker
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import ca.antonious.materialdaypicker.MaterialDayPicker
import com.andreskaminker.iuvocare.R
import com.andreskaminker.iuvocare.dtypes.Config
import com.andreskaminker.iuvocare.dtypes.MedicationRequest
import com.andreskaminker.iuvocare.dtypes.Patient
import com.andreskaminker.iuvocare.dtypes.TimeResult
import com.andreskaminker.iuvocare.fragments.nscren.TimePickerFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar


class AddMedicationFragment : Fragment(), TimePickerDialog.OnTimeSetListener {
    private val TAG = "AddMedicationFragment"
    private lateinit var v: View
    private lateinit var timeButton: Button
    private lateinit var fab: FloatingActionButton
    private lateinit var appBar: CoordinatorLayout
    private lateinit var materialPicker: MaterialDayPicker
    private lateinit var timeResult: TimeResult
    private var timeSet = false
    private var imageSet = false
    private lateinit var nameEditText: EditText
    private lateinit var descriptionEditText: EditText
    private lateinit var submitButton: Button
    private lateinit var imageButton: Button
    private val currentPatient = Patient("123", "Andy", "andykamin3@gmail.com", "")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_add_medication, container, false)
        materialPicker = v.findViewById(R.id.day_picker)
        timeButton = v.findViewById(R.id.timeButton)
        appBar = this.requireActivity().findViewById(R.id.bar_coordinator_layout)
        nameEditText = v.findViewById(R.id.editTextMedicationName)
        descriptionEditText = v.findViewById(R.id.editTextMedicationDescription)
        submitButton = v.findViewById(R.id.submitButton)
        imageButton = v.findViewById(R.id.imageButton)
        fab = appBar.findViewById(R.id.fab)
        return v
    }

    override fun onStart() {
        super.onStart()
        updateUI()

        timeButton.setOnClickListener {
            TimePickerFragment()
                .show(childFragmentManager, "timePicker")
        }

        imageButton.setOnClickListener {
            imageSet = true
        }

        submitButton.setOnClickListener {
            addMedication()
        }
    }

    private fun addMedication() {
        super.onStart()
        val medicationName = nameEditText.text.toString()
        val medicationDescription = descriptionEditText.text.toString()
        val weekDays = materialPicker.selectedDays
        if (timeSet && medicationName != "" && weekDays.isNotEmpty() && imageSet) {
            val medicationRequest = MedicationRequest(
                id = "generated",
                patient = currentPatient,
                medication = medicationName,
                scheduledFor = weekDays,
                imageURL = "https://firstaidforlife.org.uk/wp-content/uploads/2018/03/poisoning-pill-bottle.jpg",
                takeTime = timeResult
            )
            Log.d(TAG, medicationRequest.toString())
        } else {
            Snackbar
                .make(v, "Por favor completar los campos obligatorios", Snackbar.LENGTH_SHORT)
                .setAnimationMode(Snackbar.ANIMATION_MODE_SLIDE)
                .show()
        }
    }

    private fun updateUI() {
        materialPicker.locale = Config.default_locale
        fab.apply {
            setImageDrawable(resources.getDrawable(R.drawable.ic_baseline_post_add_24))
            setOnClickListener {
                val directions =
                    AddMedicationFragmentDirections.actionAddMedicationFragmentToAddAppointmentFragment()
                v.findNavController().navigate(directions)
            }
        }
    }


    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        timeResult = TimeResult(hour = hourOfDay, minutes = minute)
        timeSet = true
    }


    //https://github.com/gantonious/MaterialDayPicker for the implementation of the week day picker using Calendar

}