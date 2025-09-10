package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoh extends AnimatorListenerAdapter {
    final /* synthetic */ hnq a;
    final /* synthetic */ Context b;
    final /* synthetic */ Resources c;

    public hoh(hnq hnqVar, Context context, Resources resources) {
        this.a = hnqVar;
        this.b = context;
        this.c = resources;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        hnq hnqVar = this.a;
        hnqVar.o(1);
        Context context = this.b;
        hnqVar.j(context.getColor(R.color.square_focus_ring_color));
        Resources resources = this.c;
        hnqVar.l(resources.getDimension(R.dimen.square_focus_ring_size));
        hnqVar.n(resources.getDimension(R.dimen.nairobi_square_focus_ring_thickness));
        hnqVar.k(resources.getDimension(R.dimen.square_focus_ring_corner_radius));
        hnqVar.g(resources.getDimension(R.dimen.square_focus_ring_inner_boundary_size), resources.getDimension(R.dimen.square_focus_ring_outer_boundary_size));
        hnqVar.h(resources.getDimension(R.dimen.nairobi_square_focus_ring_boundary_thickness));
        hnqVar.e(context.getColor(R.color.square_focus_ring_boundary_color));
    }
}
