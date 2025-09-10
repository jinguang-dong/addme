package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhf extends AnimatorListenerAdapter {
    final /* synthetic */ CaptureAnimationOverlay a;

    public nhf(CaptureAnimationOverlay captureAnimationOverlay) {
        this.a = captureAnimationOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        CaptureAnimationOverlay captureAnimationOverlay = this.a;
        captureAnimationOverlay.e = 1;
        captureAnimationOverlay.setVisibility(4);
    }
}
