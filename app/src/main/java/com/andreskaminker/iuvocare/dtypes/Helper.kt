package com.andreskaminker.iuvocare.dtypes

data class Helper(
    val id: String,
    val name_given: String,
    val email: String,
    val helped: String
) {

    constructor() : this("", "", "", "") { //Empty constructor for Firebase deserialization purposes

    }

}
