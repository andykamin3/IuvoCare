package com.andreskaminker.iuvohelp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0016J&\u0010&\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J*\u0010-\u001a\u00020!2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201H\u0016J\b\u00104\u001a\u00020!H\u0016J\"\u00105\u001a\u00020!2\b\u0010.\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u0002012\u0006\u00108\u001a\u000201H\u0016J\b\u00109\u001a\u00020!H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/andreskaminker/iuvohelp/ui/AddAppointmentFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/app/TimePickerDialog$OnTimeSetListener;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "()V", "TAG", "", "appointmentViewModel", "Lcom/andreskaminker/iuvohelp/room/viewmodel/AppointmentViewModel;", "getAppointmentViewModel", "()Lcom/andreskaminker/iuvohelp/room/viewmodel/AppointmentViewModel;", "appointmentViewModel$delegate", "Lkotlin/Lazy;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "dateButton", "Landroid/widget/Button;", "dateResult", "Lcom/andreskaminker/iuvoshared/entities/DateResult;", "dateSetted", "", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "descriptionEditText", "Landroid/widget/EditText;", "nameEditText", "patient", "Lcom/andreskaminker/iuvoshared/entities/Patient;", "timeButton", "timeSetted", "v", "Landroid/view/View;", "addAppointment", "", "goToAuth", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDateSet", "view", "Landroid/widget/DatePicker;", "year", "", "month", "dayOfMonth", "onStart", "onTimeSet", "Landroid/widget/TimePicker;", "hourOfDay", "minute", "updateUI", "iuvohelp_debug"})
public final class AddAppointmentFragment extends androidx.fragment.app.Fragment implements android.app.TimePickerDialog.OnTimeSetListener, android.app.DatePickerDialog.OnDateSetListener {
    private android.view.View v;
    private android.widget.Button dateButton;
    private android.widget.Button timeButton;
    private com.google.firebase.auth.FirebaseAuth auth;
    private com.google.firebase.firestore.FirebaseFirestore db;
    private android.widget.EditText nameEditText;
    private android.widget.EditText descriptionEditText;
    private final java.lang.String TAG = "AddAppointmentFragment";
    private com.andreskaminker.iuvoshared.entities.DateResult dateResult;
    private com.andreskaminker.iuvoshared.entities.Patient patient;
    private boolean timeSetted = false;
    private boolean dateSetted = false;
    private final kotlin.Lazy appointmentViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.andreskaminker.iuvohelp.room.viewmodel.AppointmentViewModel getAppointmentViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void updateUI() {
    }
    
    @java.lang.Override()
    public void onTimeSet(@org.jetbrains.annotations.Nullable()
    android.widget.TimePicker view, int hourOfDay, int minute) {
    }
    
    @java.lang.Override()
    public void onDateSet(@org.jetbrains.annotations.Nullable()
    android.widget.DatePicker view, int year, int month, int dayOfMonth) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void addAppointment(com.andreskaminker.iuvoshared.entities.Patient patient) {
    }
    
    private final void goToAuth() {
    }
    
    public AddAppointmentFragment() {
        super();
    }
}