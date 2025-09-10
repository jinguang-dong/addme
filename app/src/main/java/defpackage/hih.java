package defpackage;

import android.animation.Animator;
import com.google.android.apps.camera.evcomp.EvCompView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hih implements Animator.AnimatorListener {
    final /* synthetic */ EvCompView a;

    public hih(EvCompView evCompView) {
        this.a = evCompView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        EvCompView evCompView = this.a;
        if (evCompView.getAlpha() == 0.0f) {
            evCompView.setVisibility(8);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EvCompView evCompView = this.a;
        if (evCompView.getAlpha() == 0.0f) {
            evCompView.setVisibility(8);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
