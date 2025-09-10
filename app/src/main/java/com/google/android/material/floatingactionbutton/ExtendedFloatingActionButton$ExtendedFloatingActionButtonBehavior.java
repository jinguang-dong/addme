package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.clc;
import defpackage.clf;
import defpackage.rkn;
import defpackage.rku;
import defpackage.rlb;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends clc {
    private Rect a;
    private final boolean b;
    private final boolean c;

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.b = false;
        this.c = true;
    }

    private static boolean a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof clf) {
            return ((clf) layoutParams).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    private final void ak(View view, rkn rknVar) {
        if (b(view, rknVar)) {
            if (view.getTop() >= (rknVar.getHeight() / 2) + ((clf) rknVar.getLayoutParams()).topMargin) {
                throw null;
            }
            throw null;
        }
    }

    private final boolean b(View view, rkn rknVar) {
        return (this.b || this.c) && ((clf) rknVar.getLayoutParams()).f == view.getId();
    }

    private final void c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, rkn rknVar) {
        if (b(appBarLayout, rknVar)) {
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            rlb.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.d()) {
                int i = rkn.b;
                throw null;
            }
            int i2 = rkn.b;
            throw null;
        }
    }

    @Override // defpackage.clc
    public final void d(clf clfVar) {
        if (clfVar.h == 0) {
            clfVar.h = 80;
        }
    }

    @Override // defpackage.clc
    public final /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        rkn rknVar = (rkn) view;
        List listA = coordinatorLayout.a(rknVar);
        int size = listA.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) listA.get(i2);
            if (view2 instanceof AppBarLayout) {
                c(coordinatorLayout, (AppBarLayout) view2, rknVar);
            } else if (a(view2)) {
                ak(view2, rknVar);
            }
        }
        coordinatorLayout.j(rknVar, i);
        return true;
    }

    @Override // defpackage.clc
    public final /* bridge */ /* synthetic */ void l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        rkn rknVar = (rkn) view;
        if (view2 instanceof AppBarLayout) {
            c(coordinatorLayout, (AppBarLayout) view2, rknVar);
        } else if (a(view2)) {
            ak(view2, rknVar);
        }
    }

    @Override // defpackage.clc
    public final /* bridge */ /* synthetic */ boolean u(View view, Rect rect) {
        return false;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rku.a);
        this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.c = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
