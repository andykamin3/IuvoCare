package com.andreskaminker.iuvohelp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u0001:\u000223B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J&\u0010&\u001a\u0004\u0018\u00010!2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u000e\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020\u001dJ\b\u0010/\u001a\u00020#H\u0016J\b\u00100\u001a\u00020#H\u0016J\b\u00101\u001a\u00020#H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \u001f*\u0004\u0018\u00010\u001d0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/andreskaminker/iuvohelp/ui/CalendarFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "_binding", "Lcom/andreskaminker/iuvohelp/databinding/FragmentCalendarBinding;", "appointmentViewModel", "Lcom/andreskaminker/iuvohelp/room/viewmodel/AppointmentViewModel;", "getAppointmentViewModel", "()Lcom/andreskaminker/iuvohelp/room/viewmodel/AppointmentViewModel;", "appointmentViewModel$delegate", "Lkotlin/Lazy;", "binding", "getBinding", "()Lcom/andreskaminker/iuvohelp/databinding/FragmentCalendarBinding;", "currentPatient", "Lcom/andreskaminker/iuvoshared/entities/Patient;", "medicationRequests", "", "Lcom/andreskaminker/iuvoshared/entities/MedicationRequest;", "medicationViewModel", "Lcom/andreskaminker/iuvohelp/room/viewmodel/MedicationViewModel;", "getMedicationViewModel", "()Lcom/andreskaminker/iuvohelp/room/viewmodel/MedicationViewModel;", "medicationViewModel$delegate", "scheduledAppointments", "Lcom/andreskaminker/iuvoshared/entities/Appointment;", "selectedDate", "Lorg/threeten/bp/LocalDate;", "today", "kotlin.jvm.PlatformType", "v", "Landroid/view/View;", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDateSelected", "newDate", "onDestroyView", "onStart", "updateUI", "Companion", "DayViewContainer", "iuvohelp_debug"})
public final class CalendarFragment extends androidx.fragment.app.Fragment {
    private final java.lang.String TAG = "CalendarFragment";
    private com.andreskaminker.iuvohelp.databinding.FragmentCalendarBinding _binding;
    private android.view.View v;
    private java.util.List<com.andreskaminker.iuvoshared.entities.MedicationRequest> medicationRequests;
    private java.util.List<com.andreskaminker.iuvoshared.entities.Appointment> scheduledAppointments;
    private final com.andreskaminker.iuvoshared.entities.Patient currentPatient = null;
    private final org.threeten.bp.LocalDate today = null;
    private org.threeten.bp.LocalDate selectedDate;
    private final kotlin.Lazy appointmentViewModel$delegate = null;
    private final kotlin.Lazy medicationViewModel$delegate = null;
    public static final com.andreskaminker.iuvohelp.ui.CalendarFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.andreskaminker.iuvohelp.databinding.FragmentCalendarBinding getBinding() {
        return null;
    }
    
    private final com.andreskaminker.iuvohelp.room.viewmodel.AppointmentViewModel getAppointmentViewModel() {
        return null;
    }
    
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
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void onDateSelected(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.LocalDate newDate) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void updateUI() {
    }
    
    public CalendarFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/andreskaminker/iuvohelp/ui/CalendarFragment$DayViewContainer;", "Lcom/kizitonwose/calendarview/ui/ViewContainer;", "viewRoot", "Landroid/view/View;", "(Landroid/view/View;)V", "binding", "Lcom/andreskaminker/iuvohelp/databinding/DayCalendarLayoutBinding;", "getBinding", "()Lcom/andreskaminker/iuvohelp/databinding/DayCalendarLayoutBinding;", "day", "Lcom/kizitonwose/calendarview/model/CalendarDay;", "getDay", "()Lcom/kizitonwose/calendarview/model/CalendarDay;", "setDay", "(Lcom/kizitonwose/calendarview/model/CalendarDay;)V", "getViewRoot", "()Landroid/view/View;", "iuvohelp_debug"})
    public static final class DayViewContainer extends com.kizitonwose.calendarview.ui.ViewContainer {
        @org.jetbrains.annotations.NotNull()
        public com.kizitonwose.calendarview.model.CalendarDay day;
        @org.jetbrains.annotations.NotNull()
        private final com.andreskaminker.iuvohelp.databinding.DayCalendarLayoutBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View viewRoot = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.kizitonwose.calendarview.model.CalendarDay getDay() {
            return null;
        }
        
        public final void setDay(@org.jetbrains.annotations.NotNull()
        com.kizitonwose.calendarview.model.CalendarDay p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andreskaminker.iuvohelp.databinding.DayCalendarLayoutBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getViewRoot() {
            return null;
        }
        
        public DayViewContainer(@org.jetbrains.annotations.NotNull()
        android.view.View viewRoot) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andreskaminker/iuvohelp/ui/CalendarFragment$Companion;", "", "()V", "iuvohelp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}