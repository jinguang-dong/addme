package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnv extends AnimatorListenerAdapter {
    final /* synthetic */ FocusIndicatorView a;

    public hnv(FocusIndicatorView focusIndicatorView) {
        this.a = focusIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.N = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        FocusIndicatorView focusIndicatorView = this.a;
        focusIndicatorView.N = animator;
        focusIndicatorView.l.set(true);
    }
}
