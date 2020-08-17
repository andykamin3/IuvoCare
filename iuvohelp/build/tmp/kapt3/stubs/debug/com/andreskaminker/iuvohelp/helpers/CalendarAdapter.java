package com.andreskaminker.iuvohelp.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0014\u0010\u0018\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0006\u00a8\u0006\u001b"}, d2 = {"Lcom/andreskaminker/iuvohelp/helpers/CalendarAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/andreskaminker/iuvohelp/helpers/CalendarAdapter$CalendarElement;", "calendarEvents", "", "Lcom/andreskaminker/iuvoshared/entities/PatientActions;", "(Ljava/util/List;)V", "TAG", "", "binding", "Lcom/andreskaminker/iuvohelp/databinding/CalendarEventMedicineBinding;", "getCalendarEvents", "()Ljava/util/List;", "setCalendarEvents", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "newData", "CalendarElement", "iuvohelp_debug"})
public final class CalendarAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.andreskaminker.iuvohelp.helpers.CalendarAdapter.CalendarElement> {
    private final java.lang.String TAG = "CalendarAdapter";
    private com.andreskaminker.iuvohelp.databinding.CalendarEventMedicineBinding binding;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.andreskaminker.iuvoshared.entities.PatientActions> calendarEvents;
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.andreskaminker.iuvoshared.entities.PatientActions> newData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.andreskaminker.iuvohelp.helpers.CalendarAdapter.CalendarElement onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.andreskaminker.iuvohelp.helpers.CalendarAdapter.CalendarElement holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.andreskaminker.iuvoshared.entities.PatientActions> getCalendarEvents() {
        return null;
    }
    
    public final void setCalendarEvents(@org.jetbrains.annotations.NotNull()
    java.util.List<com.andreskaminker.iuvoshared.entities.PatientActions> p0) {
    }
    
    public CalendarAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.andreskaminker.iuvoshared.entities.PatientActions> calendarEvents) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\n"}, d2 = {"Lcom/andreskaminker/iuvohelp/helpers/CalendarAdapter$CalendarElement;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/andreskaminker/iuvohelp/databinding/CalendarEventMedicineBinding;", "(Lcom/andreskaminker/iuvohelp/helpers/CalendarAdapter;Lcom/andreskaminker/iuvohelp/databinding/CalendarEventMedicineBinding;)V", "renderAppointment", "", "position", "", "renderMedication", "iuvohelp_debug"})
    public final class CalendarElement extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void renderAppointment(int position) {
        }
        
        public final void renderMedication(int position) {
        }
        
        public CalendarElement(@org.jetbrains.annotations.NotNull()
        com.andreskaminker.iuvohelp.databinding.CalendarEventMedicineBinding viewBinding) {
            super(null);
        }
    }
}