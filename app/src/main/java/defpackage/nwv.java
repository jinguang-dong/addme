package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nwv extends AnimatorListenerAdapter {
    final /* synthetic */ lg a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ nxb c;

    public nwv(nxb nxbVar, lg lgVar, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = lgVar;
        this.b = viewPropertyAnimator;
        this.c = nxbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c.x(this.a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        nxb nxbVar = this.c;
        lg lgVar = this.a;
        nxbVar.x(lgVar);
        nxbVar.k(lgVar);
        nxbVar.o.remove(lgVar);
        nxbVar.C();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
