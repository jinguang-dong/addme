package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nlq extends AnimatorListenerAdapter {
    final /* synthetic */ nlr a;

    public nlq(nlr nlrVar) {
        this.a = nlrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nlr nlrVar = this.a;
        nlrVar.b.setVisibility(4);
        nlrVar.b();
    }
}
