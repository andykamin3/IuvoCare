package com.andreskaminker.iuvohelp.dtypes

data class Helper(
    val id: String,
    val name_given: String,
    val email: String,
    val helped: Array<String>
)