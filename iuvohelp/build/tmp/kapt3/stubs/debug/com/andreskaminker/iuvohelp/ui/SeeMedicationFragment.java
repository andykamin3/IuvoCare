package com.andreskaminker.iuvohelp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u000e\u0010\"\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nJ\u001a\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010%\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/andreskaminker/iuvohelp/ui/SeeMedicationFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/andreskaminker/iuvohelp/modules/MedicationFragmentFunctions;", "()V", "fabButton", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "medicationAdapter", "Lcom/andreskaminker/iuvohelp/helpers/MedicationAdapter;", "medicationList", "", "Lcom/andreskaminker/iuvoshared/entities/MedicationRequest;", "medicationViewModel", "Lcom/andreskaminker/iuvohelp/room/viewmodel/MedicationViewModel;", "getMedicationViewModel", "()Lcom/andreskaminker/iuvohelp/room/viewmodel/MedicationViewModel;", "medicationViewModel$delegate", "Lkotlin/Lazy;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "v", "Landroid/view/View;", "deleteMedication", "", "medicationRequest", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteConfirmed", "onViewCreated", "view", "updateUI", "Companion", "iuvohelp_debug"})
public final class SeeMedicationFragment extends androidx.fragment.app.Fragment implements com.andreskaminker.iuvohelp.modules.MedicationFragmentFunctions {
    private android.view.View v;
    private com.andreskaminker.iuvohelp.helpers.MedicationAdapter medicationAdapter;
    private java.util.List<com.andreskaminker.iuvoshared.entities.MedicationRequest> medicationList;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.google.android.material.floatingactionbutton.FloatingActionButton fabButton;
    private final kotlin.Lazy medicationViewModel$delegate = null;
    public static final com.andreskaminker.iuvohelp.ui.SeeMedicationFragment.Companion Companion = null;
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
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void updateUI() {
    }
    
    @java.lang.Override()
    public void deleteMedication(@org.jetbrains.annotations.NotNull()
    com.andreskaminker.iuvoshared.entities.MedicationRequest medicationRequest) {
    }
    
    public final void onDeleteConfirmed(@org.jetbrains.annotations.NotNull()
    com.andreskaminker.iuvoshared.entities.MedicationRequest medicationRequest) {
    }
    
    public SeeMedicationFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.andreskaminker.iuvohelp.ui.SeeMedicationFragment newInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/andreskaminker/iuvohelp/ui/SeeMedicationFragment$Companion;", "", "()V", "newInstance", "Lcom/andreskaminker/iuvohelp/ui/SeeMedicationFragment;", "iuvohelp_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.andreskaminker.iuvohelp.ui.SeeMedicationFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}