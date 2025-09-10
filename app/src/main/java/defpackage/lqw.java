package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lqw extends AnimatorListenerAdapter {
    final /* synthetic */ lqx a;

    public lqw(lqx lqxVar) {
        this.a = lqxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b.c();
    }
}
