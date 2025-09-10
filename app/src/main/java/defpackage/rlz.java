package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rlz extends AnimatorListenerAdapter {
    final /* synthetic */ rmd a;

    public rlz(rmd rmdVar) {
        this.a = rmdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        rmd rmdVar = this.a;
        rmdVar.f = (rmdVar.f + 4) % rmdVar.e.e.length;
    }
}
