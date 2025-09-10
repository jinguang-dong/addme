package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhe extends AnimatorListenerAdapter {
    final /* synthetic */ ValueAnimator a;
    final /* synthetic */ CaptureAnimationOverlay b;

    public nhe(CaptureAnimationOverlay captureAnimationOverlay, ValueAnimator valueAnimator) {
        this.a = valueAnimator;
        this.b = captureAnimationOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.start();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        CaptureAnimationOverlay captureAnimationOverlay = this.b;
        captureAnimationOverlay.e = 2;
        captureAnimationOverlay.setVisibility(0);
    }
}
