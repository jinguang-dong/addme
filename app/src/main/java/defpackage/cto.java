package defpackage;

import android.util.AndroidRuntimeException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cto extends ctj {
    public ctp s;
    private float t;
    private boolean u;

    public cto(ctn ctnVar) {
        super(ctnVar);
        this.s = null;
        this.t = Float.MAX_VALUE;
        this.u = false;
    }

    @Override // defpackage.ctj
    public final void c() {
        super.c();
        float f = this.t;
        if (f != Float.MAX_VALUE) {
            ctp ctpVar = this.s;
            if (ctpVar == null) {
                this.s = new ctp(f);
            } else {
                ctpVar.d(f);
            }
            this.t = Float.MAX_VALUE;
        }
    }

    @Override // defpackage.ctj
    public final void g() {
        ctp ctpVar = this.s;
        if (ctpVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = ctpVar.a();
        if (dA > this.o) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.p) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(b());
        ctpVar.c = dAbs;
        ctpVar.d = dAbs * 62.5d;
        super.g();
    }

    @Override // defpackage.ctj
    public final boolean h(long j) {
        float f;
        if (this.u) {
            float f2 = this.t;
            if (f2 != Float.MAX_VALUE) {
                this.s.d(f2);
                this.t = Float.MAX_VALUE;
            }
            this.j = this.s.a();
            this.i = 0.0f;
            this.u = false;
            return true;
        }
        if (this.t != Float.MAX_VALUE) {
            long j2 = j / 2;
            ctf ctfVarB = this.s.b(this.j, this.i, j2);
            this.s.d(this.t);
            this.t = Float.MAX_VALUE;
            ctf ctfVarB2 = this.s.b(ctfVarB.a, ctfVarB.b, j2);
            f = ctfVarB2.a;
            this.j = f;
            this.i = ctfVarB2.b;
        } else {
            ctf ctfVarB3 = this.s.b(this.j, this.i, j);
            f = ctfVarB3.a;
            this.j = f;
            this.i = ctfVarB3.b;
        }
        float fMax = Math.max(f, this.p);
        this.j = fMax;
        this.j = Math.min(fMax, this.o);
        float f3 = this.i;
        ctp ctpVar = this.s;
        if (Math.abs(f3) >= ctpVar.d || Math.abs(r1 - ctpVar.a()) >= ctpVar.c) {
            return false;
        }
        this.j = this.s.a();
        this.i = 0.0f;
        return true;
    }

    public final void m(float f) {
        if (this.n) {
            this.t = f;
            return;
        }
        if (this.s == null) {
            this.s = new ctp(f);
        }
        this.s.d(f);
        g();
    }

    public final void n() {
        if (this.s.b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!csv.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.n) {
            this.u = true;
        }
    }

    public cto(ctn ctnVar, float f) {
        super(ctnVar);
        this.s = null;
        this.t = Float.MAX_VALUE;
        this.u = false;
        this.s = new ctp(f);
    }

    public cto(Object obj, ctm ctmVar) {
        super(obj, ctmVar);
        this.s = null;
        this.t = Float.MAX_VALUE;
        this.u = false;
    }

    public cto(Object obj, ctm ctmVar, float f) {
        super(obj, ctmVar);
        this.s = null;
        this.t = Float.MAX_VALUE;
        this.u = false;
        this.s = new ctp(f);
    }

    @Override // defpackage.ctj
    public final void f(float f) {
    }
}
