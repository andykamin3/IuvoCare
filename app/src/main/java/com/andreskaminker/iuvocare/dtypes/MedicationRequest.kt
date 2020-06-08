package com.andreskaminker.iuvocare.dtypes

class MedicationRequest(val id: Int, val medication: String,val patient: Patient, val scheduledFor: String) : PatientActions(id) {
    var status : Status = Status.ACTIVO
    override val kind = ActionKind.MEDICATION
}