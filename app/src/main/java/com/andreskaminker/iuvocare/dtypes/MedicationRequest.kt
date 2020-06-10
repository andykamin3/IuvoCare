package com.andreskaminker.iuvocare.dtypes

data class MedicationRequest(
    val id: String,
    val medication: String,
    val patient: Patient,
    val scheduledFor: String
) : PatientActions(id) {
    var status: Status = Status.ACTIVO
    override val kind = ActionKind.MEDICATION
}