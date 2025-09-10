package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nhk extends AnimatorListenerAdapter {
    final /* synthetic */ nhm a;

    public nhk(nhm nhmVar) {
        this.a = nhmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        nhm nhmVar = this.a;
        nhmVar.o = 4;
        nhmVar.d = nhmVar.f;
        nhmVar.e = nhmVar.g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.o = 4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        nhm nhmVar = this.a;
        nhmVar.o = 2;
        nhmVar.setVisibility(0);
    }
}
