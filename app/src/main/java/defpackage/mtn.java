package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtn extends AnimatorListenerAdapter {
    boolean a = false;
    final /* synthetic */ boolean b;
    final /* synthetic */ View c;
    final /* synthetic */ Runnable d;

    public mtn(boolean z, View view, Runnable runnable) {
        this.b = z;
        this.c = view;
        this.d = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a || this.b) {
            return;
        }
        this.c.setVisibility(8);
        this.d.run();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.b) {
            this.c.setVisibility(0);
        }
    }
}
