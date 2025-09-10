package defpackage;

import com.google.android.material.button.xlT.JvFFEwFNdCrxf;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uvg extends unp implements uhq, uhb {
    public final una a;
    public final uhb b;
    public Object c;
    public final Object d;
    public final umb f;

    public uvg(una unaVar, uhb uhbVar) {
        super(-1);
        this.a = unaVar;
        this.b = uhbVar;
        this.c = uvh.a;
        this.d = uwe.a(q());
        this.f = new umb(null, umc.a);
    }

    public final void c(uhf uhfVar, Object obj) {
        this.c = obj;
        this.e = 1;
        this.a.f(uhfVar, this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [uhb, uhq] */
    @Override // defpackage.uhq
    public final uhq cK() {
        return this.b;
    }

    @Override // defpackage.uhq
    public final void cL() {
    }

    @Override // defpackage.uhb
    public final void fW(Object obj) {
        Object objO = ung.o(obj);
        una unaVar = this.a;
        if (uvh.c(unaVar, q())) {
            this.c = objO;
            this.e = 0;
            uvh.b(unaVar, q(), this);
            return;
        }
        boolean z = unf.a;
        ThreadLocal threadLocal = upk.a;
        unw unwVarA = upk.a();
        if (unwVarA.p()) {
            this.c = objO;
            this.e = 0;
            unwVarA.n(this);
            return;
        }
        unwVarA.o(true);
        try {
            uhf uhfVarQ = q();
            Object objB = uwe.b(uhfVarQ, this.d);
            try {
                this.b.fW(obj);
                while (unwVarA.r()) {
                }
            } finally {
                uwe.c(uhfVarQ, objB);
            }
        } catch (Throwable th) {
            try {
                F(th);
            } finally {
                unwVarA.m(true);
            }
        }
    }

    @Override // defpackage.unp
    public final Object l() {
        Object obj = this.c;
        boolean z = unf.a;
        this.c = uvh.a;
        return obj;
    }

    @Override // defpackage.unp
    public final uhb p() {
        return this;
    }

    @Override // defpackage.uhb
    public final uhf q() {
        return this.b.q();
    }

    public final String toString() {
        return JvFFEwFNdCrxf.nKfgLXdhxN + this.a + ", " + ung.c(this.b) + "]";
    }
}
