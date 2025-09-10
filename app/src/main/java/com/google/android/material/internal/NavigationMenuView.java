package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.gb;
import defpackage.go;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements go {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ad(new LinearLayoutManager(1));
    }

    @Override // defpackage.go
    public final void a(gb gbVar) {
    }
}
