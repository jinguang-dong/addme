package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fft implements owf, paq {
    private static final paq a = new fgp(1);
    private owf b = owp.a(nkw.UNINITIALIZED);
    private paq c;
    private owf d;
    private paq e;
    private owf f;
    private paq g;
    private owf h;
    private paq i;
    private owf j;
    private paq k;
    private owf l;
    private paq m;
    private owf n;
    private paq o;
    private owf p;
    private paq q;
    private owf r;
    private paq s;
    private owf t;
    private paq u;
    private final Executor v;
    private final owq w;
    private final owf x;
    private final fgn y;

    public fft(Executor executor, fgn fgnVar) {
        paq paqVar = a;
        this.c = paqVar;
        this.d = new ovx(false);
        this.e = paqVar;
        this.f = new ovx(false);
        this.g = paqVar;
        this.h = new ovx(false);
        this.i = paqVar;
        this.j = new owi(false);
        this.k = paqVar;
        this.l = new ovx(false);
        this.m = paqVar;
        this.n = new ovx(false);
        this.o = paqVar;
        this.p = new ovx(false);
        this.q = paqVar;
        this.r = new ovx(false);
        this.s = paqVar;
        this.t = new ovx(false);
        this.u = paqVar;
        ovx ovxVar = new ovx(fhc.INACTIVE);
        this.w = ovxVar;
        this.x = owb.a(ovxVar);
        this.v = executor;
        this.y = fgnVar;
    }

    private final synchronized fhc p() {
        nkw nkwVar = (nkw) this.b.dL();
        boolean zBooleanValue = ((Boolean) this.r.dL()).booleanValue();
        fgn fgnVar = this.y;
        boolean zD = fgnVar.d(nkwVar);
        boolean zBooleanValue2 = ((Boolean) this.d.dL()).booleanValue();
        boolean zBooleanValue3 = ((Boolean) this.f.dL()).booleanValue();
        boolean zBooleanValue4 = ((Boolean) this.h.dL()).booleanValue();
        boolean zBooleanValue5 = ((Boolean) this.j.dL()).booleanValue();
        boolean z = true;
        if (((Boolean) this.l.dL()).booleanValue() && !fgnVar.a()) {
            z = false;
        }
        boolean zBooleanValue6 = ((Boolean) this.n.dL()).booleanValue();
        boolean zBooleanValue7 = ((Boolean) this.p.dL()).booleanValue();
        boolean zBooleanValue8 = ((Boolean) this.t.dL()).booleanValue();
        shl shlVar = shx.a;
        if (!zBooleanValue5 && !zBooleanValue6 && !zBooleanValue7 && !zBooleanValue8) {
            if (!zBooleanValue3) {
                return fhc.INACTIVE_THROTTLED;
            }
            if (!zBooleanValue4) {
                return fhc.INACTIVE_UNSUPPORTED_LENS;
            }
            if (!zD) {
                return fhc.INACTIVE_UNSUPPORTED_MODE;
            }
            if (!z) {
                return fhc.INACTIVE_UNSUPPORTED_RESOLUTION;
            }
            if (!zBooleanValue2) {
                return fhc.INACTIVE_ALLOWED;
            }
            if (zBooleanValue) {
                return fhc.ACTIVE;
            }
            return fhc.INACTIVE_ACTIVE_CAMERA_NOT_ALLOWED;
        }
        return fhc.INACTIVE;
    }

    @Override // defpackage.owf
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fhc dL() {
        return (fhc) this.x.dL();
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        d();
        this.e.close();
        paq paqVar = a;
        this.e = paqVar;
        this.g.close();
        this.g = paqVar;
        this.i.close();
        this.i = paqVar;
        this.k.close();
        this.k = paqVar;
        this.s.close();
        this.s = paqVar;
    }

    public final synchronized void d() {
        this.c.close();
        paq paqVar = a;
        this.c = paqVar;
        this.m.close();
        this.m = paqVar;
        this.o.close();
        this.o = paqVar;
        this.q.close();
        this.q = paqVar;
        this.u.close();
        this.u = paqVar;
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        return this.x.dK(pauVar, executor);
    }

    public final synchronized void e(owf owfVar) {
        this.r = owfVar;
        this.s.close();
        this.s = this.r.dK(new fbo(this, 10), this.v);
    }

    public final synchronized void f(owf owfVar) {
        this.b = owfVar;
        this.c.close();
        this.c = owfVar.dK(new fbo(this, 3), this.v);
    }

    final synchronized void g(owf owfVar) {
        this.p = owfVar;
        this.q.close();
        this.q = this.p.dK(new fbo(this, 8), this.v);
    }

    public final synchronized void h(owf owfVar) {
        this.j = owfVar;
        this.k.close();
        this.k = owfVar.dK(new fbo(this, 11), this.v);
    }

    public final synchronized void i(owf owfVar) {
        this.l = owfVar;
        this.m.close();
        this.m = this.l.dK(new fbo(this, 12), this.v);
    }

    public final synchronized void j(owf owfVar) {
        this.h = owfVar;
        this.i.close();
        this.i = owfVar.dK(new fbo(this, 7), this.v);
    }

    final synchronized void k(owf owfVar) {
        this.t = owfVar;
        this.u.close();
        this.u = owfVar.dK(new fbo(this, 5), this.v);
    }

    final synchronized void l(owf owfVar) {
        this.n = owfVar;
        this.o.close();
        this.o = this.n.dK(new fbo(this, 9), this.v);
    }

    public final synchronized void m(owf owfVar) {
        this.f = owfVar;
        this.g.close();
        this.g = owfVar.dK(new fbo(this, 4), this.v);
    }

    public final synchronized void n(owf owfVar) {
        this.d = owfVar;
        this.e.close();
        this.e = owfVar.dK(new fbo(this, 6), this.v);
    }

    public final synchronized void o() {
        fhc fhcVarP = p();
        shl shlVar = shx.a;
        this.w.a(fhcVarP);
    }
}
