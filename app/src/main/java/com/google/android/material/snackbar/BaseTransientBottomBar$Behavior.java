package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.wear.ambient.AmbientMode;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.rov;
import defpackage.rpb;
import defpackage.scf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public final scf g = new scf((SwipeDismissBehavior) this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean a(View view) {
        return view instanceof rov;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.clc
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        scf scfVar = this.g;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                rpb.a().f((AmbientMode.AmbientController) scfVar.a);
            }
        } else if (coordinatorLayout.k(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            rpb.a().e((AmbientMode.AmbientController) scfVar.a);
        }
        return super.g(coordinatorLayout, view, motionEvent);
    }
}
