package com.andreskaminker.iuvocare.modules

import android.os.Build
import androidx.annotation.RequiresApi
import ca.antonious.materialdaypicker.MaterialDayPicker
import org.threeten.bp.DayOfWeek
import java.time.Month


fun MaterialDayPicker.Weekday.mapToABP(): DayOfWeek {
    when (this) {
        MaterialDayPicker.Weekday.MONDAY -> {
            return DayOfWeek.MONDAY
        }
        MaterialDayPicker.Weekday.TUESDAY -> {
            return DayOfWeek.TUESDAY
        }
        MaterialDayPicker.Weekday.WEDNESDAY -> {
            return DayOfWeek.WEDNESDAY
        }
        MaterialDayPicker.Weekday.THURSDAY -> {
            return DayOfWeek.THURSDAY
        }
        MaterialDayPicker.Weekday.FRIDAY -> {
            return DayOfWeek.FRIDAY
        }
        MaterialDayPicker.Weekday.SATURDAY -> {
            return DayOfWeek.SATURDAY
        }
        MaterialDayPicker.Weekday.SUNDAY -> {
            return DayOfWeek.SUNDAY
        }
        else -> {
            throw Exception("Could not map to ABP as it is not included.")
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
fun Month.mapMonth(): org.threeten.bp.Month {
    when (this) {
        Month.JANUARY -> {
            return org.threeten.bp.Month.JANUARY
        }
        Month.FEBRUARY -> {
            return org.threeten.bp.Month.FEBRUARY
        }
        Month.MARCH -> {
            return org.threeten.bp.Month.MARCH
        }
        Month.APRIL -> {
            return org.threeten.bp.Month.APRIL
        }
        Month.MAY -> {
            return org.threeten.bp.Month.MAY
        }
        Month.JUNE -> {
            return org.threeten.bp.Month.JUNE
        }
        Month.JULY -> {
            return org.threeten.bp.Month.JULY
        }
        Month.AUGUST -> {
            return org.threeten.bp.Month.AUGUST
        }
        Month.SEPTEMBER -> {
            return org.threeten.bp.Month.SEPTEMBER
        }
        Month.OCTOBER -> {
            return org.threeten.bp.Month.OCTOBER
        }
        Month.NOVEMBER -> {
            return org.threeten.bp.Month.NOVEMBER
        }
        Month.DECEMBER -> {
            return org.threeten.bp.Month.DECEMBER
        }
        else -> {
            throw Exception("Not supported")
        }
    }
}


fun mapToABPMonth(month: Int): org.threeten.bp.Month {
    return when (month) {
        0 -> org.threeten.bp.Month.JANUARY
        1 -> org.threeten.bp.Month.FEBRUARY
        2 -> org.threeten.bp.Month.MARCH
        3 -> org.threeten.bp.Month.APRIL
        4 -> org.threeten.bp.Month.MAY
        5 -> org.threeten.bp.Month.JUNE
        6 -> org.threeten.bp.Month.JULY
        7 -> org.threeten.bp.Month.AUGUST
        8 -> org.threeten.bp.Month.SEPTEMBER
        9 -> org.threeten.bp.Month.OCTOBER
        10 -> org.threeten.bp.Month.NOVEMBER
        11 -> org.threeten.bp.Month.DECEMBER
        else -> throw Exception("Hello")
    }
}