package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.pro.feature.lens.LensFeatureControlsView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkc extends AnimatorListenerAdapter {
    final /* synthetic */ LensFeatureControlsView a;
    private boolean b = false;

    public lkc(LensFeatureControlsView lensFeatureControlsView) {
        this.a = lensFeatureControlsView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            return;
        }
        LensFeatureControlsView lensFeatureControlsView = this.a;
        lensFeatureControlsView.d = lensFeatureControlsView.b;
        lensFeatureControlsView.e = false;
        lensFeatureControlsView.a.a(false);
        lensFeatureControlsView.c.setVisibility(4);
    }
}
