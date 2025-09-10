package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nwm extends nxb {
    public static final /* synthetic */ int a = 0;
    private static final Interpolator s = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
    private final ValueAnimator.AnimatorUpdateListener t;
    private final nwt u;

    public nwm(nwt nwtVar) {
        this.u = nwtVar;
        this.t = new nhi(nwtVar, 9);
    }

    private static void E(View view, boolean z) {
        view.setTag(R.id.animating_item, Boolean.valueOf(z));
    }

    private final void F(lg lgVar) {
        lgVar.a.animate().setUpdateListener(this.t);
    }

    @Override // defpackage.nxb
    protected final void A(lg lgVar) {
        View view = lgVar.a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // defpackage.nxb
    protected final void B(lg lgVar) {
        View view = lgVar.a;
        E(view, false);
        this.u.b(view);
    }

    @Override // defpackage.nxb
    public final ViewPropertyAnimator a(lg lgVar) {
        nwt nwtVar = this.u;
        View view = lgVar.a;
        if (nwtVar.f(view)) {
            if (nwtVar.e) {
                nwtVar.c(view);
            } else {
                nwtVar.d(view, nwtVar.a(view));
            }
        }
        ViewPropertyAnimator updateListener = view.animate().setUpdateListener(this.t);
        updateListener.setDuration(this.h).setInterpolator(s);
        return updateListener;
    }

    @Override // defpackage.nxb, defpackage.lm
    public final boolean e(lg lgVar, lg lgVar2, int i, int i2, int i3, int i4) {
        F(lgVar2);
        if (lgVar == lgVar2) {
            return f(lgVar, i, i2, i3, i4);
        }
        View view = lgVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        super.D(lgVar);
        float f = (i3 - i) - translationX;
        float f2 = (i4 - i2) - translationY;
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        if (lgVar2 != null) {
            super.D(lgVar2);
            View view2 = lgVar2.a;
            view2.setTranslationX(-f);
            view2.setTranslationY(-f2);
            view2.setScaleX(0.1f);
            view2.setScaleY(0.1f);
        }
        this.f.add(new nwz(lgVar, lgVar2, i, i2, i3, i4));
        return true;
    }

    @Override // defpackage.nxb, defpackage.lm
    public final boolean f(lg lgVar, int i, int i2, int i3, int i4) {
        F(lgVar);
        View view = lgVar.a;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) view.getTranslationY();
        super.D(lgVar);
        int i5 = i + translationX;
        int i6 = i3 - i5;
        int i7 = i2 + translationY;
        int i8 = i4 - i7;
        if (i6 == 0) {
            i6 = 0;
            if (i8 == 0) {
                k(lgVar);
                return false;
            }
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        this.e.add(new nxa(lgVar, i5, i7, i3, i4));
        return true;
    }

    @Override // defpackage.nxb, defpackage.lm
    public final void i(lg lgVar) {
        F(lgVar);
        super.D(lgVar);
        View view = lgVar.a;
        E(view, true);
        view.setScaleX(0.1f);
        view.setScaleY(0.1f);
        view.setAlpha(0.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        this.d.add(lgVar);
    }

    @Override // defpackage.nxb, defpackage.lm
    public final void j(lg lgVar) {
        F(lgVar);
        super.D(lgVar);
        nwt nwtVar = this.u;
        View view = lgVar.a;
        nwtVar.b(view);
        view.setPivotY(view.getHeight() / 2.0f);
        view.setPivotX(view.getWidth() / 2.0f);
        E(view, true);
        this.c.add(lgVar);
    }

    @Override // defpackage.nxb
    public final ViewPropertyAnimator t(lg lgVar) {
        View view = lgVar.a;
        view.animate().scaleX(1.0f).scaleY(1.0f);
        return view.animate();
    }

    @Override // defpackage.nxb
    public final ViewPropertyAnimator u(lg lgVar) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = lgVar.a.animate();
        viewPropertyAnimatorAnimate.scaleX(0.1f).scaleY(0.1f).setUpdateListener(this.t);
        return viewPropertyAnimatorAnimate;
    }

    @Override // defpackage.nxb
    public final ViewPropertyAnimator v(lg lgVar, int i, int i2, int i3, int i4) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = lgVar.a.animate();
        if (i3 - i != 0) {
            viewPropertyAnimatorAnimate.translationX(0.0f);
        }
        if (i4 - i2 != 0) {
            viewPropertyAnimatorAnimate.translationY(0.0f);
        }
        viewPropertyAnimatorAnimate.setUpdateListener(this.t);
        return viewPropertyAnimatorAnimate;
    }

    @Override // defpackage.nxb
    protected final ViewPropertyAnimator w(lg lgVar) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = lgVar.a.animate();
        viewPropertyAnimatorAnimate.scaleX(0.1f).scaleY(0.1f).alpha(0.0f).setDuration(this.i).setInterpolator(s).setUpdateListener(this.t);
        return viewPropertyAnimatorAnimate;
    }

    @Override // defpackage.nxb
    protected final void x(lg lgVar) {
        nwt nwtVar = this.u;
        View view = lgVar.a;
        nwtVar.b(view);
        E(view, false);
    }

    @Override // defpackage.nxb
    protected final void y(lg lgVar) {
        View view = lgVar.a;
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
    }

    @Override // defpackage.nxb
    protected final void z(lg lgVar) {
        View view = lgVar.a;
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
    }
}
