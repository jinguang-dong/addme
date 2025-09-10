package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dhd extends AnimatorListenerAdapter implements dgm {
    private final View b;
    private final int c;
    private final ViewGroup d;
    private boolean f;
    boolean a = false;
    private final boolean e = true;

    public dhd(View view, int i) {
        this.b = view;
        this.c = i;
        this.d = (ViewGroup) view.getParent();
        i(true);
    }

    private final void h() {
        if (!this.a) {
            View view = this.b;
            int i = this.c;
            int i2 = dhc.b;
            view.setTransitionVisibility(i);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        i(false);
    }

    private final void i(boolean z) {
        ViewGroup viewGroup;
        if (!this.e || this.f == z || (viewGroup = this.d) == null) {
            return;
        }
        this.f = z;
        viewGroup.suppressLayout(z);
    }

    @Override // defpackage.dgm
    public final void b(dgp dgpVar) {
        dgpVar.F(this);
    }

    @Override // defpackage.dgm
    public final void c() {
        i(false);
        if (this.a) {
            return;
        }
        View view = this.b;
        int i = this.c;
        int i2 = dhc.b;
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.dgm
    public final void d() {
        i(true);
        if (this.a) {
            return;
        }
        View view = this.b;
        int i = dhc.b;
        view.setTransitionVisibility(0);
    }

    @Override // defpackage.dgm
    public final /* synthetic */ void f(dgp dgpVar) {
        com.s(this, dgpVar);
    }

    @Override // defpackage.dgm
    public final /* synthetic */ void g(dgp dgpVar) {
        com.t(this, dgpVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.b;
            int i = dhc.b;
            view.setTransitionVisibility(0);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // defpackage.dgm
    public final void a(dgp dgpVar) {
    }

    @Override // defpackage.dgm
    public final void e(dgp dgpVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
