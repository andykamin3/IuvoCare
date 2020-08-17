package com.andreskaminker.iuvohelp.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/andreskaminker/iuvohelp/helpers/UserConfigurationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/andreskaminker/iuvohelp/helpers/UserConfigurationAdapter$UserConfigurationHolder;", "patientActions", "Ljava/util/ArrayList;", "Lcom/andreskaminker/iuvoshared/entities/Patient;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "UserConfigurationHolder", "iuvohelp_debug"})
public final class UserConfigurationAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.andreskaminker.iuvohelp.helpers.UserConfigurationAdapter.UserConfigurationHolder> {
    private final java.util.ArrayList<com.andreskaminker.iuvoshared.entities.Patient> patientActions = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.andreskaminker.iuvohelp.helpers.UserConfigurationAdapter.UserConfigurationHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.andreskaminker.iuvohelp.helpers.UserConfigurationAdapter.UserConfigurationHolder holder, int position) {
    }
    
    public UserConfigurationAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.andreskaminker.iuvoshared.entities.Patient> patientActions) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/andreskaminker/iuvohelp/helpers/UserConfigurationAdapter$UserConfigurationHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "cardView", "Landroidx/cardview/widget/CardView;", "(Landroidx/cardview/widget/CardView;)V", "getCardView", "()Landroidx/cardview/widget/CardView;", "cv", "getCv", "iuvohelp_debug"})
    public static final class UserConfigurationHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView cv = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView cardView = null;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCv() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCardView() {
            return null;
        }
        
        public UserConfigurationHolder(@org.jetbrains.annotations.NotNull()
        androidx.cardview.widget.CardView cardView) {
            super(null);
        }
    }
}