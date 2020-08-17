package com.andreskaminker.iuvohelp.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\bH&\u00a8\u0006\u000b"}, d2 = {"Lcom/andreskaminker/iuvohelp/modules/fabButtonHelpers;", "", "setFabClickListener", "", "clickListener", "Lkotlin/Function0;", "setFabColor", "color", "", "setFabDrawable", "drawable", "iuvohelp_debug"})
public abstract interface fabButtonHelpers {
    
    public abstract void setFabDrawable(@androidx.annotation.DrawableRes()
    int drawable);
    
    public abstract void setFabColor(@androidx.annotation.ColorRes()
    int color);
    
    public abstract void setFabClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> clickListener);
}