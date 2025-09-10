package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class glh implements Animator.AnimatorListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ gli b;

    public glh(gli gliVar, boolean z) {
        this.a = z;
        this.b = gliVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        gli gliVar = this.b;
        gliVar.g(true);
        gliVar.l.f();
        gliVar.y = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        mzb mzbVar = this.b.e;
        if (this.a) {
            mzbVar.d();
        } else {
            mzbVar.e();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
