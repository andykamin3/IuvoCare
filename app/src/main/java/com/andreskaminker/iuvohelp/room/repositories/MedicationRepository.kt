package com.andreskaminker.iuvohelp.room.repositories

import com.andreskaminker.iuvohelp.entities.MedicationRequest
import com.andreskaminker.iuvohelp.room.daos.MedicationDao

class MedicationRepository(val medicationDao: MedicationDao) {
    val allMedication = medicationDao.getAllMedications()

    suspend fun addMedication(medication: MedicationRequest) {
        medicationDao.addMedication(medication)
    }

    suspend fun deleteMedication(medication: MedicationRequest) {
        medicationDao.deleteMedication(medication)
    }
}