package com.andreskaminker.iuvocare.ui

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.TimePicker
import androidx.fragment.app.Fragment
import com.andreskaminker.iuvocare.MainActivity
import com.andreskaminker.iuvocare.R
import com.andreskaminker.iuvocare.entities.Appointment
import com.andreskaminker.iuvocare.entities.DateResult
import com.andreskaminker.iuvocare.entities.Helper
import com.andreskaminker.iuvocare.entities.Patient
import com.andreskaminker.iuvocare.ui.dialogs.DatePickerFragment
import com.andreskaminker.iuvocare.ui.dialogs.TimePickerFragment
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.fragment_add_appointment.*


class AddAppointmentFragment : Fragment(), TimePickerDialog.OnTimeSetListener,
    DatePickerDialog.OnDateSetListener {
    private lateinit var v: View
    private lateinit var dateButton: Button
    private lateinit var timeButton: Button
    private lateinit var auth: FirebaseAuth
    private lateinit var db: FirebaseFirestore
    private lateinit var submitButton: Button
    private lateinit var nameEditText: EditText
    private lateinit var descriptionEditText: EditText

    private val TAG = "AddAppointmentFragment"
    private var dateResult = DateResult()
    private lateinit var patient: Patient
    private var timeSetted = false
    private var dateSetted = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_add_appointment, container, false)
        timeButton = v.findViewById(R.id.timeButton)
        dateButton = v.findViewById(R.id.dateButton)
        submitButton = v.findViewById(R.id.confirmButton)
        nameEditText = v.findViewById(R.id.editTextMedicationName)
        descriptionEditText = v.findViewById(R.id.editTextMedicationDescription)

        return v
    }

    private fun updateUI() {
        val mActivity = requireActivity() as MainActivity
        mActivity.setFabDrawable(R.drawable.ic_baseline_check_24_b)
        mActivity.setFabColor(R.color.colorGreen)
        mActivity.setFabClickListener {
            (requireActivity() as MainActivity).setFabClickListener {
                addAppointment(patient)
            }
        }
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        Log.d(TAG, "Hour is $hourOfDay and minutes are $minute")
        dateResult.apply {
            mHour = hourOfDay
            mMinutes = minute
        }
        timeSetted = true
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        Log.d(TAG, "Year is $year, month: $month, $dayOfMonth")
        dateResult.apply {
            mDay = dayOfMonth
            mYear = year
            mMonth = month
        }
        dateSetted = true
    }

    override fun onStart() {
        //updateUI()
        auth = FirebaseAuth.getInstance()
        db = FirebaseFirestore.getInstance()
        var helper: Helper?
        val user = auth.currentUser
        if (user == null) {
            goToAuth()
        } else {
            db.collection("helpers").document(user.uid).get()
                .addOnSuccessListener { documentSnapshot ->
                    helper = documentSnapshot.toObject(Helper::class.java)
                    Log.d(TAG, helper.toString())
                    //TODO: Add listener for button click to add data.
                    if (helper!!.helped == "") {
                        Snackbar.make(
                            v,
                            "Tenés que tener un usuario asociado",
                            Snackbar.LENGTH_SHORT
                        )
                    } else {
                        Log.d(TAG, "Fetching patient info")
                        db.collection("patients").document(helper!!.helped).get()
                            .addOnSuccessListener { documentSnapshot ->
                                patient = documentSnapshot.toObject(Patient::class.java)!!
                                /*submitButton.setOnClickListener {
                                    addAppointment(patient)
                                }
                                 */

                            }
                            .addOnFailureListener { exc ->
                                Log.e(TAG, exc.toString())
                            }
                    }
                }
        }

        dateButton.setOnClickListener {
            DatePickerFragment()
                .show(childFragmentManager, "timePicker")
        }

        timeButton.setOnClickListener {
            TimePickerFragment()
                .show(childFragmentManager, "timePicker")
        }

        super.onStart()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        updateUI()
    }


    private fun addAppointment(patient: Patient) {
        val appointmentName = editTextMedicationName.text.toString()
        val appointmentDescription = editTextMedicationDescription.text.toString()
        if (appointmentName == "" && timeSetted && dateSetted) {
            val mAppointment = Appointment(
                "generated",
                appointmentDescription,
                appointmentName,
                patient,
                dateResult
            )
            Log.d(TAG, "Generated $mAppointment")
        } else {
            Snackbar.make(v, "Completa todos los campos", Snackbar.LENGTH_SHORT).show()
        }
        Log.d(TAG, "$timeSetted & $ $dateSetted")

    }

    private fun goToAuth() {
        //TODO: Go back to auth
    }


}