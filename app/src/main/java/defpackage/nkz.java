package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nkz extends AnimatorListenerAdapter {
    final /* synthetic */ Consumer a;

    public nkz(Consumer consumer) {
        this.a = consumer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.accept(animator);
    }
}
