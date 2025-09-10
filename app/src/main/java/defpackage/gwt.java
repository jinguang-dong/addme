package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gwt implements Animator.AnimatorListener {
    final /* synthetic */ float a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public gwt(gli gliVar, float f, int i) {
        this.c = i;
        this.a = f;
        this.b = gliVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.c != 0) {
            float f = this.a;
            Object obj = this.b;
            if (f == 0.0f) {
                ((gli) obj).e.c();
            }
            ((gli) obj).y = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.c != 0) {
            gli gliVar = (gli) this.b;
            gliVar.g(false);
            if (this.a > 0.0f) {
                gliVar.e.d();
                return;
            }
            return;
        }
        float f = this.a;
        Object obj = this.b;
        gwv gwvVar = (gwv) obj;
        gwvVar.n.a(Float.valueOf(f));
        gwvVar.m.a(kqv.b);
    }

    public gwt(gwv gwvVar, float f, int i) {
        this.c = i;
        this.b = gwvVar;
        this.a = f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
