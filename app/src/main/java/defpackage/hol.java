package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hol extends AnimatorListenerAdapter {
    final /* synthetic */ hnq a;
    final /* synthetic */ Context b;
    final /* synthetic */ Resources c;
    final /* synthetic */ FocusIndicatorView d;

    public hol(hnq hnqVar, Context context, Resources resources, FocusIndicatorView focusIndicatorView) {
        this.a = hnqVar;
        this.b = context;
        this.c = resources;
        this.d = focusIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        hnq hnqVar = this.a;
        hnqVar.o(1);
        hnqVar.j(this.b.getColor(R.color.square_focus_ring_color));
        Resources resources = this.c;
        hnqVar.n(resources.getDimension(R.dimen.nairobi_active_focus_outer_ring_thickness));
        hnqVar.k(resources.getDimension(R.dimen.focus_indicator_ring_view_size) / 2.0f);
        hnqVar.g(0.0f, 0.0f);
        this.d.invalidate();
    }
}
