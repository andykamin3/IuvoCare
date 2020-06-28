package com.andreskaminker.iuvocare.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import ca.antonious.materialdaypicker.MaterialDayPicker
import com.andreskaminker.iuvocare.R
import com.andreskaminker.iuvocare.dtypes.*
import com.applandeo.materialcalendarview.EventDay
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*

class CalendarFragment : Fragment() {
    private val TAG = "CalendarFragment"
    private lateinit var fab: FloatingActionButton
    private lateinit var appBar: View
    private lateinit var v: View
    private lateinit var calendarView: com.applandeo.materialcalendarview.CalendarView
    private lateinit var medicationRequests: MutableList<MedicationRequest>
    private lateinit var scheduledAppointments: MutableList<Appointment>
    private val currentPatient = Patient("123", "Andy", "andykamin3@gmail.com", "")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_calendar, container, false)
        appBar = this.requireActivity().findViewById(R.id.coordinatorLayout)
        fab = appBar.findViewById(R.id.fab)
        calendarView = v.findViewById(R.id.datePicker)
        return v
    }

    override fun onStart() {
        super.onStart()
        generateDummyData()

        val events = mutableListOf<EventDay>()
        val mCalendar = Calendar.getInstance()
        /*medicationRequests.forEach{ medicationRequest ->
            medicationRequest.scheduledFor.forEach {day->
                val thisWeek = mCalendar.get(Calendar.WEEK_OF_YEAR)
            }
        } TODO: PREGUNTAR PROFES DIAS DE LA SEMANA */

        scheduledAppointments.forEach { appointment ->
            val newDay = mCalendar
            newDay.set(
                appointment.scheduledFor.mYear,
                appointment.scheduledFor.mMonth,
                appointment.scheduledFor.mDay,
                appointment.scheduledFor.mHour,
                appointment.scheduledFor.mMinutes
            )
            val newEventDay = EventDay(newDay)
            events.add(newEventDay)
        }
        Log.d(TAG, "events: $events")
        calendarView.setEvents(events)

        updateUI()
    }

    private fun generateDummyData() {
        medicationRequests = mutableListOf()
        medicationRequests.add(
            MedicationRequest(
                "111",
                "Ritalin 15mg",
                currentPatient,
                mutableListOf(MaterialDayPicker.Weekday.MONDAY),
                "",
                TimeResult(2, 30)
            )
        )
        medicationRequests.add(
            MedicationRequest(
                "111",
                "Ritalin 15mg",
                currentPatient,
                mutableListOf(MaterialDayPicker.Weekday.FRIDAY, MaterialDayPicker.Weekday.MONDAY),
                "",
                TimeResult(10, 0)
            )
        )

        scheduledAppointments = mutableListOf()
        scheduledAppointments.add(
            Appointment(
                id = "111",
                patient = currentPatient,
                scheduledFor = DateResult(),
                title = "Cardiologo",
                description = "Doctor Jones en Gurruchaga 2121"
            )
        )
        scheduledAppointments.last().scheduledFor.apply {
            mMonth = Calendar.JUNE
            mDay = 23
            mHour = 12
            mYear = 2020
            mMinutes = 0
        }
        scheduledAppointments.add(
            Appointment(
                id = "111",
                patient = currentPatient,
                scheduledFor = DateResult(),
                title = "Cardiologo",
                description = "Doctor Jones en Gurruchaga 2121"
            )
        )
        scheduledAppointments.last().scheduledFor.apply {
            mMonth = Calendar.JULY
            mDay = 24
            mHour = 15
            mYear = 2020
            mMinutes = 0
        }
    }

    private fun updateUI() {
        fab.apply {
            setImageDrawable(resources.getDrawable(R.drawable.ic_baseline_post_add_24))
            setOnClickListener {
                val directions =
                    CalendarFragmentDirections.actionCalendarFragmentToAddAppointmentFragment()
                v.findNavController().navigate(directions)
            }
        }
    }
}


