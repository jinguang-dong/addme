package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lae {
    public lab a;
    private final pbc e;
    private final pbn f;
    private float g;
    private float h;
    private int i;
    private final syx j;
    private syu k;
    private Float l;
    private Float m;
    private Float n;
    private Float o;
    private Float p;
    private Float q;
    private Float r;
    private pjo s;
    private owf t;
    private final hbj v;
    private final qrh w;
    private boolean d = false;
    private final AtomicBoolean u = new AtomicBoolean(false);
    public final ovx b = new ovx(new lad(0.0f, 0.0f, 0.0f, 0, 0.0f));
    public final ovx c = new ovx(Float.valueOf(0.0f));

    public lae(hbj hbjVar, qrh qrhVar, syx syxVar, pbb pbbVar, pbn pbnVar) {
        this.v = hbjVar;
        gzg gzgVar = gze.a;
        this.w = qrhVar;
        this.j = syxVar;
        this.e = pbbVar.a("DualEvCtrl");
        this.f = pbnVar;
        this.g = 0.5f;
        this.h = 0.0f;
        this.i = 0;
    }

    private static float l(float f) {
        return ske.aj(f, 0.03f, 0.97f);
    }

    private final synchronized float m(float f) {
        float fN;
        fN = n();
        return (float) Math.pow((ske.aj(f, 1.0f, fN) - 1.0f) / (fN - 1.0f), 0.75d);
    }

    private final float n() {
        Float f;
        float f2 = true != this.d ? 15.3f : 11.9f;
        return this.v.p(gyv.e) ? Math.min(f2, ((this.o == null || (f = this.p) == null) ? f2 : f.floatValue() / this.o.floatValue()) * 4.0f) : f2;
    }

    private final synchronized float o(float f) {
        return ((n() - 1.0f) * ((float) Math.pow(f, 1.3333333730697632d))) + 1.0f;
    }

    private final synchronized void p(float f, float f2, float f3) {
        this.o = Float.valueOf(f);
        this.p = Float.valueOf(f2);
        this.q = Float.valueOf(f3);
        this.r = Float.valueOf((float) (Math.log(l(m(f2 / f))) / Math.log(l(this.h))));
    }

    private final synchronized void q() {
        this.b.a(new lad(0.0f, 0.0f, 0.0f, 0, 0.0f));
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
    }

    private static boolean r(float f) {
        return f >= 0.0f && f <= 1.0f;
    }

    public final synchronized lad a(float f, float f2) {
        pjo pjoVar;
        if (this.u.get() && (pjoVar = this.s) != null && r(f) && r(f2)) {
            float fA = pjoVar.a();
            float f3 = this.s.f() * fA;
            float fE = this.s.e() * fA;
            if (this.o != null && this.p != null && this.q != null) {
                float f4 = f3 + ((fE - f3) * f);
                this.r.getClass();
                if (this.v.p(gyv.c)) {
                    float fPow = (float) Math.pow(2.0d, f4);
                    return new lad(this.o.floatValue() * fPow, this.p.floatValue() * fPow, this.q.floatValue() * fPow, Math.round(f4 / fA), 1.0f);
                }
                float fPow2 = (float) Math.pow(2.0d, f4);
                double d = f2;
                int iRound = Math.round(f4 / fA);
                float fO = o((float) Math.pow(d, this.r.floatValue()));
                float fFloatValue = this.o.floatValue() * fPow2;
                float f5 = fFloatValue * fO;
                float fFloatValue2 = this.n.floatValue() * (f5 / this.m.floatValue());
                if (iRound == 0) {
                    iRound = -1;
                }
                return new lad(fFloatValue, f5, fFloatValue2, iRound, fO / (this.p.floatValue() / this.o.floatValue()));
            }
            Float f6 = this.l;
            if (f6 != null && this.m != null && this.n != null) {
                p(f6.floatValue(), this.m.floatValue(), this.n.floatValue());
                return new lad(0.0f, 0.0f, 0.0f, 0, 0.0f);
            }
        }
        return new lad(0.0f, 0.0f, 0.0f, 0, 0.0f);
    }

    public final synchronized lag b() {
        Float f = this.l;
        if (f != null && this.m != null) {
            this.n.getClass();
            float fFloatValue = f.floatValue();
            float fFloatValue2 = this.m.floatValue();
            this.n.floatValue();
            this.g = 0.5f;
            float fM = m(fFloatValue2 / fFloatValue);
            this.h = fM;
            if (this.i > 0) {
                fM = ske.aj(fM, 0.08f, 0.92f);
                this.h = fM;
            }
            return new lag(this.g, fM);
        }
        return new lag(0.5f, 0.0f);
    }

    public final synchronized owf c() {
        return this.b;
    }

    public final synchronized spr d() {
        Float f;
        tpc tpcVarM = spr.a.m();
        if (this.u.get() && (f = this.o) != null && this.p != null) {
            this.q.getClass();
            float fFloatValue = f.floatValue();
            float fFloatValue2 = this.p.floatValue();
            float fFloatValue3 = this.q.floatValue();
            lad ladVar = (lad) this.b.d;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            tph tphVar = tpcVarM.b;
            spr sprVar = (spr) tphVar;
            sprVar.b |= 1;
            sprVar.c = fFloatValue;
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            tph tphVar2 = tpcVarM.b;
            spr sprVar2 = (spr) tphVar2;
            sprVar2.b |= 2;
            sprVar2.d = fFloatValue2;
            if (!tphVar2.C()) {
                tpcVarM.o();
            }
            tph tphVar3 = tpcVarM.b;
            spr sprVar3 = (spr) tphVar3;
            sprVar3.b |= 4;
            sprVar3.e = fFloatValue3;
            float f2 = ladVar.a;
            if (!tphVar3.C()) {
                tpcVarM.o();
            }
            tph tphVar4 = tpcVarM.b;
            spr sprVar4 = (spr) tphVar4;
            sprVar4.b |= 8;
            sprVar4.f = f2;
            float f3 = ladVar.b;
            if (!tphVar4.C()) {
                tpcVarM.o();
            }
            tph tphVar5 = tpcVarM.b;
            spr sprVar5 = (spr) tphVar5;
            sprVar5.b |= 16;
            sprVar5.g = f3;
            float f4 = ladVar.c;
            if (!tphVar5.C()) {
                tpcVarM.o();
            }
            spr sprVar6 = (spr) tpcVarM.b;
            sprVar6.b |= 32;
            sprVar6.h = f4;
            return (spr) tpcVarM.l();
        }
        return (spr) tpcVarM.l();
    }

    public final syu e() {
        syu syuVarI;
        syu syuVar = this.k;
        if (syuVar == null || syuVar.isDone()) {
            pbp pbpVarA = this.f.a("PckDualEvController#waitForAeReset");
            if (this.i <= 0) {
                syuVarI = ske.M(Boolean.TRUE);
            } else {
                q();
                lab labVar = new lab();
                synchronized (this) {
                    this.a = labVar;
                }
                syx syxVar = this.j;
                syuVarI = swf.i(ske.T(labVar.b, 500L, TimeUnit.MILLISECONDS, syxVar), Throwable.class, new jku(15), syxVar);
                syuVarI.c(new lac(this, 0), sxo.a);
            }
            this.k = swz.i(syuVarI, new iaz(this, pbpVarA, 4), this.j);
        }
        return this.k;
    }

    public final synchronized void f() {
        this.i = 0;
        if (i()) {
            this.e.b("Resetting dual ev (touchCounter : " + this.i + ").");
            q();
            this.u.set(false);
        }
    }

    public final synchronized void g() {
        if (i()) {
            int i = this.i + 1;
            this.i = i;
            this.e.b("Tapped to initiate dual ev (touchCounter : " + i + ").");
            q();
            this.u.set(true);
        }
    }

    public final synchronized void h(pjo pjoVar, float f, float f2, float f3) {
        pjo pjoVar2;
        this.s = pjoVar;
        this.d = false;
        if (this.v.p(gyv.d) && (pjoVar2 = this.s) != null && pjoVar2.l() == pka.BACK && this.s.u().size() == 1 && ((Float) this.s.u().get(0)).floatValue() < 3.5f) {
            this.d = true;
        }
        this.l = Float.valueOf(f);
        this.m = Float.valueOf(f2);
        this.n = Float.valueOf(f3);
        lab labVar = this.a;
        if (labVar != null && labVar.a.decrementAndGet() <= 0) {
            labVar.b.e(Boolean.TRUE);
        }
        this.c.a(Float.valueOf(m(f2 / f)));
    }

    public final synchronized boolean i() {
        owf owfVar = this.t;
        if (owfVar != null && ((lah) owfVar.dL()).a) {
            if (((lah) this.t.dL()).b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void j(fdq fdqVar, owf owfVar) {
        this.t = owfVar;
        our ourVarI = fdqVar.i();
        qrh qrhVar = this.w;
        ourVarI.d(owl.a(qrhVar.e, qrhVar.c).dK(new ksq(this, 7), sxo.a));
    }

    public final void k() {
    }
}
