package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rmw extends AnimatorListenerAdapter {
    final /* synthetic */ rmy a;

    public rmw(rmy rmyVar) {
        this.a = rmyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        rmy rmyVar = this.a;
        rmyVar.c = (rmyVar.c + 1) % rmyVar.b.e.length;
        rmyVar.d = true;
    }
}
