package com.andreskaminker.iuvocare.modules

import com.andreskaminker.iuvocare.entities.Appointment
import com.andreskaminker.iuvocare.entities.MedicationRequest

interface AppointmentFragmentFunctions {
    fun deleteAppointment(appointment: Appointment)
}

interface MedicationFragmentFunctions {
    fun deleteMedication(medicationRequest: MedicationRequest)
}