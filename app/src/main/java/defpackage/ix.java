package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ix extends AnimatorListenerAdapter {
    final /* synthetic */ lg a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ jd d;

    public ix(jd jdVar, lg lgVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = jdVar;
        this.a = lgVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        jd jdVar = this.d;
        lg lgVar = this.a;
        jdVar.k(lgVar);
        jdVar.f.remove(lgVar);
        jdVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
