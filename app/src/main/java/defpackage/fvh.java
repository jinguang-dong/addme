package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.autotimer.ui.AutoTimerIndicatorView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fvh extends AnimatorListenerAdapter {
    final /* synthetic */ AutoTimerIndicatorView a;

    public fvh(AutoTimerIndicatorView autoTimerIndicatorView) {
        this.a = autoTimerIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AutoTimerIndicatorView autoTimerIndicatorView = this.a;
        autoTimerIndicatorView.setVisibility(0);
        autoTimerIndicatorView.a(0.0f);
    }
}
