package com.andreskaminker.iuvohelp.dtypes

abstract class PatientActions(id: String) {
    open val kind: ActionKind = ActionKind.ACTION

}

enum class ActionKind {
    ACTION, MESSAGE, MEDICATION, APPOINTMENT
}