package com.andreskaminker.iuvocare.entities

import androidx.room.Entity

@Entity(tableName = "patients")
data class Patient(
    val patId: String,
    val name_given: String,
    val email: String,
    val helper: String
) {
    constructor() : this(
        "",
        "",
        "",
        ""
    ) { //Empty constructor for Firebase deserialization purposes}
    }
}