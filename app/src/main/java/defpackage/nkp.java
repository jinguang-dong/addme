package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkp extends AnimatorListenerAdapter {
    final /* synthetic */ ZoomLockView a;

    public nkp(ZoomLockView zoomLockView) {
        this.a = zoomLockView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ZoomLockView zoomLockView = this.a;
        zoomLockView.c.bringToFront();
        zoomLockView.b.bringToFront();
        super.onAnimationEnd(animator);
        AmbientModeSupport.AmbientController ambientController = zoomLockView.k;
        if (ambientController != null) {
            ((nks) ambientController.a).c(true);
        }
    }
}
