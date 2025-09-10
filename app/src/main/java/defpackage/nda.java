package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nda extends AnimatorListenerAdapter {
    final /* synthetic */ ndb a;

    public nda(ndb ndbVar) {
        this.a = ndbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.b.j.c(true);
    }
}
