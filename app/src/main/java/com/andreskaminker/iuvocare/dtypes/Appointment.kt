package com.andreskaminker.iuvocare.dtypes

class Appointment(val id: Int, val description: String, val patient: Patient, val scheduledFor: String) : PatientActions(id) {
    var status = Status.ACTIVO
    override val kind = ActionKind.APPOINTMENT
}