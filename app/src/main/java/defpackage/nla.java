package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nla {
    public int a;
    private final Interpolator b;
    private final AnimatorSet c = new AnimatorSet();
    private AnimatorSet.Builder d;

    public nla(int i, Interpolator interpolator) {
        this.a = i;
        this.b = interpolator;
    }

    public final AnimatorSet a() {
        return this.c.clone();
    }

    public final void b(Object obj, String str, float f, float f2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, str, f, f2);
        objectAnimatorOfFloat.setDuration(this.a);
        objectAnimatorOfFloat.setInterpolator(this.b);
        AnimatorSet.Builder builder = this.d;
        if (builder == null) {
            this.d = this.c.play(objectAnimatorOfFloat);
        } else {
            builder.with(objectAnimatorOfFloat);
        }
    }

    public final void c(Object obj, String str, int i, int i2) {
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(obj, str, i, i2);
        objectAnimatorOfArgb.setDuration(this.a);
        objectAnimatorOfArgb.setInterpolator(this.b);
        AnimatorSet.Builder builder = this.d;
        if (builder == null) {
            this.d = this.c.play(objectAnimatorOfArgb);
        } else {
            builder.with(objectAnimatorOfArgb);
        }
    }
}
