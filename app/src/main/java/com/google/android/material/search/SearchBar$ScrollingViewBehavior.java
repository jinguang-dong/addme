package com.google.android.material.search;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.rih;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    private boolean e;

    public SearchBar$ScrollingViewBehavior() {
        this.e = false;
    }

    @Override // defpackage.rid
    public final boolean an() {
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.rif, defpackage.clc
    public final /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.h(coordinatorLayout, view, i);
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.clc
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
        super.l(coordinatorLayout, view, view2);
        if (this.e || !(view2 instanceof AppBarLayout)) {
            return;
        }
        this.e = true;
        AppBarLayout appBarLayout = (AppBarLayout) view2;
        appBarLayout.setBackgroundColor(0);
        rih.a(appBarLayout, 0.0f);
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
    }
}
