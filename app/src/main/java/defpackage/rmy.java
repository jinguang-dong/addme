package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rmy extends rmt {
    public static final /* synthetic */ int f = 0;
    private static final Property g = new rmx(Float.class);
    public final cvn a;
    public final rlx b;
    public int c;
    public boolean d;
    public float e;
    private ObjectAnimator h;

    public rmy(rnd rndVar) {
        super(3);
        this.c = 1;
        this.b = rndVar;
        this.a = new cvn();
    }

    private final void i() {
        if (this.h == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<rmy, Float>) g, 0.0f, 1.0f);
            this.h = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.b.n * 333.0f));
            this.h.setInterpolator(null);
            this.h.setRepeatCount(-1);
            this.h.addListener(new rmw(this));
        }
    }

    @Override // defpackage.rmt
    public final void a() {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.rmt
    public final void b() {
        i();
        this.h.setDuration((long) (this.b.n * 333.0f));
        e();
    }

    final void e() {
        this.d = true;
        this.c = 1;
        for (rmq rmqVar : this.k) {
            rlx rlxVar = this.b;
            rmqVar.c = rlxVar.e[0];
            rmqVar.d = rlxVar.i / 2;
        }
    }

    @Override // defpackage.rmt
    public final void f() {
        i();
        e();
        this.h.start();
    }

    @Override // defpackage.rmt
    public final void d() {
    }

    @Override // defpackage.rmt
    public final void g() {
    }

    @Override // defpackage.rmt
    public final void c(dhj dhjVar) {
    }
}
