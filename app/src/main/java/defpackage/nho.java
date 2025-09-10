package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.views.FrontLensIndicatorOverlay;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nho extends AnimatorListenerAdapter {
    final /* synthetic */ FrontLensIndicatorOverlay a;

    public nho(FrontLensIndicatorOverlay frontLensIndicatorOverlay) {
        this.a = frontLensIndicatorOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        FrontLensIndicatorOverlay frontLensIndicatorOverlay = this.a;
        frontLensIndicatorOverlay.o = 1;
        frontLensIndicatorOverlay.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        FrontLensIndicatorOverlay frontLensIndicatorOverlay = this.a;
        frontLensIndicatorOverlay.o = 1;
        frontLensIndicatorOverlay.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.o = 3;
    }
}
