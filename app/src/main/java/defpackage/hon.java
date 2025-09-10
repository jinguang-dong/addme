package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hon extends AnimatorListenerAdapter {
    final /* synthetic */ hnq a;
    final /* synthetic */ Resources b;
    final /* synthetic */ Context c;

    public hon(hnq hnqVar, Resources resources, Context context) {
        this.a = hnqVar;
        this.b = resources;
        this.c = context;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        hnq hnqVar = this.a;
        hnqVar.o(1);
        hnqVar.j(-1);
        Resources resources = this.b;
        hnqVar.l(resources.getDimension(R.dimen.square_focus_ring_size));
        hnqVar.n(resources.getDimension(R.dimen.nairobi_active_focus_outer_ring_thickness));
        hnqVar.k(resources.getDimension(R.dimen.square_focus_ring_corner_radius));
        hnqVar.g(0.0f, 0.0f);
        hnqVar.g(resources.getDimension(R.dimen.square_focus_ring_inner_boundary_size), resources.getDimension(R.dimen.square_focus_ring_outer_boundary_size));
        hnqVar.h(resources.getDimension(R.dimen.nairobi_square_focus_ring_boundary_thickness));
        hnqVar.e(this.c.getColor(R.color.square_focus_ring_boundary_color));
    }
}
