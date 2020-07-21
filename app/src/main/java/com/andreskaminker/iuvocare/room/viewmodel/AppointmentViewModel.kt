package com.andreskaminker.iuvocare.room.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.andreskaminker.iuvocare.dtypes.Appointment
import com.andreskaminker.iuvocare.room.IuvoRoomDatabase
import com.andreskaminker.iuvocare.room.repositories.AppointmentRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AppointmentViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: AppointmentRepository
    val allAppointments: LiveData<List<Appointment>>

    init {
        val appointmentDao = IuvoRoomDatabase.getDatabase(application).appointmentDao()
        repository = AppointmentRepository(appointmentDao)
        allAppointments = repository.allAppointments
    }

    fun addAppointment(appointment: Appointment) = viewModelScope.launch(Dispatchers.IO) {
        repository.addAppointment(appointment)
    }

    fun deleteAppointment(appointment: Appointment) = viewModelScope.launch(Dispatchers.IO) {
        repository.deleteAppointment(appointment)
    }
}