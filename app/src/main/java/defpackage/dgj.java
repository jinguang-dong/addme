package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dgj extends AnimatorListenerAdapter {
    final /* synthetic */ dgp a;

    public dgj(dgp dgpVar) {
        this.a = dgpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.s();
        animator.removeListener(this);
    }
}
