package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nwx extends AnimatorListenerAdapter {
    final /* synthetic */ lg a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ nxb d;

    public nwx(nxb nxbVar, lg lgVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.a = lgVar;
        this.b = viewPropertyAnimator;
        this.c = view;
        this.d = nxbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        View view = this.c;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        nxb nxbVar = this.d;
        lg lgVar = this.a;
        nxbVar.z(lgVar);
        nxbVar.k(lgVar);
        nxbVar.r.remove(lgVar);
        nxbVar.C();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
