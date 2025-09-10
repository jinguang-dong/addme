package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fva extends AnimatorListenerAdapter {
    final /* synthetic */ fvb a;

    public fva(fvb fvbVar) {
        this.a = fvbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        fvb fvbVar = this.a;
        fvbVar.setVisibility(8);
        fvbVar.g = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        fvb fvbVar = this.a;
        fvbVar.setVisibility(0);
        fvbVar.a.setAlpha(1.0f);
        fvbVar.b.setAlpha(1.0f);
    }
}
