package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nko extends AnimatorListenerAdapter {
    final /* synthetic */ ZoomLockView a;

    public nko(ZoomLockView zoomLockView) {
        this.a = zoomLockView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ZoomLockView zoomLockView = this.a;
        ImageView imageView = zoomLockView.d;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        zoomLockView.g.setVisibility(0);
        zoomLockView.b.setVisibility(0);
        super.onAnimationEnd(animator);
    }
}
