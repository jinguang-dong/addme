package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nhl extends AnimatorListenerAdapter {
    final /* synthetic */ nhm a;

    public nhl(nhm nhmVar) {
        this.a = nhmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        nhm nhmVar = this.a;
        nhmVar.o = 1;
        nhmVar.setVisibility(4);
        nhmVar.h = -1L;
        nhmVar.i = -1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nhm nhmVar = this.a;
        nhmVar.o = 1;
        nhmVar.setVisibility(4);
        nhmVar.h = -1L;
        nhmVar.i = -1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        nhm nhmVar = this.a;
        nhmVar.d = nhmVar.f;
        nhmVar.o = 3;
    }
}
