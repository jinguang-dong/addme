package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ron extends AnimatorListenerAdapter {
    final /* synthetic */ row a;

    public ron(row rowVar) {
        this.a = rowVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.j();
    }
}
