package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hof extends AnimatorListenerAdapter {
    final /* synthetic */ hnq a;
    final /* synthetic */ FocusIndicatorView b;

    public hof(hnq hnqVar, FocusIndicatorView focusIndicatorView) {
        this.a = hnqVar;
        this.b = focusIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        hnq hnqVar = this.a;
        if (hnqVar.a() == -1 || ((Boolean) ((ovx) this.b.j).d).booleanValue()) {
            return;
        }
        hnqVar.j(-1);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        hnq hnqVar = this.a;
        if (hnqVar.a() == -1 || ((Boolean) ((ovx) this.b.j).d).booleanValue()) {
            return;
        }
        hnqVar.j(-1);
    }
}
