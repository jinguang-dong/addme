package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rma extends AnimatorListenerAdapter {
    final /* synthetic */ rmd a;

    public rma(rmd rmdVar) {
        this.a = rmdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        rmd rmdVar = this.a;
        rmdVar.a();
        dhj dhjVar = rmdVar.i;
        if (dhjVar != null) {
            dhjVar.b(rmdVar.j);
        }
    }
}
