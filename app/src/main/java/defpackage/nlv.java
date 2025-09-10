package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nlv extends AnimatorListenerAdapter {
    final /* synthetic */ szh a;

    public nlv(szh szhVar) {
        this.a = szhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.removeListener(this);
        this.a.e(Boolean.FALSE);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.removeListener(this);
        this.a.e(Boolean.TRUE);
    }
}
