package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rkp extends AnimatorListenerAdapter {
    final /* synthetic */ rkt a;
    private boolean b;

    public rkp(rkt rktVar) {
        this.a = rktVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        rkt rktVar = this.a;
        rktVar.A = 0;
        rktVar.v = null;
        if (this.b) {
            return;
        }
        rktVar.B.f(4, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        rkt rktVar = this.a;
        rktVar.B.f(0, false);
        rktVar.A = 1;
        rktVar.v = animator;
        this.b = false;
    }
}
