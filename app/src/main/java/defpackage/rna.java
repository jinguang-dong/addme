package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rna extends AnimatorListenerAdapter {
    final /* synthetic */ rnc a;

    public rna(rnc rncVar) {
        this.a = rncVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        rnc rncVar = this.a;
        rncVar.a();
        dhj dhjVar = rncVar.h;
        if (dhjVar != null) {
            dhjVar.b(rncVar.j);
        }
    }
}
