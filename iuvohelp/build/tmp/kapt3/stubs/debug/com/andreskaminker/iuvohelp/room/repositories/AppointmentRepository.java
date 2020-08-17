package com.andreskaminker.iuvohelp.room.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/andreskaminker/iuvohelp/room/repositories/AppointmentRepository;", "", "appointmentDao", "Lcom/andreskaminker/iuvohelp/room/daos/AppointmentDao;", "(Lcom/andreskaminker/iuvohelp/room/daos/AppointmentDao;)V", "allAppointments", "Landroidx/lifecycle/LiveData;", "", "Lcom/andreskaminker/iuvoshared/entities/Appointment;", "getAllAppointments", "()Landroidx/lifecycle/LiveData;", "getAppointmentDao", "()Lcom/andreskaminker/iuvohelp/room/daos/AppointmentDao;", "addAppointment", "", "appointment", "(Lcom/andreskaminker/iuvoshared/entities/Appointment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAppointment", "iuvohelp_debug"})
public final class AppointmentRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.andreskaminker.iuvoshared.entities.Appointment>> allAppointments = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andreskaminker.iuvohelp.room.daos.AppointmentDao appointmentDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.andreskaminker.iuvoshared.entities.Appointment>> getAllAppointments() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addAppointment(@org.jetbrains.annotations.NotNull()
    com.andreskaminker.iuvoshared.entities.Appointment appointment, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAppointment(@org.jetbrains.annotations.NotNull()
    com.andreskaminker.iuvoshared.entities.Appointment appointment, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andreskaminker.iuvohelp.room.daos.AppointmentDao getAppointmentDao() {
        return null;
    }
    
    public AppointmentRepository(@org.jetbrains.annotations.NotNull()
    com.andreskaminker.iuvohelp.room.daos.AppointmentDao appointmentDao) {
        super();
    }
}