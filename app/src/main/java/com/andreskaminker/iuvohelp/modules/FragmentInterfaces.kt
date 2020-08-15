package com.andreskaminker.iuvohelp.modules

import com.andreskaminker.iuvohelp.entities.Appointment
import com.andreskaminker.iuvohelp.entities.MedicationRequest

interface AppointmentFragmentFunctions {
    fun deleteAppointment(appointment: Appointment)
}

interface MedicationFragmentFunctions {
    fun deleteMedication(medicationRequest: MedicationRequest)
}