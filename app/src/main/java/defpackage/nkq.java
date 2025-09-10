package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkq extends AnimatorListenerAdapter {
    final /* synthetic */ ZoomLockView a;

    public nkq(ZoomLockView zoomLockView) {
        this.a = zoomLockView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ZoomLockView zoomLockView = this.a;
        zoomLockView.setVisibility(8);
        zoomLockView.g.setTranslationX(0.0f);
        zoomLockView.g.setTranslationY(0.0f);
        zoomLockView.b.setTranslationY(0.0f);
        zoomLockView.b.setTranslationX(0.0f);
        zoomLockView.c.setScaleX(0.0f);
        zoomLockView.c.setScaleY(0.0f);
        zoomLockView.c.setTranslationX(0.0f);
        zoomLockView.c.setTranslationY(0.0f);
        zoomLockView.h = false;
        zoomLockView.setAlpha(1.0f);
        super.onAnimationEnd(animator);
    }
}
