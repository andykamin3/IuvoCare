package com.andreskaminker.iuvocare.dtypes

data class Patient(
    val id: String,
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