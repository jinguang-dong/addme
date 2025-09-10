package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class roq extends AnimatorListenerAdapter {
    final /* synthetic */ row a;

    public roq(row rowVar) {
        this.a = rowVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.j();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        row rowVar = this.a;
        SnackbarContentLayout snackbarContentLayout = rowVar.r;
        snackbarContentLayout.a.setAlpha(1.0f);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = snackbarContentLayout.a.animate().alpha(0.0f);
        long j = rowVar.d;
        ViewPropertyAnimator duration = viewPropertyAnimatorAlpha.setDuration(j);
        TimeInterpolator timeInterpolator = snackbarContentLayout.c;
        duration.setInterpolator(timeInterpolator).setStartDelay(0L).start();
        if (snackbarContentLayout.b.getVisibility() == 0) {
            snackbarContentLayout.b.setAlpha(1.0f);
            snackbarContentLayout.b.animate().alpha(0.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(0L).start();
        }
    }
}
