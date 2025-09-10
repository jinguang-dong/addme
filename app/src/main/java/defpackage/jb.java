package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jb extends AnimatorListenerAdapter {
    final /* synthetic */ jc a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ jd d;

    public jb(jd jdVar, jc jcVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = jdVar;
        this.a = jcVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        View view = this.c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        jd jdVar = this.d;
        jc jcVar = this.a;
        jdVar.k(jcVar.b);
        jdVar.g.remove(jcVar.b);
        jdVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        lg lgVar = this.a.b;
    }
}
