package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nlp extends AnimatorListenerAdapter {
    public final /* synthetic */ nlr a;

    public nlp(nlr nlrVar) {
        this.a = nlrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nlr nlrVar = this.a;
        mmw mmwVar = mmr.a;
        View view = nlrVar.b;
        cto ctoVar = new cto(view, ctj.b, 1.0f);
        cto ctoVar2 = new cto(view, ctj.c, 1.0f);
        ctp ctpVar = ctoVar.s;
        float f = mmwVar.b;
        ctpVar.e(f);
        float f2 = mmwVar.a;
        ctpVar.c(f2);
        ctoVar.g();
        ctp ctpVar2 = ctoVar2.s;
        ctpVar2.e(f);
        ctpVar2.c(f2);
        ctoVar2.g();
        ctoVar.i(new fvy(this, 5));
    }
}
