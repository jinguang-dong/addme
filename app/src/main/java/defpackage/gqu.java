package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gqu implements Animator.AnimatorListener {
    private final gqs a;

    public gqu(gqs gqsVar) {
        this.a = gqsVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
