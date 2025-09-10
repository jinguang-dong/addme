package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rmz extends AnimatorListenerAdapter {
    final /* synthetic */ rnc a;

    public rmz(rnc rncVar) {
        this.a = rncVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        rnc rncVar = this.a;
        rncVar.e = (rncVar.e + 1) % rncVar.d.e.length;
        rncVar.f = true;
    }
}
