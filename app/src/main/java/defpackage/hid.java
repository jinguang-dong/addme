package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hid extends AnimatorListenerAdapter {
    final /* synthetic */ hie a;

    public hid(hie hieVar) {
        this.a = hieVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.q.setVisibility(8);
    }
}
