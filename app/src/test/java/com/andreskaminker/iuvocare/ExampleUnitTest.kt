package com.andreskaminker.iuvocare

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun decemberIsTwelve() {
        assertEquals(Calendar.DECEMBER, 11)
    }

    @Test
    fun januaryIs0() {
        assertEquals(Calendar.JANUARY, 0)
    }


}