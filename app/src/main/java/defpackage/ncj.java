package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ncj extends AnimatorListenerAdapter {
    final /* synthetic */ ValueAnimator a;
    final /* synthetic */ ValueAnimator.AnimatorUpdateListener b;

    public ncj(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a = valueAnimator;
        this.b = animatorUpdateListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.removeUpdateListener(this.b);
    }
}
