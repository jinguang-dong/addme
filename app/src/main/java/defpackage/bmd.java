package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmd extends bme {
    private final bmn a;
    private final bmn b;
    private final float[] c;

    public bmd(bmn bmnVar, bmn bmnVar2) {
        float[] fArrT;
        super(bmnVar2, bmnVar, bmnVar2, null);
        this.a = bmnVar;
        this.b = bmnVar2;
        if (byi.Q(bmnVar.d, bmnVar2.d)) {
            fArrT = byi.T(bmnVar2.j, bmnVar.i);
        } else {
            float[] fArrT2 = bmnVar.i;
            float[] fArr = bmnVar2.j;
            float[] fArrA = bmnVar.d.a();
            float[] fArrA2 = bmnVar2.d.a();
            bmp bmpVar = bmnVar.d;
            bmp bmpVar2 = bmh.a;
            bmp bmpVar3 = bmh.b;
            fArrT2 = byi.Q(bmpVar, bmpVar3) ? fArrT2 : byi.T(byi.R(blx.b.c, fArrA, bmh.a()), bmnVar.i);
            fArrT = byi.T(byi.Q(bmnVar2.d, bmpVar3) ? fArr : byi.S(byi.T(byi.R(blx.b.c, fArrA2, bmh.a()), bmnVar2.i)), a.p(0, 3) ? byi.U(new float[]{fArrA[0] / fArrA2[0], fArrA[1] / fArrA2[1], fArrA[2] / fArrA2[2]}, fArrT2) : fArrT2);
        }
        this.c = fArrT;
    }

    @Override // defpackage.bme
    public final long a(long j) {
        double d = bkv.d(j);
        float fC = bkv.c(j);
        float fB = bkv.b(j);
        bmg bmgVar = this.a.p;
        float fA = (float) bmgVar.a(d);
        float fA2 = (float) bmgVar.a(fC);
        float fA3 = (float) bmgVar.a(fB);
        float[] fArr = this.c;
        float f = fArr[0] * fA;
        float f2 = fArr[3] * fA2;
        float f3 = fArr[6] * fA3;
        float f4 = fArr[1] * fA;
        float f5 = fArr[4] * fA2;
        float f6 = fArr[7] * fA3;
        float f7 = fArr[2] * fA;
        float f8 = fArr[5] * fA2;
        float f9 = fArr[8] * fA3;
        bmn bmnVar = this.b;
        bmg bmgVar2 = bmnVar.m;
        return bko.k((float) bmgVar2.a(f + f2 + f3), (float) bmgVar2.a(f4 + f5 + f6), (float) bmgVar2.a(f7 + f8 + f9), bkv.a(j), bmnVar);
    }
}
