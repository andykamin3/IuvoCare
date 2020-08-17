package com.andreskaminker.iuvohelp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010\u001c2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u001eH\u0016J\"\u0010*\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0016J\b\u00100\u001a\u00020\u001eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/andreskaminker/iuvohelp/ui/AddMedicationFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/app/TimePickerDialog$OnTimeSetListener;", "()V", "TAG", "", "currentPatient", "Lcom/andreskaminker/iuvoshared/entities/Patient;", "descriptionEditText", "Landroid/widget/EditText;", "imageButton", "Landroid/widget/Button;", "imageSet", "", "materialPicker", "Lca/antonious/materialdaypicker/MaterialDayPicker;", "medicationViewModel", "Lcom/andreskaminker/iuvohelp/room/viewmodel/MedicationViewModel;", "getMedicationViewModel", "()Lcom/andreskaminker/iuvohelp/room/viewmodel/MedicationViewModel;", "medicationViewModel$delegate", "Lkotlin/Lazy;", "nameEditText", "timeButton", "timeResult", "Lcom/andreskaminker/iuvoshared/entities/TimeResult;", "timeSet", "v", "Landroid/view/View;", "addMedication", "", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onTimeSet", "view", "Landroid/widget/TimePicker;", "hourOfDay", "", "minute", "updateUI", "iuvohelp_debug"})
public final class AddMedicationFragment extends androidx.fragment.app.Fragment implements android.app.TimePickerDialog.OnTimeSetListener {
    private final java.lang.String TAG = "AddMedicationFragment";
    private android.view.View v;
    private android.widget.Button timeButton;
    private ca.antonious.materialdaypicker.MaterialDayPicker materialPicker;
    private com.andreskaminker.iuvoshared.entities.TimeResult timeResult;
    private boolean timeSet = false;
    private boolean imageSet = false;
    private android.widget.EditText nameEditText;
    private android.widget.EditText descriptionEditText;
    private android.widget.Button imageButton;
    private final kotlin.Lazy medicationViewModel$delegate = null;
    private final com.andreskaminker.iuvoshared.entities.Patient currentPatient = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.andreskaminker.iuvohelp.room.viewmodel.MedicationViewModel getMedicationViewModel() {
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
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void addMedication() {
    }
    
    @java.lang.Override()
    public void onTimeSet(@org.jetbrains.annotations.Nullable()
    android.widget.TimePicker view, int hourOfDay, int minute) {
    }
    
    public AddMedicationFragment() {
        super();
    }
}