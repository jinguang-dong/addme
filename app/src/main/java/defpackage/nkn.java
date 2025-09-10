package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkn extends AnimatorListenerAdapter {
    final /* synthetic */ ZoomLockView a;

    public nkn(ZoomLockView zoomLockView) {
        this.a = zoomLockView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
        super.onAnimationStart(animator);
    }
}
