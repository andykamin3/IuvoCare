package com.andreskaminker.iuvocare.dtypes

/**
 * Create a new appointment
 *
 * @property id
 * @property description
 * @property title
 * @property patient
 * @property scheduledFor
 */
data class Appointment(
    val id: String,
    val description: String,
    val title: String,
    val patient: Patient,
    val scheduledFor: DateResult
) : PatientActions(id) {
    var status = Status.ACTIVO
    override val kind = ActionKind.APPOINTMENT
}