package com.andreskaminker.iuvohelp.room;

import java.lang.System;

@androidx.room.Database(entities = {com.andreskaminker.iuvoshared.entities.Appointment.class, com.andreskaminker.iuvoshared.entities.MedicationRequest.class}, version = 5, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/andreskaminker/iuvohelp/room/IuvoRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "appointmentDao", "Lcom/andreskaminker/iuvohelp/room/daos/AppointmentDao;", "medicationDao", "Lcom/andreskaminker/iuvohelp/room/daos/MedicationDao;", "Companion", "iuvohelp_debug"})
public abstract class IuvoRoomDatabase extends androidx.room.RoomDatabase {
    private static volatile com.andreskaminker.iuvohelp.room.IuvoRoomDatabase INSTANCE;
    public static final com.andreskaminker.iuvohelp.room.IuvoRoomDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.andreskaminker.iuvohelp.room.daos.AppointmentDao appointmentDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.andreskaminker.iuvohelp.room.daos.MedicationDao medicationDao();
    
    public IuvoRoomDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/andreskaminker/iuvohelp/room/IuvoRoomDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/andreskaminker/iuvohelp/room/IuvoRoomDatabase;", "getDatabase", "context", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "iuvohelp_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.andreskaminker.iuvohelp.room.IuvoRoomDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope scope) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}