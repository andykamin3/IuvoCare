package com.andreskaminker.iuvohelp.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/andreskaminker/iuvohelp/helpers/AdapterAction;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/andreskaminker/iuvohelp/helpers/AdapterAction$ActionViewHolder;", "patientActions", "Ljava/util/ArrayList;", "Lcom/andreskaminker/iuvoshared/entities/PatientActions;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ActionViewHolder", "iuvohelp_debug"})
public final class AdapterAction extends androidx.recyclerview.widget.RecyclerView.Adapter<com.andreskaminker.iuvohelp.helpers.AdapterAction.ActionViewHolder> {
    private final java.util.ArrayList<com.andreskaminker.iuvoshared.entities.PatientActions> patientActions = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.andreskaminker.iuvohelp.helpers.AdapterAction.ActionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.andreskaminker.iuvohelp.helpers.AdapterAction.ActionViewHolder holder, int position) {
    }
    
    public AdapterAction(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.andreskaminker.iuvoshared.entities.PatientActions> patientActions) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/andreskaminker/iuvohelp/helpers/AdapterAction$ActionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "cardView", "Landroidx/cardview/widget/CardView;", "(Landroidx/cardview/widget/CardView;)V", "getCardView", "()Landroidx/cardview/widget/CardView;", "cv", "getCv", "textViewKind", "Landroid/widget/TextView;", "getTextViewKind", "()Landroid/widget/TextView;", "textViewMain", "getTextViewMain", "textViewStatus", "getTextViewStatus", "textViewTime", "getTextViewTime", "iuvohelp_debug"})
    public static final class ActionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView cv = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView textViewMain = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView textViewKind = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView textViewStatus = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView textViewTime = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView cardView = null;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCv() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextViewMain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextViewKind() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextViewStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextViewTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCardView() {
            return null;
        }
        
        public ActionViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.cardview.widget.CardView cardView) {
            super(null);
        }
    }
}