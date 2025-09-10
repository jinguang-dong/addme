package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class drx extends bne {
    private final uiq a;
    private final blp b;
    private final bne c;
    private blh d;
    private final bkn e = new bkn((byte[]) null);

    public drx(uiq uiqVar, blp blpVar, bne bneVar) {
        this.a = uiqVar;
        this.b = blpVar;
        this.c = bneVar;
    }

    @Override // defpackage.bne
    public final long a() {
        return 9205357640488583168L;
    }

    @Override // defpackage.bne
    protected final void b(bmv bmvVar) {
        Object objA = this.a.a(bmvVar);
        long jM = bmvVar.m() >> 32;
        float f = ((dse) objA).c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) jM) * f;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (bmvVar.m() >> 32)) - fIntBitsToFloat) / 2.0f;
        bmvVar.o().c.i(fIntBitsToFloat2, 0.0f);
        float f2 = -fIntBitsToFloat2;
        try {
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (bmvVar.m() & 4294967295L)) * f;
            blh blhVarA = this.b.a((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L), bmvVar.n(), bmvVar);
            if (!a.ao(blhVarA, this.d)) {
                this.d = blhVarA;
                bkn bknVar = this.e;
                bknVar.k();
                blb.b(bknVar, blhVarA);
            }
            bkn bknVar2 = this.e;
            bms bmsVarO = bmvVar.o();
            long jA = bmsVarO.a();
            bmsVarO.b().f();
            try {
                bmsVarO.c.k(bknVar2);
                bne.f(this.c, bmvVar, (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), ((dse) objA).a, 4);
            } finally {
                bmsVarO.b().d();
                bmsVarO.h(jA);
            }
        } finally {
            bmvVar.o().c.i(f2, 0.0f);
        }
    }
}
