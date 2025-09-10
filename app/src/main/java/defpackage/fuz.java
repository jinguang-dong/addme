package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fuz extends AnimatorListenerAdapter {
    final /* synthetic */ fvb a;

    public fuz(fvb fvbVar) {
        this.a = fvbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.g = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        fvb fvbVar = this.a;
        fvbVar.setVisibility(0);
        fvbVar.a.setAlpha(0.0f);
        fvbVar.b.setAlpha(0.0f);
    }
}
