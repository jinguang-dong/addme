package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lqu extends AnimatorListenerAdapter {
    final /* synthetic */ lqv a;

    public lqu(lqv lqvVar) {
        this.a = lqvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b.c();
    }
}
