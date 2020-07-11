package com.andreskaminker.iuvocare.helpers

import android.os.Build
import androidx.annotation.RequiresApi
import ca.antonious.materialdaypicker.MaterialDayPicker
import com.andreskaminker.iuvocare.dtypes.*
import java.util.*
import java.util.Calendar.DECEMBER

@RequiresApi(Build.VERSION_CODES.O)
object DummyData {

    val medicationRequests: MutableList<MedicationRequest> = mutableListOf()
    val scheduledAppointments: MutableList<Appointment> = mutableListOf()
    val currentPatient = Patient("123", "Andy", "andykamin3@gmail.com", "")

    init {
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
                mutableListOf(
                    MaterialDayPicker.Weekday.FRIDAY,
                    MaterialDayPicker.Weekday.WEDNESDAY
                ),
                "",
                TimeResult(10, 15)
            )
        )
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
            mMonth = Calendar.MONTH
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
            mMonth = DECEMBER
            mDay = 24
            mHour = 15
            mYear = 2020
            mMinutes = 0
        }
    }

}