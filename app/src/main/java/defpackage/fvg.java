package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.autotimer.ui.AutoTimerIndicatorView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fvg extends AnimatorListenerAdapter {
    final /* synthetic */ AutoTimerIndicatorView a;

    public fvg(AutoTimerIndicatorView autoTimerIndicatorView) {
        this.a = autoTimerIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }
}
