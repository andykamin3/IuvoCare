package com.andreskaminker.iuvohelp.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0014\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/andreskaminker/iuvohelp/helpers/MedicationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/andreskaminker/iuvohelp/helpers/MedicationAdapter$MedicationHolder;", "parent", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "medicationList", "", "Lcom/andreskaminker/iuvoshared/entities/MedicationRequest;", "getParent", "()Landroidx/fragment/app/Fragment;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "Landroid/view/ViewGroup;", "viewType", "setData", "newData", "MedicationHolder", "iuvohelp_debug"})
public final class MedicationAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.andreskaminker.iuvohelp.helpers.MedicationAdapter.MedicationHolder> {
    private java.util.List<com.andreskaminker.iuvoshared.entities.MedicationRequest> medicationList;
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.Fragment parent = null;
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.andreskaminker.iuvoshared.entities.MedicationRequest> newData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.andreskaminker.iuvohelp.helpers.MedicationAdapter.MedicationHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.andreskaminker.iuvohelp.helpers.MedicationAdapter.MedicationHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.Fragment getParent() {
        return null;
    }
    
    public MedicationAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment parent) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015\u00a8\u0006\u001a"}, d2 = {"Lcom/andreskaminker/iuvohelp/helpers/MedicationAdapter$MedicationHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "cv", "Landroid/view/View;", "(Landroid/view/View;)V", "cardView", "Landroidx/cardview/widget/CardView;", "kotlin.jvm.PlatformType", "getCardView", "()Landroidx/cardview/widget/CardView;", "deleteButton", "Landroid/widget/Button;", "getDeleteButton", "()Landroid/widget/Button;", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "textViewMedicationName", "Landroid/widget/TextView;", "getTextViewMedicationName", "()Landroid/widget/TextView;", "textViewTime", "getTextViewTime", "textViewWeekdays", "getTextViewWeekdays", "iuvohelp_debug"})
    public static final class MedicationHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView textViewMedicationName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView textViewWeekdays = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView imageView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView textViewTime = null;
        private final androidx.cardview.widget.CardView cardView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.Button deleteButton = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextViewMedicationName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextViewWeekdays() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImageView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextViewTime() {
            return null;
        }
        
        public final androidx.cardview.widget.CardView getCardView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getDeleteButton() {
            return null;
        }
        
        public MedicationHolder(@org.jetbrains.annotations.NotNull()
        android.view.View cv) {
            super(null);
        }
    }
}