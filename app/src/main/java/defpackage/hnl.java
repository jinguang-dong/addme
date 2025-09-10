package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hnl extends AnimatorListenerAdapter {
    final /* synthetic */ FocusIndicatorAccessoryView a;

    public hnl(FocusIndicatorAccessoryView focusIndicatorAccessoryView) {
        this.a = focusIndicatorAccessoryView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }
}
