package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.ImageMetadata;
import defpackage.clc;
import defpackage.con;
import defpackage.cps;
import defpackage.cqq;
import defpackage.cqr;
import defpackage.div;
import defpackage.ris;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SwipeDismissBehavior extends clc {
    public cqr a;
    public boolean b;
    public AmbientMode.AmbientController f;
    private boolean g;
    public int c = 2;
    public float d = 0.0f;
    public float e = 0.5f;
    private final cqq h = new ris(this);

    public static float b(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    public boolean a(View view) {
        return true;
    }

    @Override // defpackage.clc
    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zK = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zK = coordinatorLayout.k(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.g = zK;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        if (zK) {
            if (this.a == null) {
                this.a = cqr.b(coordinatorLayout, this.h);
            }
            if (!this.b && this.a.j(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.clc
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() != 0) {
            return false;
        }
        view.setImportantForAccessibility(1);
        con.h(view, ImageMetadata.SHADING_MODE);
        if (!a(view)) {
            return false;
        }
        con.k(view, cps.u, new div(this, 2));
        return false;
    }

    @Override // defpackage.clc
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.b && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.e(motionEvent);
        return true;
    }
}
