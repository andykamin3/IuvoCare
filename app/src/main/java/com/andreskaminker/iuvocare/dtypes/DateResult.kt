package com.andreskaminker.iuvocare.dtypes

import kotlin.properties.Delegates

class DateResult {
    var mMinutes by Delegates.notNull<Int>()
    var mSeconds by Delegates.notNull<Int>()
    var mHour by Delegates.notNull<Int>()
    var mDay by Delegates.notNull<Int>()
    var mMonth by Delegates.notNull<Int>()
    var mYear by Delegates.notNull<Int>()

}