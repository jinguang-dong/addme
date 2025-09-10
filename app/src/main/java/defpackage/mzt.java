package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mzt extends AnimatorListenerAdapter {
    final /* synthetic */ mzy a;

    public mzt(mzy mzyVar) {
        this.a = mzyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        mzy mzyVar = this.a;
        mzyVar.e();
        mzyVar.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        mzy mzyVar = this.a;
        try {
            Iterator it = mzyVar.D.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        } finally {
            mzyVar.D.clear();
        }
    }
}
