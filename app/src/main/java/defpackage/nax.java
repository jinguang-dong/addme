package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nax extends AnimatorListenerAdapter {
    final /* synthetic */ nay a;

    public nax(nay nayVar) {
        this.a = nayVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b.setForeground(null);
    }
}
