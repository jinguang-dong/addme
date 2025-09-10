package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rls extends AnimatorListenerAdapter {
    final /* synthetic */ rln a;

    public rls(rln rlnVar) {
        this.a = rlnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        rln rlnVar = this.a;
        rlnVar.b.setTranslationY(0.0f);
        rlnVar.b(0.0f);
    }
}
