package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.ar.core.R;
import defpackage.clc;
import defpackage.qpt;
import defpackage.rhn;
import defpackage.rii;
import defpackage.rij;
import defpackage.rik;
import defpackage.rio;
import defpackage.rnt;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior extends clc {
    public AccessibilityManager a;
    public AccessibilityManager.TouchExplorationStateChangeListener b;
    public ViewPropertyAnimator c;
    private final LinkedHashSet d;
    private int e;
    private int f;
    private TimeInterpolator g;
    private TimeInterpolator h;
    private int i;
    private int j;

    public HideBottomViewOnScrollBehavior() {
        this.d = new LinkedHashSet();
        this.i = 0;
        this.j = 2;
    }

    private final void ak(int i) {
        this.j = i;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((rik) it.next()).a();
        }
    }

    private final void c(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.c = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new rij(this));
    }

    public final void a(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        ak(2);
        c(view, 0, this.e, this.g);
    }

    public final boolean b() {
        return this.j == 1;
    }

    @Override // defpackage.clc
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.i = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.e = rnt.f(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = rnt.f(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = qpt.G(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, rhn.d);
        this.h = qpt.G(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, rhn.c);
        if (this.a == null) {
            this.a = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        int i2 = 0;
        if (this.a != null && this.b == null) {
            rii riiVar = new rii(this, view, i2);
            this.b = riiVar;
            this.a.addTouchExplorationStateChangeListener(riiVar);
            view.addOnAttachStateChangeListener(new rio(this, 1));
        }
        return false;
    }

    @Override // defpackage.clc
    public final void q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                a(view);
            }
        } else {
            if (b()) {
                return;
            }
            AccessibilityManager accessibilityManager = this.a;
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                ViewPropertyAnimator viewPropertyAnimator = this.c;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                ak(1);
                c(view, this.i, this.f, this.h);
            }
        }
    }

    @Override // defpackage.clc
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new LinkedHashSet();
        this.i = 0;
        this.j = 2;
    }
}
