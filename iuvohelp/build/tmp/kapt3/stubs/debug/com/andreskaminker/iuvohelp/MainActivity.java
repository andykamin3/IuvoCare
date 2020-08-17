package com.andreskaminker.iuvohelp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020%2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0012\u0010-\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0016\u00100\u001a\u00020%2\f\u00101\u001a\b\u0012\u0004\u0012\u00020%02H\u0016J\u0012\u00103\u001a\u00020%2\b\b\u0001\u00104\u001a\u000205H\u0016J\u0012\u00106\u001a\u00020%2\b\b\u0001\u00107\u001a\u000205H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u00068"}, d2 = {"Lcom/andreskaminker/iuvohelp/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/andreskaminker/iuvohelp/modules/fabButtonHelpers;", "()V", "TAG", "", "bottomAppBar", "Lcom/google/android/material/bottomappbar/BottomAppBar;", "getBottomAppBar", "()Lcom/google/android/material/bottomappbar/BottomAppBar;", "setBottomAppBar", "(Lcom/google/android/material/bottomappbar/BottomAppBar;)V", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "getDrawerLayout", "()Landroidx/drawerlayout/widget/DrawerLayout;", "setDrawerLayout", "(Landroidx/drawerlayout/widget/DrawerLayout;)V", "fabButton", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "getFabButton", "()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "setFabButton", "(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)V", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "navView", "Lcom/google/android/material/navigation/NavigationView;", "getNavView", "()Lcom/google/android/material/navigation/NavigationView;", "setNavView", "(Lcom/google/android/material/navigation/NavigationView;)V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setFabClickListener", "clickListener", "Lkotlin/Function0;", "setFabColor", "color", "", "setFabDrawable", "drawable", "iuvohelp_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.andreskaminker.iuvohelp.modules.fabButtonHelpers {
    private final java.lang.String TAG = "MainActivity";
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.bottomappbar.BottomAppBar bottomAppBar;
    @org.jetbrains.annotations.NotNull()
    public androidx.navigation.NavController navController;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.navigation.NavigationView navView;
    @org.jetbrains.annotations.NotNull()
    public androidx.drawerlayout.widget.DrawerLayout drawerLayout;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.floatingactionbutton.FloatingActionButton fabButton;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.bottomappbar.BottomAppBar getBottomAppBar() {
        return null;
    }
    
    public final void setBottomAppBar(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomappbar.BottomAppBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public final void setNavController(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.navigation.NavigationView getNavView() {
        return null;
    }
    
    public final void setNavView(@org.jetbrains.annotations.NotNull()
    com.google.android.material.navigation.NavigationView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.drawerlayout.widget.DrawerLayout getDrawerLayout() {
        return null;
    }
    
    public final void setDrawerLayout(@org.jetbrains.annotations.NotNull()
    androidx.drawerlayout.widget.DrawerLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.floatingactionbutton.FloatingActionButton getFabButton() {
        return null;
    }
    
    public final void setFabButton(@org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.FloatingActionButton p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void setFabDrawable(@androidx.annotation.DrawableRes()
    int drawable) {
    }
    
    @java.lang.Override()
    public void setFabColor(@androidx.annotation.ColorRes()
    int color) {
    }
    
    @java.lang.Override()
    public void setFabClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> clickListener) {
    }
    
    public MainActivity() {
        super();
    }
}