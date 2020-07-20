package com.andreskaminker.iuvocare.dtypes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "date_results")
class DateResult {
    @PrimaryKey(autoGenerate = true)
    var roomInt = 0
    @ColumnInfo(name = "minutes")
    var mMinutes: Int? = null
    @Ignore
    var mSeconds: Int? = 0
    @ColumnInfo(name = "hour")
    var mHour: Int? = null
    @ColumnInfo(name = "day")
    var mDay: Int? = null
    @ColumnInfo(name = "month")
    var mMonth: Int? = null
    @ColumnInfo(name = "year")
    var mYear: Int? = null

}