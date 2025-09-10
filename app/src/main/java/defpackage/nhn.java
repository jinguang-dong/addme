package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.views.FrontLensIndicatorOverlay;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhn extends AnimatorListenerAdapter {
    final /* synthetic */ FrontLensIndicatorOverlay a;

    public nhn(FrontLensIndicatorOverlay frontLensIndicatorOverlay) {
        this.a = frontLensIndicatorOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        FrontLensIndicatorOverlay frontLensIndicatorOverlay = this.a;
        frontLensIndicatorOverlay.o = 4;
        frontLensIndicatorOverlay.n = frontLensIndicatorOverlay.i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        FrontLensIndicatorOverlay frontLensIndicatorOverlay = this.a;
        ValueAnimator valueAnimator = frontLensIndicatorOverlay.b;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            frontLensIndicatorOverlay.o = 4;
            ValueAnimator valueAnimator2 = frontLensIndicatorOverlay.b;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                frontLensIndicatorOverlay.b.cancel();
            }
            frontLensIndicatorOverlay.b = ValueAnimator.ofInt(0, 360);
            frontLensIndicatorOverlay.b.setDuration(400L);
            frontLensIndicatorOverlay.b.setInterpolator(frontLensIndicatorOverlay.g);
            frontLensIndicatorOverlay.b.addUpdateListener(new nhi(frontLensIndicatorOverlay, 6));
            frontLensIndicatorOverlay.b.start();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        FrontLensIndicatorOverlay frontLensIndicatorOverlay = this.a;
        frontLensIndicatorOverlay.o = 2;
        frontLensIndicatorOverlay.setVisibility(0);
        frontLensIndicatorOverlay.e.setAlpha(255);
    }
}
