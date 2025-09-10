package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gws implements Animator.AnimatorListener {
    final /* synthetic */ ujw a;
    final /* synthetic */ gwv b;
    final /* synthetic */ float c;
    final /* synthetic */ uif d;
    final /* synthetic */ ValueAnimator e;

    public gws(ujw ujwVar, gwv gwvVar, float f, uif uifVar, ValueAnimator valueAnimator) {
        this.a = ujwVar;
        this.b = gwvVar;
        this.c = f;
        this.d = uifVar;
        this.e = valueAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
        if (this.a.a) {
            gwv gwvVar = this.b;
            Float f = (Float) gwvVar.g.dL();
            if (ujp.d(gwvVar.q, this.c)) {
                f.getClass();
                gwv.D(gwvVar, f.floatValue());
                gwvVar.x(f.floatValue());
                gwvVar.q = null;
            }
        } else {
            gwv gwvVar2 = this.b;
            float f2 = this.c;
            gwvVar2.g.a(Float.valueOf(f2));
            gwvVar2.v(f2, null, niz.f);
            gwvVar2.x(f2);
            gwvVar2.q = null;
        }
        this.b.m.a(kqv.a);
        this.d.a();
        this.e.removeAllListeners();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
