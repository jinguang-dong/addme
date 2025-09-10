package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlr {
    public static final Interpolator a = new PathInterpolator(0.17f, 0.17f, 0.0f, 1.0f);
    public final View b;
    public final AnimatorSet c;
    public int d;
    private final int e;

    public nlr(View view) {
        this(view, false);
    }

    public final void a() {
        AnimatorSet animatorSet = this.c;
        animatorSet.cancel();
        animatorSet.removeAllListeners();
        rnt.u(this.d == 3, "State should be stable with no animation", new Object[0]);
    }

    public final void b() {
        this.d = 3;
    }

    public final void c() throws Resources.NotFoundException {
        a();
        this.d = 1;
        View view = this.b;
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(view.getContext(), R.animator.fade_in);
        AnimatorSet animatorSet = this.c;
        animatorSet.play(animatorLoadAnimator);
        animatorSet.setTarget(view);
        animatorSet.setDuration(217L);
        animatorSet.setStartDelay(this.e);
        animatorSet.addListener(new nlo(this));
        animatorSet.start();
        rnt.s(animatorSet.isStarted());
    }

    public final void d() throws Resources.NotFoundException {
        a();
        this.d = 2;
        View view = this.b;
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(view.getContext(), R.animator.fade_out);
        AnimatorSet animatorSet = this.c;
        animatorSet.play(animatorLoadAnimator);
        animatorSet.setTarget(view);
        animatorSet.setDuration(217L);
        animatorSet.setStartDelay(this.e);
        animatorSet.addListener(new nlq(this));
        animatorSet.start();
    }

    public nlr(View view, boolean z) {
        this.c = new AnimatorSet();
        this.d = 3;
        this.b = view;
        this.e = true != z ? 0 : 217;
    }
}
