package com.andreskaminker.iuvocare.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.andreskaminker.iuvocare.dtypes.Appointment
import com.andreskaminker.iuvocare.room.daos.AppointmentDao

@Database(entities = arrayOf(Appointment::class), version = 1, exportSchema = false)
abstract class IuvoRoomDatabase : RoomDatabase() {
    abstract fun appointmentDao(): AppointmentDao

    companion object {
        @Volatile
        private var INSTANCE: IuvoRoomDatabase? = null
        fun getDatabase(context: Context): IuvoRoomDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    IuvoRoomDatabase::class.java,
                    "iuvo_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}