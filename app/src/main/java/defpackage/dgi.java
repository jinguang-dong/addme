package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dgi extends AnimatorListenerAdapter {
    final /* synthetic */ yd a;
    final /* synthetic */ dgp b;

    public dgi(dgp dgpVar, yd ydVar) {
        this.b = dgpVar;
        this.a = ydVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.k.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.k.add(animator);
    }
}
