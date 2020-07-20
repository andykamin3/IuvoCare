package com.andreskaminker.iuvocare.dtypes

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import ca.antonious.materialdaypicker.MaterialDayPicker

@Entity(tableName = "medications")
data class MedicationRequest(
    val id: String,
    @ColumnInfo(name = "medication_name") val medication: String,
    @Embedded val patient: Patient,
    @Embedded val scheduledFor: List<MaterialDayPicker.Weekday>,
    @ColumnInfo(name = "medication_image") val imageURL: String,
    @Embedded val takeTime: TimeResult
) : PatientActions(id) {
    var status: Status = Status.ACTIVO
    override val kind = ActionKind.MEDICATION
    @PrimaryKey(autoGenerate = true)
    val roomInt = 0
}