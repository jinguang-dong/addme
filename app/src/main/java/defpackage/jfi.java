package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfi implements Animator.AnimatorListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public jfi(dft dftVar, dfs dfsVar, int i) {
        this.c = i;
        this.b = dftVar;
        this.a = dfsVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.c;
        if (i == 0 || i == 1) {
            return;
        }
        View view = (View) this.a;
        if (view.getAlpha() == 0.0f) {
            view.setVisibility(8);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.c;
        if (i == 0) {
            View view = (View) this.a;
            view.setAlpha(0.0f);
            view.setVisibility(8);
            scf scfVar = (scf) this.b;
            ((ObjectAnimator) scfVar.a).removeAllListeners();
            scfVar.a = null;
            return;
        }
        if (i != 1) {
            View view2 = (View) this.a;
            if (view2.getAlpha() == 0.0f) {
                view2.setVisibility(8);
                ((nty) this.b).k();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        if (this.c != 1) {
            return;
        }
        Object obj = this.a;
        dft dftVar = (dft) this.b;
        dfs dfsVar = (dfs) obj;
        dftVar.a(1.0f, dfsVar, true);
        dfsVar.f();
        dfsVar.d(dfsVar.a());
        if (!dftVar.c) {
            dftVar.b += 1.0f;
            return;
        }
        dftVar.c = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.c;
        if (i == 0) {
            ((View) this.a).setVisibility(0);
        } else {
            if (i != 1) {
                return;
            }
            ((dft) this.b).b = 0.0f;
        }
    }

    public jfi(Object obj, View view, int i) {
        this.c = i;
        this.a = view;
        this.b = obj;
    }
}
