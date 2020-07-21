package com.andreskaminker.iuvocare.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.andreskaminker.iuvocare.entities.Appointment
import com.andreskaminker.iuvocare.entities.MedicationRequest
import com.andreskaminker.iuvocare.helpers.DummyData
import com.andreskaminker.iuvocare.room.daos.AppointmentDao
import com.andreskaminker.iuvocare.room.daos.MedicationDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(
    entities = arrayOf(Appointment::class, MedicationRequest::class),
    version = 2,
    exportSchema = false
)
abstract class IuvoRoomDatabase : RoomDatabase() {
    abstract fun appointmentDao(): AppointmentDao
    abstract fun medicationDao(): MedicationDao
    private class IuvoDatabaseCallback(private val scope: CoroutineScope) :
        RoomDatabase.Callback() {
        override fun onOpen(db: SupportSQLiteDatabase) {
            super.onOpen(db)
            INSTANCE?.let { db ->
                scope.launch {
                    var wordDao = db.appointmentDao()
                    var apt = DummyData.scheduledAppointments[0]
                    wordDao.addAppointment(apt)
                    apt = DummyData.scheduledAppointments[1]
                    wordDao.addAppointment(apt)

                    var medicationDao = db.medicationDao()
                    var mrq = DummyData.medicationRequests[0]
                    medicationDao.addMedication(mrq)
                    mrq = DummyData.medicationRequests[1]
                    medicationDao.addMedication(mrq)
                }
            }
        }
    }

    companion object {
        @Volatile
        private var INSTANCE: IuvoRoomDatabase? = null
        fun getDatabase(context: Context, scope: CoroutineScope): IuvoRoomDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    IuvoRoomDatabase::class.java,
                    "iuvo_database"
                ).fallbackToDestructiveMigration().addCallback(IuvoDatabaseCallback(scope)).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}