package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ncf extends AnimatorListenerAdapter {
    final /* synthetic */ ncg a;

    public ncf(ncg ncgVar) {
        this.a = ncgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        this.a.a.a();
    }
}
