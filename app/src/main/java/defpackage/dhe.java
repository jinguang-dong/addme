package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dhe extends AnimatorListenerAdapter implements dgm {
    final /* synthetic */ dhg a;
    private final ViewGroup b;
    private final View c;
    private final View d;
    private boolean e = true;

    public dhe(dhg dhgVar, ViewGroup viewGroup, View view, View view2) {
        this.a = dhgVar;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    private final void h() {
        this.d.setTag(R.id.save_overlay_view, null);
        this.b.getOverlay().remove(this.c);
        this.e = false;
    }

    @Override // defpackage.dgm
    public final void a(dgp dgpVar) {
        if (this.e) {
            h();
        }
    }

    @Override // defpackage.dgm
    public final void b(dgp dgpVar) {
        dgpVar.F(this);
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
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.b.getOverlay().remove(this.c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.c;
        if (view.getParent() == null) {
            con.f(this.b, view);
        } else {
            this.a.n();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.d;
            View view2 = this.c;
            view.setTag(R.id.save_overlay_view, view2);
            con.f(this.b, view2);
            this.e = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // defpackage.dgm
    public final void c() {
    }

    @Override // defpackage.dgm
    public final void d() {
    }

    @Override // defpackage.dgm
    public final void e(dgp dgpVar) {
    }
}
