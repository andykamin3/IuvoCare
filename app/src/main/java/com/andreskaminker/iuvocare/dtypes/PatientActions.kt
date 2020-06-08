package com.andreskaminker.iuvocare.dtypes

open abstract class PatientActions (id: Int){
    open val kind : ActionKind = ActionKind.ACTION

}
enum class ActionKind {
    ACTION, MESSAGE, MEDICATION, APPOINTMENT
}