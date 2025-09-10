package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rme extends AnimatorListenerAdapter {
    final /* synthetic */ rmi a;

    public rme(rmi rmiVar) {
        this.a = rmiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        rmi rmiVar = this.a;
        int i = rmiVar.e;
        int length = rmi.a.length;
        rmiVar.e = (i + 4) % rmiVar.d.e.length;
    }
}
