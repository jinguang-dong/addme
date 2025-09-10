package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mtk extends AnimatorListenerAdapter {
    boolean a = false;
    final /* synthetic */ double b;
    final /* synthetic */ mtm c;
    final /* synthetic */ int d;

    public mtk(mtm mtmVar, double d, int i) {
        this.b = d;
        this.d = i;
        this.c = mtmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) throws Resources.NotFoundException {
        if (this.a) {
            return;
        }
        mtm mtmVar = this.c;
        mtmVar.k.setEnabled(true);
        double d = this.b;
        mtmVar.j.n(mtmVar.k.a(d));
        if (this.d == 2) {
            mtmVar.h(mtmVar.a());
            mtmVar.j();
        } else {
            mtmVar.k.g = 0.0d;
            mtmVar.l(mtmVar.n);
        }
        mtmVar.k.setProgress((int) d);
        mtmVar.m = false;
        mtmVar.g();
    }
}
