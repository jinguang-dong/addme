package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rkq extends AnimatorListenerAdapter {
    final /* synthetic */ rkt a;

    public rkq(rkt rktVar) {
        this.a = rktVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        rkt rktVar = this.a;
        rktVar.A = 0;
        rktVar.v = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        rkt rktVar = this.a;
        rktVar.B.f(0, false);
        rktVar.A = 2;
        rktVar.v = animator;
    }
}
