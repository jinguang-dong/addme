package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hic extends AnimatorListenerAdapter {
    final /* synthetic */ hie a;

    public hic(hie hieVar) {
        this.a = hieVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.q.setVisibility(0);
    }
}
