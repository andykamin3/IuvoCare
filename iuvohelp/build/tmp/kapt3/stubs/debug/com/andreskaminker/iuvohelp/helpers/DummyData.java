package com.andreskaminker.iuvohelp.helpers;

import java.lang.System;

@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcom/andreskaminker/iuvohelp/helpers/DummyData;", "", "()V", "currentPatient", "Lcom/andreskaminker/iuvoshared/entities/Patient;", "getCurrentPatient", "()Lcom/andreskaminker/iuvoshared/entities/Patient;", "medicationRequests", "", "Lcom/andreskaminker/iuvoshared/entities/MedicationRequest;", "getMedicationRequests", "()Ljava/util/List;", "scheduledAppointments", "Lcom/andreskaminker/iuvoshared/entities/Appointment;", "getScheduledAppointments", "iuvohelp_debug"})
public final class DummyData {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.andreskaminker.iuvoshared.entities.MedicationRequest> medicationRequests = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.andreskaminker.iuvoshared.entities.Appointment> scheduledAppointments = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.andreskaminker.iuvoshared.entities.Patient currentPatient = null;
    public static final com.andreskaminker.iuvohelp.helpers.DummyData INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.andreskaminker.iuvoshared.entities.MedicationRequest> getMedicationRequests() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.andreskaminker.iuvoshared.entities.Appointment> getScheduledAppointments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andreskaminker.iuvoshared.entities.Patient getCurrentPatient() {
        return null;
    }
    
    private DummyData() {
        super();
    }
}