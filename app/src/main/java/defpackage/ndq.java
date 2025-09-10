package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ndq extends AnimatorListenerAdapter {
    final /* synthetic */ ShutterButtonProgressOverlay a;

    public ndq(ShutterButtonProgressOverlay shutterButtonProgressOverlay) {
        this.a = shutterButtonProgressOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.a;
        shutterButtonProgressOverlay.o = 4;
        shutterButtonProgressOverlay.a = shutterButtonProgressOverlay.d;
        shutterButtonProgressOverlay.h(shutterButtonProgressOverlay.e);
        CircularProgressIndicator circularProgressIndicator = shutterButtonProgressOverlay.n;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.o = 4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.a;
        shutterButtonProgressOverlay.o = 2;
        shutterButtonProgressOverlay.setVisibility(0);
    }
}
