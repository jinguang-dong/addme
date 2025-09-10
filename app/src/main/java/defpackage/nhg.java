package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhg extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ CaptureAnimationOverlay b;

    public nhg(CaptureAnimationOverlay captureAnimationOverlay, boolean z) {
        this.a = z;
        this.b = captureAnimationOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.a) {
            return;
        }
        CaptureAnimationOverlay captureAnimationOverlay = this.b;
        captureAnimationOverlay.e = 1;
        captureAnimationOverlay.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        CaptureAnimationOverlay captureAnimationOverlay = this.b;
        captureAnimationOverlay.e = 1;
        captureAnimationOverlay.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a) {
            CaptureAnimationOverlay captureAnimationOverlay = this.b;
            captureAnimationOverlay.e = 3;
            captureAnimationOverlay.setVisibility(0);
        }
    }
}
