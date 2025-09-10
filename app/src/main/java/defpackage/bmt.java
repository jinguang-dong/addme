package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmt implements bmv {
    public final bmr a = new bmr(bmu.a, cib.a, bmw.a);
    public final bms b = new bms(this);
    private fnd c;
    private fnd d;

    private final fnd A(byi byiVar) {
        if (a.ao(byiVar, bmx.a)) {
            fnd fndVar = this.c;
            if (fndVar != null) {
                return fndVar;
            }
            fnd fndVar2 = new fnd((char[]) null);
            fndVar2.s(0);
            this.c = fndVar2;
            return fndVar2;
        }
        if (!(byiVar instanceof bmy)) {
            throw new uet();
        }
        fnd fndVarQ = q();
        float fD = fndVarQ.d();
        bmy bmyVar = (bmy) byiVar;
        float f = bmyVar.a;
        if (fD != f) {
            fndVarQ.r(f);
        }
        int iF = fndVarQ.f();
        int i = bmyVar.c;
        if (!a.p(iF, i)) {
            fndVarQ.o(i);
        }
        float fC = fndVarQ.c();
        float f2 = bmyVar.b;
        if (fC != f2) {
            fndVarQ.q(f2);
        }
        int iG = fndVarQ.g();
        int i2 = bmyVar.d;
        if (!a.p(iG, i2)) {
            fndVarQ.p(i2);
        }
        if (!a.ao(null, null)) {
            fndVarQ.t();
        }
        return fndVarQ;
    }

    public static final long p(long j, float f) {
        return f == 1.0f ? j : bko.k(bkv.d(j), bkv.c(j), bkv.b(j), bkv.a(j) * f, bkv.f(j));
    }

    public static /* synthetic */ fnd x(bmt bmtVar, long j, byi byiVar, float f, bkw bkwVar, int i) {
        fnd fndVarA = bmtVar.A(byiVar);
        long jP = p(j, f);
        long jH = fndVarA.h();
        long j2 = bkv.a;
        if (!a.q(jH, jP)) {
            fndVarA.k(jP);
        }
        if (fndVarA.c != null) {
            fndVarA.n(null);
        }
        if (!a.ao(fndVarA.b, bkwVar)) {
            fndVarA.l(bkwVar);
        }
        if (!a.p(fndVarA.a, i)) {
            fndVarA.j(i);
        }
        if (!a.p(fndVarA.e(), 1)) {
            fndVarA.m(1);
        }
        return fndVarA;
    }

    public static /* synthetic */ fnd y(bmt bmtVar, bks bksVar, byi byiVar, float f, int i) {
        return bmtVar.z(bksVar, byiVar, f, null, i, 1);
    }

    private final fnd z(bks bksVar, byi byiVar, float f, bkw bkwVar, int i, int i2) {
        fnd fndVarA = A(byiVar);
        if (bksVar != null) {
            bksVar.a(byi.H(this), fndVarA, f);
        } else {
            if (fndVarA.c != null) {
                fndVarA.n(null);
            }
            long jH = fndVarA.h();
            long j = bkv.a;
            if (!a.q(jH, j)) {
                fndVarA.k(j);
            }
            if (fndVarA.b() != f) {
                fndVarA.i(f);
            }
        }
        if (!a.ao(fndVarA.b, bkwVar)) {
            fndVarA.l(bkwVar);
        }
        if (!a.p(fndVarA.a, i)) {
            fndVarA.j(i);
        }
        if (!a.p(fndVarA.e(), i2)) {
            fndVarA.m(i2);
        }
        return fndVarA;
    }

    @Override // defpackage.chq
    public final float a() {
        return this.a.a.a();
    }

    @Override // defpackage.chw
    public final float b() {
        return this.a.a.b();
    }

    @Override // defpackage.chw
    public final /* synthetic */ float dg(long j) {
        return chp.J(this, j);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float dh(float f) {
        return chp.L(this, f);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float di(int i) {
        return chp.M(this, i);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float dj(long j) {
        return chp.N(this, j);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float dk(float f) {
        return chp.O(this, f);
    }

    @Override // defpackage.chq
    /* renamed from: do */
    public final /* synthetic */ int mo0do(float f) {
        return chp.P(this, f);
    }

    @Override // defpackage.chq
    public final /* synthetic */ long dp(long j) {
        return chp.Q(this, j);
    }

    @Override // defpackage.chw
    public final /* synthetic */ long dq(float f) {
        return chp.K(this, f);
    }

    @Override // defpackage.chq
    public final /* synthetic */ long dr(float f) {
        return chp.R(this, f);
    }

    @Override // defpackage.bmv
    public final /* synthetic */ long l() {
        throw null;
    }

    @Override // defpackage.bmv
    public final /* synthetic */ long m() {
        return byi.H(this);
    }

    @Override // defpackage.bmv
    public final cib n() {
        return this.a.b;
    }

    @Override // defpackage.bmv
    public final bms o() {
        return this.b;
    }

    public final fnd q() {
        fnd fndVar = this.d;
        if (fndVar != null) {
            return fndVar;
        }
        fnd fndVar2 = new fnd((char[]) null);
        fndVar2.s(1);
        this.d = fndVar2;
        return fndVar2;
    }

    @Override // defpackage.bmv
    public final void r(long j, long j2, long j3, float f, byi byiVar, bkw bkwVar, int i) {
        int i2 = (int) (j2 & 4294967295L);
        int i3 = (int) (j2 >> 32);
        this.a.c.o(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 & 4294967295L)), x(this, j, byiVar, f, bkwVar, i));
    }

    @Override // defpackage.bmv
    public final void s(long j, long j2, long j3, long j4, byi byiVar, int i) {
        throw null;
    }

    @Override // defpackage.bmv
    public final void t(bks bksVar, float f, float f2, long j, long j2, byi byiVar) {
        int i = (int) (j & 4294967295L);
        int i2 = (int) (j >> 32);
        this.a.c.r(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j2 & 4294967295L)), f, f2, y(this, bksVar, byiVar, 1.0f, 3));
    }

    @Override // defpackage.bmv
    public final void u(bkn bknVar, long j, byi byiVar) {
        throw null;
    }

    @Override // defpackage.bmv
    public final void v(bkl bklVar, long j, long j2, float f, byi byiVar, bkw bkwVar, int i, int i2) {
        this.a.c.t(bklVar, j, j2, z(null, byiVar, f, bkwVar, i, i2));
    }

    @Override // defpackage.bmv
    public final void w(bkn bknVar, bks bksVar, float f, byi byiVar) {
        this.a.c.s(bknVar, y(this, bksVar, byiVar, f, 3));
    }
}
