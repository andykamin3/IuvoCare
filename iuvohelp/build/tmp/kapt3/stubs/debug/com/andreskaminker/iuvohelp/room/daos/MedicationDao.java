package com.andreskaminker.iuvohelp.room.daos;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/andreskaminker/iuvohelp/room/daos/MedicationDao;", "", "addMedication", "", "vararg", "Lcom/andreskaminker/iuvoshared/entities/MedicationRequest;", "(Lcom/andreskaminker/iuvoshared/entities/MedicationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMedication", "getAllMedications", "Landroidx/lifecycle/LiveData;", "", "iuvohelp_debug"})
public abstract interface MedicationDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object addMedication(@org.jetbrains.annotations.NotNull()
    com.andreskaminker.iuvoshared.entities.MedicationRequest vararg, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM medications")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.andreskaminker.iuvoshared.entities.MedicationRequest>> getAllMedications();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteMedication(@org.jetbrains.annotations.NotNull()
    com.andreskaminker.iuvoshared.entities.MedicationRequest vararg, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}