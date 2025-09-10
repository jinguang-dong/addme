package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kre extends AnimatorListenerAdapter {
    boolean a;
    final /* synthetic */ krj b;

    public kre(krj krjVar) {
        this.b = krjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        krj krjVar = this.b;
        krjVar.o.g();
        krjVar.m.setTranslationY(0.0f);
    }
}
