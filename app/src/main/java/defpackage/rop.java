package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rop extends AnimatorListenerAdapter {
    final /* synthetic */ row a;

    public rop(row rowVar) {
        this.a = rowVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        row rowVar = this.a;
        SnackbarContentLayout snackbarContentLayout = rowVar.r;
        snackbarContentLayout.a.setAlpha(0.0f);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = snackbarContentLayout.a.animate().alpha(1.0f);
        int i = rowVar.c;
        long j = i;
        ViewPropertyAnimator duration = viewPropertyAnimatorAlpha.setDuration(j);
        TimeInterpolator timeInterpolator = snackbarContentLayout.c;
        ViewPropertyAnimator interpolator = duration.setInterpolator(timeInterpolator);
        long j2 = rowVar.e - i;
        interpolator.setStartDelay(j2).start();
        if (snackbarContentLayout.b.getVisibility() == 0) {
            snackbarContentLayout.b.setAlpha(0.0f);
            snackbarContentLayout.b.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }
}
