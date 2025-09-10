package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.ar.core.R;
import defpackage.clc;
import defpackage.clf;
import defpackage.qpt;
import defpackage.rhn;
import defpackage.rii;
import defpackage.ril;
import defpackage.rim;
import defpackage.rin;
import defpackage.rio;
import defpackage.rip;
import defpackage.riq;
import defpackage.rir;
import defpackage.rnt;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HideViewOnScrollBehavior extends clc {
    public AccessibilityManager a;
    public AccessibilityManager.TouchExplorationStateChangeListener b;
    public ViewPropertyAnimator c;
    private rir d;
    private final LinkedHashSet e;
    private int f;
    private int g;
    private TimeInterpolator h;
    private TimeInterpolator i;
    private int j;
    private int k;

    public HideViewOnScrollBehavior() {
        this.e = new LinkedHashSet();
        this.j = 0;
        this.k = 2;
    }

    private final void ak(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.c = this.d.c(view, i).setInterpolator(timeInterpolator).setDuration(j).setListener(new rip(this));
    }

    private final void al(int i) {
        this.k = i;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((riq) it.next()).a();
        }
    }

    public final void a(int i) {
        rir rirVar = this.d;
        if (rirVar == null || rirVar.b() != i) {
            this.d = i != 0 ? i != 1 ? new rim() : new ril() : new rin();
        }
    }

    public final void b(View view) {
        if (this.k == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        al(2);
        this.d.d();
        ak(view, 0, this.f, this.h);
    }

    public final boolean c() {
        return this.k == 1;
    }

    @Override // defpackage.clc
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.a == null) {
            this.a = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        int i2 = 2;
        if (this.a != null && this.b == null) {
            rii riiVar = new rii(this, view, i2);
            this.b = riiVar;
            this.a.addTouchExplorationStateChangeListener(riiVar);
            view.addOnAttachStateChangeListener(new rio(this, 0));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((clf) view.getLayoutParams()).c;
        if (i3 == 80 || i3 == 81) {
            a(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i2 = 0;
            }
            a(i2);
        }
        this.j = this.d.a(view, marginLayoutParams);
        this.f = rnt.f(view.getContext(), R.attr.motionDurationLong2, 225);
        this.g = rnt.f(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.h = qpt.G(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, rhn.d);
        this.i = qpt.G(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, rhn.c);
        return false;
    }

    @Override // defpackage.clc
    public final void q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                b(view);
            }
        } else {
            if (c()) {
                return;
            }
            AccessibilityManager accessibilityManager = this.a;
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                ViewPropertyAnimator viewPropertyAnimator = this.c;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                al(1);
                ak(view, this.j, this.g, this.i);
            }
        }
    }

    @Override // defpackage.clc
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new LinkedHashSet();
        this.j = 0;
        this.k = 2;
    }
}
