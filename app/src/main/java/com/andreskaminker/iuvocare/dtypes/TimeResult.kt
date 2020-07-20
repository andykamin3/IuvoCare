package com.andreskaminker.iuvocare.dtypes

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

class TimeResult(val hour: Int, val minutes: Int) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var roomInt = 0

}