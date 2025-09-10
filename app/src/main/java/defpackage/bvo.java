package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvo implements bmv {
    public final bmt a;
    private buu b;

    public bvo() {
        this(null);
    }

    @Override // defpackage.chq
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.chw
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.chw
    public final float dg(long j) {
        return chp.J(this.a, j);
    }

    @Override // defpackage.chq
    public final float dh(float f) {
        return chp.L(this.a, f);
    }

    @Override // defpackage.chq
    public final float di(int i) {
        return chp.M(this.a, i);
    }

    @Override // defpackage.chq
    public final float dj(long j) {
        return chp.N(this.a, j);
    }

    @Override // defpackage.chq
    public final float dk(float f) {
        return chp.O(this.a, f);
    }

    @Override // defpackage.chq
    /* renamed from: do */
    public final int mo0do(float f) {
        return chp.P(this.a, f);
    }

    @Override // defpackage.chq
    public final long dp(long j) {
        return chp.Q(this.a, j);
    }

    @Override // defpackage.chw
    public final long dq(float f) {
        return chp.K(this.a, f);
    }

    @Override // defpackage.chq
    public final long dr(float f) {
        return chp.R(this.a, f);
    }

    @Override // defpackage.bmv
    public final long l() {
        return bko.q(this.a.b.a());
    }

    @Override // defpackage.bmv
    public final long m() {
        return byi.H(this.a);
    }

    @Override // defpackage.bmv
    public final cib n() {
        return this.a.n();
    }

    @Override // defpackage.bmv
    public final bms o() {
        return this.a.b;
    }

    public final void p() {
        bku bkuVarB = o().b();
        buu buuVar = this.b;
        if (buuVar == null) {
            bqs.a("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
            throw new uer();
        }
        bij bijVarY = buuVar.B().q;
        if (bijVarY == null || (bijVarY.o & 4) == 0) {
            bijVarY = null;
        } else {
            while (bijVarY != null) {
                int i = bijVarY.n;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    bijVarY = bijVarY.q;
                }
            }
            bijVarY = null;
        }
        if (bijVarY == null) {
            bwi bwiVarC = bko.C(buuVar, 4);
            if (bwiVarC.x() == buuVar.B()) {
                bwiVarC = bwiVarC.v;
                bwiVarC.getClass();
            }
            bwiVarC.B(bkuVarB, o().a);
            return;
        }
        bdp bdpVar = null;
        while (bijVarY != null) {
            if (bijVarY instanceof buu) {
                buu buuVar2 = (buu) bijVarY;
                bmz bmzVar = o().a;
                bwi bwiVarC2 = bko.C(buuVar2, 4);
                bwiVarC2.s.k().q(bkuVarB, chp.G(bwiVarC2.c), bwiVarC2, buuVar2, bmzVar);
            } else if ((bijVarY.n & 4) != 0 && (bijVarY instanceof bup)) {
                int i2 = 0;
                for (bij bijVar = ((bup) bijVarY).y; bijVar != null; bijVar = bijVar.q) {
                    if ((bijVar.n & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            bijVarY = bijVar;
                        } else {
                            if (bdpVar == null) {
                                bdpVar = new bdp(new bij[16]);
                            }
                            if (bijVarY != null) {
                                bdpVar.n(bijVarY);
                            }
                            bdpVar.n(bijVar);
                            bijVarY = null;
                        }
                    }
                }
                if (i2 != 1) {
                }
            }
            bijVarY = bko.y(bdpVar);
        }
    }

    public final void q(bku bkuVar, long j, bwi bwiVar, buu buuVar, bmz bmzVar) {
        buu buuVar2 = this.b;
        this.b = buuVar;
        bmt bmtVar = this.a;
        bms bmsVar = bmtVar.b;
        cib cibVarM = bwiVar.m();
        chq chqVarC = bmsVar.c();
        cib cibVarD = bmsVar.d();
        bku bkuVarB = bmsVar.b();
        long jA = bmsVar.a();
        bmz bmzVar2 = bmsVar.a;
        bmsVar.f(bwiVar);
        bmsVar.g(cibVarM);
        bmsVar.e(bkuVar);
        bmsVar.h(j);
        bmsVar.a = bmzVar;
        bkuVar.f();
        try {
            buuVar.cS(this);
            bkuVar.d();
            bms bmsVar2 = bmtVar.b;
            bmsVar2.f(chqVarC);
            bmsVar2.g(cibVarD);
            bmsVar2.e(bkuVarB);
            bmsVar2.h(jA);
            bmsVar2.a = bmzVar2;
            this.b = buuVar2;
        } catch (Throwable th) {
            bkuVar.d();
            bms bmsVar3 = bmtVar.b;
            bmsVar3.f(chqVarC);
            bmsVar3.g(cibVarD);
            bmsVar3.e(bkuVarB);
            bmsVar3.h(jA);
            bmsVar3.a = bmzVar2;
            throw th;
        }
    }

    @Override // defpackage.bmv
    public final void r(long j, long j2, long j3, float f, byi byiVar, bkw bkwVar, int i) {
        this.a.r(j, j2, j3, f, byiVar, bkwVar, i);
    }

    @Override // defpackage.bmv
    public final void s(long j, long j2, long j3, long j4, byi byiVar, int i) {
        int i2 = (int) (j2 & 4294967295L);
        bmt bmtVar = this.a;
        int i3 = (int) (j2 >> 32);
        bmtVar.a.c.p(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), bmt.x(bmtVar, j, byiVar, 1.0f, null, i));
    }

    @Override // defpackage.bmv
    public final void t(bks bksVar, float f, float f2, long j, long j2, byi byiVar) {
        this.a.t(bksVar, f, f2, j, j2, byiVar);
    }

    @Override // defpackage.bmv
    public final void u(bkn bknVar, long j, byi byiVar) {
        bmt bmtVar = this.a;
        bmtVar.a.c.s(bknVar, bmt.x(bmtVar, j, byiVar, 1.0f, null, 3));
    }

    @Override // defpackage.bmv
    public final void v(bkl bklVar, long j, long j2, float f, byi byiVar, bkw bkwVar, int i, int i2) {
        this.a.v(bklVar, j, j2, f, byiVar, bkwVar, i, i2);
    }

    @Override // defpackage.bmv
    public final void w(bkn bknVar, bks bksVar, float f, byi byiVar) {
        this.a.w(bknVar, bksVar, f, byiVar);
    }

    public /* synthetic */ bvo(byte[] bArr) {
        this.a = new bmt();
    }
}
