package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkr extends AnimatorListenerAdapter {
    final /* synthetic */ ZoomLockView a;

    public nkr(ZoomLockView zoomLockView) {
        this.a = zoomLockView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        this.a.h = true;
    }
}
