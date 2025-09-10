package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjl extends bij implements bve, buu {
    public bne a;
    public boolean b;
    public brk c;
    public float d;
    public bkw e;
    public bie f;

    public bjl(bne bneVar, boolean z, bie bieVar, brk brkVar, float f, bkw bkwVar) {
        this.a = bneVar;
        this.b = z;
        this.f = bieVar;
        this.c = brkVar;
        this.d = f;
        this.e = bkwVar;
    }

    private final long h(long j) {
        boolean z = cho.h(j) && cho.g(j);
        boolean z2 = cho.j(j) && cho.i(j);
        if ((!k() && z) || z2) {
            return cho.k(j, cho.b(j), 0, cho.a(j), 0, 10);
        }
        long jA = this.a.a();
        int iRound = a.D(jA) ? Math.round(Float.intBitsToFloat((int) (jA >> 32))) : cho.d(j);
        int iRound2 = a.C(jA) ? Math.round(Float.intBitsToFloat((int) (jA & 4294967295L))) : cho.c(j);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(chp.b(j, iRound2)) & 4294967295L) | (Float.floatToRawIntBits(chp.c(j, iRound)) << 32);
        if (k()) {
            int i = (int) (jFloatToRawIntBits >> 32);
            float fIntBitsToFloat = !a.D(this.a.a()) ? Float.intBitsToFloat(i) : Float.intBitsToFloat((int) (this.a.a() >> 32));
            float fIntBitsToFloat2 = !a.C(this.a.a()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.a.a() & 4294967295L));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat2);
            long j2 = jFloatToRawIntBits2 << 32;
            long j3 = jFloatToRawIntBits3 & 4294967295L;
            if (Float.intBitsToFloat(i) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) {
                jFloatToRawIntBits = 0;
            } else {
                long j4 = j2 | j3;
                jFloatToRawIntBits = bko.I(j4, this.c.a(j4, jFloatToRawIntBits));
            }
        }
        return cho.k(j, chp.c(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)))), 0, chp.b(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))), 0, 10);
    }

    private final boolean k() {
        return this.b && this.a.a() != 9205357640488583168L;
    }

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        bte bteVarR = bsqVar.r(h(j));
        return bstVar.ds(bteVarR.a, bteVarR.b, ufx.a, new aal(bteVarR, 3));
    }

    @Override // defpackage.bve
    public final int c(brv brvVar, bru bruVar, int i) {
        if (!k()) {
            return bruVar.c(i);
        }
        long jH = h(chp.k(i, 0, 13));
        return Math.max(cho.c(jH), bruVar.c(i));
    }

    @Override // defpackage.buu
    public final void cS(bvo bvoVar) {
        long jI;
        long jA = this.a.a();
        float fIntBitsToFloat = a.D(jA) ? Float.intBitsToFloat((int) (jA >> 32)) : Float.intBitsToFloat((int) (bvoVar.m() >> 32));
        float fIntBitsToFloat2 = a.C(jA) ? Float.intBitsToFloat((int) (jA & 4294967295L)) : Float.intBitsToFloat((int) (bvoVar.m() & 4294967295L));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
        long j = jFloatToRawIntBits << 32;
        long j2 = jFloatToRawIntBits2 & 4294967295L;
        if (Float.intBitsToFloat((int) (bvoVar.m() >> 32)) == 0.0f || Float.intBitsToFloat((int) (bvoVar.m() & 4294967295L)) == 0.0f) {
            jI = 0;
        } else {
            long j3 = j | j2;
            jI = bko.I(j3, this.c.a(j3, bvoVar.m()));
        }
        long j4 = jI;
        long jA2 = this.f.a((Math.round(Float.intBitsToFloat((int) (j4 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (j4 & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (bvoVar.m() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (bvoVar.m() & 4294967295L))) & 4294967295L), bvoVar.n());
        float fA = chy.a(jA2);
        float fB = chy.b(jA2);
        bvoVar.o().c.i(fA, fB);
        float f = -fA;
        float f2 = -fB;
        try {
            this.a.e(bvoVar, j4, this.d, this.e);
            bvoVar.o().c.i(f, f2);
            bvoVar.p();
        } catch (Throwable th) {
            bvoVar.o().c.i(f, f2);
            throw th;
        }
    }

    @Override // defpackage.bve
    public final int d(brv brvVar, bru bruVar, int i) {
        if (!k()) {
            return bruVar.d(i);
        }
        long jH = h(chp.k(0, i, 7));
        return Math.max(cho.d(jH), bruVar.d(i));
    }

    @Override // defpackage.bij
    public final boolean db() {
        return false;
    }

    @Override // defpackage.bve
    public final int e(brv brvVar, bru bruVar, int i) {
        if (!k()) {
            return bruVar.e(i);
        }
        long jH = h(chp.k(i, 0, 13));
        return Math.max(cho.c(jH), bruVar.e(i));
    }

    @Override // defpackage.bve
    public final int f(brv brvVar, bru bruVar, int i) {
        if (!k()) {
            return bruVar.f(i);
        }
        long jH = h(chp.k(0, i, 7));
        return Math.max(cho.d(jH), bruVar.f(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.f + ", alpha=" + this.d + ", colorFilter=" + this.e + ')';
    }

    @Override // defpackage.buu
    public final /* synthetic */ void cR() {
    }
}
