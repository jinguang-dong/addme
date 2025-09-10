package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmn extends AnimatorListenerAdapter {
    final /* synthetic */ pez a;

    public mmn(pez pezVar) {
        this.a = pezVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.g();
    }
}
