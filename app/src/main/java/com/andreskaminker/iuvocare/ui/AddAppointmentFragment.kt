package com.andreskaminker.iuvocare.ui

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.andreskaminker.iuvocare.MainActivity
import com.andreskaminker.iuvocare.R
import com.andreskaminker.iuvocare.entities.Appointment
import com.andreskaminker.iuvocare.entities.DateResult
import com.andreskaminker.iuvocare.entities.Patient
import com.andreskaminker.iuvocare.helpers.DummyData
import com.andreskaminker.iuvocare.modules.FormatUtils
import com.andreskaminker.iuvocare.room.viewmodel.AppointmentViewModel
import com.andreskaminker.iuvocare.ui.dialogs.DatePickerFragment
import com.andreskaminker.iuvocare.ui.dialogs.TimePickerFragment
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.fragment_add_appointment.*
import org.threeten.bp.LocalDate
import org.threeten.bp.LocalTime


class AddAppointmentFragment : Fragment(), TimePickerDialog.OnTimeSetListener,
    DatePickerDialog.OnDateSetListener {
    private lateinit var v: View
    private lateinit var dateButton: Button
    private lateinit var timeButton: Button
    private lateinit var auth: FirebaseAuth
    private lateinit var db: FirebaseFirestore
    private lateinit var nameEditText: EditText
    private lateinit var descriptionEditText: EditText
    private lateinit var showDateText: TextView
    private lateinit var showTimeText: TextView

    private val TAG = "AddAppointmentFragment"
    private var dateResult = DateResult()
    private lateinit var patient: Patient
    private var timeSetted = false
    private var dateSetted = false
    private val appointmentViewModel: AppointmentViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_add_appointment, container, false)
        timeButton = v.findViewById(R.id.timeButton)
        dateButton = v.findViewById(R.id.dateButton)
        nameEditText = v.findViewById(R.id.editTextMedicationName)
        showDateText = v.findViewById(R.id.textShowDate)
        showTimeText = v.findViewById(R.id.textShowTime)
        descriptionEditText = v.findViewById(R.id.editTextMedicationDescription)

        return v
    }

    private fun updateUI() {
        val mActivity = requireActivity() as MainActivity
        mActivity.setFabDrawable(R.drawable.ic_baseline_check_24_b)
        mActivity.setFabColor(R.color.colorGreen)
        mActivity.setFabClickListener {
            (requireActivity() as MainActivity).setFabClickListener {
                addAppointment(DummyData.currentPatient)
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
        textShowTime.text = FormatUtils.timeFormatter.format(LocalTime.of(hourOfDay,minute))
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        Log.d(TAG, "Year is $year, month: $month, $dayOfMonth")
        dateResult.apply {
            mDay = dayOfMonth
            mYear = year
            mMonth = month
        }
        dateSetted = true
        textShowDate.text = FormatUtils.selectionFormatter.format(LocalDate.of(year, month, dayOfMonth))
    }

    override fun onStart() {
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
        if (appointmentName != "" && timeSetted && dateSetted) {
            val mAppointment = Appointment(
                "generated",
                appointmentDescription,
                appointmentName,
                patient,
                dateResult
            )
            appointmentViewModel.addAppointment(mAppointment)
            (requireActivity() as MainActivity).setFabColor(R.color.colorAccent)
            val directions =
                AddAppointmentFragmentDirections.actionAddAppointmentFragmentToHomeTabbedScreen()
            v.findNavController().navigate(directions)
        } else {
            Snackbar.make(v, "Completa todos los campos", Snackbar.LENGTH_SHORT).show()
        }
    }

    private fun goToAuth() {
        //TODO: Go back to auth
    }


}