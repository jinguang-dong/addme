package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoe extends AnimatorListenerAdapter {
    final /* synthetic */ Context a;
    final /* synthetic */ rwc b;
    final /* synthetic */ FocusIndicatorView c;
    final /* synthetic */ hnq d;
    final /* synthetic */ Resources e;

    public hoe(Context context, rwc rwcVar, FocusIndicatorView focusIndicatorView, hnq hnqVar, Resources resources) {
        this.a = context;
        this.b = rwcVar;
        this.c = focusIndicatorView;
        this.d = hnqVar;
        this.e = resources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Context context = this.a;
        boolean zP = ((fdi) context).b().p(gzj.f);
        rwc rwcVar = this.b;
        if (rwcVar.h()) {
            ((FocusIndicatorAccessoryView) rwcVar.c()).post(new hdk(this.c, rwcVar, 9));
        }
        hnq hnqVar = this.d;
        hnqVar.o(1);
        Resources resources = this.e;
        hnqVar.l(resources.getDimension(R.dimen.square_focus_ring_size));
        hnqVar.n(zP ? resources.getDimension(R.dimen.nairobi_square_focus_ring_thickness) : resources.getDimension(R.dimen.square_focus_ring_thickness));
        hnqVar.k(resources.getDimension(R.dimen.square_focus_ring_corner_radius));
        hnqVar.g(resources.getDimension(R.dimen.square_focus_ring_inner_boundary_size), resources.getDimension(R.dimen.square_focus_ring_outer_boundary_size));
        hnqVar.f(resources.getDimension(R.dimen.square_focus_ring_inner_boundary_corner_radius), resources.getDimension(R.dimen.square_focus_ring_outer_boundary_corner_radius));
        hnqVar.h(resources.getDimension(R.dimen.square_focus_ring_boundary_thickness));
        hnqVar.e(context.getColor(R.color.square_focus_ring_boundary_color));
    }
}
