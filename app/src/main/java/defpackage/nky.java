package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nky extends AnimatorListenerAdapter {
    final /* synthetic */ Consumer a;

    public nky(Consumer consumer) {
        this.a = consumer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.accept(animator);
    }
}
