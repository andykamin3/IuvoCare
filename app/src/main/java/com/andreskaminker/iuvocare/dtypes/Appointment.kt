package com.andreskaminker.iuvocare.dtypes

import androidx.room.*

/**
 * Create a new appointment
 *
 * @property id
 * @property description
 * @property title
 * @property patient
 * @property scheduledFor
 */
@Entity(tableName = "appointments")
data class Appointment(
    @Ignore val id: String,
    @ColumnInfo(name = "apppointment_description") val description: String,
    @ColumnInfo(name = "apppointment_name") val title: String,
    @Embedded val patient: Patient,
    @Embedded val scheduledFor: DateResult
) : PatientActions(id) {
    init {
    }

    @PrimaryKey(autoGenerate = true)
    var roomInt: Int = 0
    @ColumnInfo(name = "status")
    var status = Status.ACTIVO
    override val kind = ActionKind.APPOINTMENT
}