package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rmf extends AnimatorListenerAdapter {
    final /* synthetic */ rmi a;

    public rmf(rmi rmiVar) {
        this.a = rmiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        rmi rmiVar = this.a;
        rmiVar.a();
        dhj dhjVar = rmiVar.h;
        if (dhjVar != null) {
            dhjVar.b(rmiVar.j);
        }
    }
}
