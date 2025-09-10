package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fkp extends AnimatorListenerAdapter {
    final /* synthetic */ fkq a;

    public fkp(fkq fkqVar) {
        this.a = fkqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b.start();
    }
}
