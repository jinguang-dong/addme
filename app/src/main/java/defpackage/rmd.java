package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rmd extends rmt {
    public static final int[] a = {0, 1350, 2700, 4050};
    public static final int[] b = {667, 2017, 3367, 4717};
    public static final int[] c = {1000, 2350, 3700, 5050};
    private static final Property l = new rmb(Float.class);
    private static final Property m = new rmc(Float.class);
    public final cvn d;
    public final rlx e;
    public int f;
    public float g;
    public float h;
    dhj i;
    private ObjectAnimator n;
    private ObjectAnimator o;

    public rmd(rmj rmjVar) {
        super(1);
        this.f = 0;
        this.i = null;
        this.e = rmjVar;
        this.d = new cvn();
    }

    private final void i() {
        if (this.n == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<rmd, Float>) l, 0.0f, 1.0f);
            this.n = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.e.n * 5400.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new rlz(this));
        }
        if (this.o == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<rmd, Float>) m, 0.0f, 1.0f);
            this.o = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.e.n * 333.0f));
            this.o.setInterpolator(this.d);
            this.o.addListener(new rma(this));
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
        rlx rlxVar = this.e;
        ObjectAnimator objectAnimator = this.n;
        float f = rlxVar.n;
        objectAnimator.setDuration((long) (5400.0f * f));
        this.o.setDuration((long) (f * 333.0f));
        e();
    }

    @Override // defpackage.rmt
    public final void c(dhj dhjVar) {
        this.i = dhjVar;
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
        this.f = 0;
        ((rmq) this.k.get(0)).c = this.e.e[0];
        this.h = 0.0f;
    }

    @Override // defpackage.rmt
    public final void f() {
        i();
        e();
        this.n.start();
    }

    @Override // defpackage.rmt
    public final void g() {
        this.i = null;
    }
}
