package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mzj extends AnimatorListenerAdapter {
    final /* synthetic */ mzk a;

    public mzj(mzk mzkVar) {
        this.a = mzkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        mzk mzkVar = this.a;
        mzkVar.l.l(mzkVar.d, true);
        mzm mzmVar = mzkVar.j;
        if (mzmVar != null) {
            mzmVar.a();
        }
        mzkVar.c = false;
        mzkVar.l(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.l(false);
    }
}
