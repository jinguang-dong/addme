package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hkr extends AnimatorListenerAdapter {
    final /* synthetic */ hks a;

    public hkr(hks hksVar) {
        this.a = hksVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        hks hksVar = this.a;
        hksVar.j.setDuration(500L);
        hksVar.k = true;
    }
}
