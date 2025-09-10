package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dps extends bij implements buu {
    public bne a;
    private final brk b;
    private final bie c;

    public dps(bne bneVar, bie bieVar, brk brkVar) {
        this.a = bneVar;
        this.c = bieVar;
        this.b = brkVar;
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
            jI = bko.I(j3, this.b.a(j3, bvoVar.m()));
        }
        long j4 = jI;
        long jA2 = this.c.a((Math.round(Float.intBitsToFloat((int) (j4 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (j4 & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (bvoVar.m() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (bvoVar.m() & 4294967295L))) & 4294967295L), bvoVar.n());
        float fA = chy.a(jA2);
        float fB = chy.b(jA2);
        bvoVar.o().c.i(fA, fB);
        float f = -fA;
        float f2 = -fB;
        try {
            bne.f(this.a, bvoVar, j4, 0.0f, 6);
            bvoVar.o().c.i(f, f2);
            bvoVar.p();
        } catch (Throwable th) {
            bvoVar.o().c.i(f, f2);
            throw th;
        }
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.a + ", alignment=" + this.c + ", contentScale=" + this.b + ')';
    }

    @Override // defpackage.buu
    public final /* synthetic */ void cR() {
    }
}
