package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rmi extends rmt {
    public final TimeInterpolator c;
    public final rlx d;
    public int e;
    public float f;
    public float g;
    dhj h;
    private ObjectAnimator n;
    private ObjectAnimator o;
    private static final TimeInterpolator i = rhn.b;
    public static final int[] a = {0, 1500, 3000, 4500};
    public static final float[] b = {0.1f, 0.87f};
    private static final Property l = new rmg(Float.class);
    private static final Property m = new rmh(Float.class);

    public rmi(Context context, rmj rmjVar) {
        super(1);
        this.e = 0;
        this.h = null;
        this.d = rmjVar;
        this.c = qpt.G(context, R.attr.motionEasingStandardInterpolator, i);
    }

    private final void i() {
        if (this.n == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<rmi, Float>) l, 0.0f, 1.0f);
            this.n = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.d.n * 6000.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new rme(this));
        }
        if (this.o == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<rmi, Float>) m, 0.0f, 1.0f);
            this.o = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.d.n * 500.0f));
            this.o.addListener(new rmf(this));
        }
    }

    @Override // defpackage.rmt
    public final void a() {
        ObjectAnimator objectAnimator = this.n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.rmt
    public final void b() {
        i();
        rlx rlxVar = this.d;
        ObjectAnimator objectAnimator = this.n;
        float f = rlxVar.n;
        objectAnimator.setDuration((long) (6000.0f * f));
        this.o.setDuration((long) (f * 500.0f));
        e();
    }

    @Override // defpackage.rmt
    public final void c(dhj dhjVar) {
        this.h = dhjVar;
    }

    @Override // defpackage.rmt
    public final void d() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.j.isVisible()) {
            this.o.start();
        } else {
            a();
        }
    }

    final void e() {
        this.e = 0;
        ((rmq) this.k.get(0)).c = this.d.e[0];
        this.g = 0.0f;
    }

    @Override // defpackage.rmt
    public final void f() {
        i();
        e();
        this.n.start();
    }

    @Override // defpackage.rmt
    public final void g() {
        this.h = null;
    }
}
