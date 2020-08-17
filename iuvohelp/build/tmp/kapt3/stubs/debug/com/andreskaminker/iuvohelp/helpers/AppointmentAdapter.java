package com.andreskaminker.iuvohelp.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0012H\u0016J\u0014\u0010\u001c\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lcom/andreskaminker/iuvohelp/helpers/AppointmentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/andreskaminker/iuvohelp/helpers/AppointmentAdapter$AppointmentHolder;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "appointmentList", "", "Lcom/andreskaminker/iuvoshared/entities/Appointment;", "getAppointmentList", "()Ljava/util/List;", "setAppointmentList", "(Ljava/util/List;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "formatStringDate", "", "position", "", "formatTime", "getItemCount", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "newData", "AppointmentHolder", "iuvohelp_debug"})
public final class AppointmentAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.andreskaminker.iuvohelp.helpers.AppointmentAdapter.AppointmentHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.andreskaminker.iuvoshared.entities.Appointment> appointmentList;
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.Fragment fragment = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.andreskaminker.iuvoshared.entities.Appointment> getAppointmentList() {
        return null;
    }
    
    public final void setAppointmentList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.andreskaminker.iuvoshared.entities.Appointment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.andreskaminker.iuvohelp.helpers.AppointmentAdapter.AppointmentHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.andreskaminker.iuvoshared.entities.Appointment> newData) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.andreskaminker.iuvohelp.helpers.AppointmentAdapter.AppointmentHolder holder, int position) {
    }
    
    private final java.lang.String formatStringDate(int position) {
        return null;
    }
    
    private final java.lang.String formatTime(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.Fragment getFragment() {
        return null;
    }
    
    public AppointmentAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/andreskaminker/iuvohelp/helpers/AppointmentAdapter$AppointmentHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/andreskaminker/iuvohelp/databinding/CardAppointmentBinding;", "(Lcom/andreskaminker/iuvohelp/databinding/CardAppointmentBinding;)V", "getBinding", "()Lcom/andreskaminker/iuvohelp/databinding/CardAppointmentBinding;", "iuvohelp_debug"})
    public static final class AppointmentHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.andreskaminker.iuvohelp.databinding.CardAppointmentBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.andreskaminker.iuvohelp.databinding.CardAppointmentBinding getBinding() {
            return null;
        }
        
        public AppointmentHolder(@org.jetbrains.annotations.NotNull()
        com.andreskaminker.iuvohelp.databinding.CardAppointmentBinding binding) {
            super(null);
        }
    }
}