package com.andreskaminker.iuvocare.entities

import androidx.room.*
import ca.antonious.materialdaypicker.MaterialDayPicker
import com.andreskaminker.iuvocare.room.converters.KindConverter
import com.andreskaminker.iuvocare.room.converters.StatusConverter

@Entity(tableName = "medications")
@TypeConverters(KindConverter::class, StatusConverter::class)
class MedicationRequest() : PatientActions("") {
    @ColumnInfo(name = "medId")
    var medId: String = ""
    @PrimaryKey
    @ColumnInfo(name = "medication_name")
    var medication: String = ""
    @ColumnInfo(name = "medication_image")
    var imageURL: String = ""
    @ColumnInfo(name = "status")
    var status: Status = Status.ACTIVO
    @ColumnInfo(name = "kind")
    var kind = ActionKind.MEDICATION
    @Embedded
    var patient: Patient = Patient()
    @Ignore
    var scheduledFor: List<MaterialDayPicker.Weekday> = emptyList()
    @Embedded
    var takeTime: TimeResult = TimeResult()

    constructor(
        id: String,
        patient: Patient,
        medicationName: String,
        scheduledFor: List<MaterialDayPicker.Weekday>,
        imageUrl: String,
        takeTime: TimeResult
    ) : this() {
        this.medId = id
        this.medication = medicationName
        this.scheduledFor = scheduledFor
        this.imageURL = imageUrl
        this.takeTime = takeTime
        this.patient = patient
    }

    init {
        status = Status.ACTIVO
        kind = ActionKind.MEDICATION
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MedicationRequest

        if (medId != other.medId) return false
        if (medication != other.medication) return false

        return true
    }

    override fun hashCode(): Int {
        var result = medId.hashCode()
        result = 31 * result + medication.hashCode()
        return result
    }
}