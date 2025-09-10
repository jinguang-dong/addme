package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoo extends AnimatorListenerAdapter {
    final /* synthetic */ hnq a;
    final /* synthetic */ Resources b;
    final /* synthetic */ FocusIndicatorView c;

    public hoo(hnq hnqVar, Resources resources, FocusIndicatorView focusIndicatorView) {
        this.a = hnqVar;
        this.b = resources;
        this.c = focusIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        hnq hnqVar = this.a;
        hnqVar.o(1);
        hnqVar.j(-1);
        Resources resources = this.b;
        hnqVar.l(resources.getDimension(R.dimen.focus_lock_hold_outer_ring_diameter));
        hnqVar.n(resources.getDimension(R.dimen.focus_lock_hold_outer_ring_thickness));
        hnqVar.k(resources.getDimension(R.dimen.focus_indicator_ring_view_size) / 2.0f);
        hnqVar.g(0.0f, 0.0f);
        this.c.invalidate();
    }
}
