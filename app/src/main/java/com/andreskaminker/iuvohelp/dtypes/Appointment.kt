package com.andreskaminker.iuvohelp.dtypes

data class Appointment(
    val id: String,
    val description: String,
    val patient: Patient,
    val scheduledFor: String
) : PatientActions(id) {
    var status = Status.ACTIVO
    override val kind = ActionKind.APPOINTMENT
}