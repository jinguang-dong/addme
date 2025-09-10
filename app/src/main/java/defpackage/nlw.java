package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlw implements nlu {
    private final Animator b;

    public nlw(Animator animator) {
        this.b = animator;
    }

    @Override // defpackage.nlu
    public final nlt a() {
        szh szhVar = new szh();
        nlv nlvVar = new nlv(szhVar);
        Animator animator = this.b;
        animator.addListener(nlvVar);
        animator.start();
        return new nly(animator, szhVar);
    }

    @Override // defpackage.nlu
    public final void b(Animator.AnimatorListener animatorListener) {
        this.b.addListener(animatorListener);
    }
}
