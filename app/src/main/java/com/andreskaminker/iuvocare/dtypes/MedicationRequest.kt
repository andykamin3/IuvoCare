package com.andreskaminker.iuvocare.dtypes

import ca.antonious.materialdaypicker.MaterialDayPicker

data class MedicationRequest(
    val id: String,
    val medication: String,
    val patient: Patient,
    val scheduledFor: List<MaterialDayPicker.Weekday>,
    val imageURL: String,
    val takeTime: TimeResult
) : PatientActions(id) {
    var status: Status = Status.ACTIVO
    override val kind = ActionKind.MEDICATION
}