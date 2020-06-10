package com.andreskaminker.iuvocare.dtypes

data class Patient(
    val id: String,
    val name_given: String,
    val email: String,
    val helper: Array<String>
)