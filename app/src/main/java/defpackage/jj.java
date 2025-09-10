package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jj extends AnimatorListenerAdapter {
    final /* synthetic */ jk a;
    private boolean b = false;

    public jj(jk jkVar) {
        this.a = jkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            this.b = false;
            return;
        }
        jk jkVar = this.a;
        if (((Float) jkVar.p.getAnimatedValue()).floatValue() == 0.0f) {
            jkVar.q = 0;
            jkVar.b(0);
        } else {
            jkVar.q = 2;
            jkVar.a();
        }
    }
}
