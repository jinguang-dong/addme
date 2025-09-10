package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dgd extends AnimatorListenerAdapter implements dgm {
    private final View a;
    private boolean b = false;

    public dgd(View view) {
        this.a = view;
    }

    @Override // defpackage.dgm
    public final void c() {
        float transitionAlpha;
        View view = this.a;
        if (view.getVisibility() == 0) {
            int i = dhc.b;
            transitionAlpha = view.getTransitionAlpha();
        } else {
            transitionAlpha = 0.0f;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(transitionAlpha));
    }

    @Override // defpackage.dgm
    public final void d() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // defpackage.dgm
    public final /* synthetic */ void f(dgp dgpVar) {
        com.s(this, dgpVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = dhc.b;
        this.a.setTransitionAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.b) {
            this.a.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        View view = this.a;
        int i = dhc.b;
        view.setTransitionAlpha(1.0f);
    }

    @Override // defpackage.dgm
    public final void a(dgp dgpVar) {
    }

    @Override // defpackage.dgm
    public final void b(dgp dgpVar) {
    }

    @Override // defpackage.dgm
    public final void e(dgp dgpVar) {
    }

    @Override // defpackage.dgm
    public final void g(dgp dgpVar) {
    }
}
