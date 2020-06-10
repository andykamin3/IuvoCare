package com.andreskaminker.iuvocare.dtypes

abstract class PatientActions(id: String) {
    open val kind: ActionKind = ActionKind.ACTION

}

enum class ActionKind {
    ACTION, MESSAGE, MEDICATION, APPOINTMENT
}