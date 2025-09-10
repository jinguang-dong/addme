package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.gesturecapture.ui.CatcherView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hsd extends AnimatorListenerAdapter {
    final /* synthetic */ CatcherView a;

    public hsd(CatcherView catcherView) {
        this.a = catcherView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        CatcherView catcherView = this.a;
        catcherView.a.setAlpha(76);
        catcherView.b.setColor(-1);
    }
}
