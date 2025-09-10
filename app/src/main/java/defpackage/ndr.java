package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ndr extends AnimatorListenerAdapter {
    final /* synthetic */ ShutterButtonProgressOverlay a;

    public ndr(ShutterButtonProgressOverlay shutterButtonProgressOverlay) {
        this.a = shutterButtonProgressOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.a;
        shutterButtonProgressOverlay.o = 1;
        shutterButtonProgressOverlay.setVisibility(4);
        CircularProgressIndicator circularProgressIndicator = shutterButtonProgressOverlay.n;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.setAlpha(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.a;
        shutterButtonProgressOverlay.o = 1;
        CircularProgressIndicator circularProgressIndicator = shutterButtonProgressOverlay.n;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.setAlpha(0.0f);
        }
        shutterButtonProgressOverlay.setVisibility(4);
        shutterButtonProgressOverlay.f = true;
        shutterButtonProgressOverlay.k.ifPresent(new lig(8));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.a;
        shutterButtonProgressOverlay.a = shutterButtonProgressOverlay.d;
        shutterButtonProgressOverlay.o = 3;
    }
}
