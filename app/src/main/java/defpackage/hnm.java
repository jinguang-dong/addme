package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hnm extends AnimatorListenerAdapter {
    final /* synthetic */ FocusIndicatorAccessoryView a;

    public hnm(FocusIndicatorAccessoryView focusIndicatorAccessoryView) {
        this.a = focusIndicatorAccessoryView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
    }
}
