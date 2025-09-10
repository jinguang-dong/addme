package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aci implements ack {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;

    public aci(float f, float f2, float f3, float f4) {
        int iB;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            acv.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + '.');
        }
        float[] fArr = new float[5];
        float f5 = (1.0f - f4) * 3.0f;
        float f6 = (f4 - f2) * 3.0f;
        double d = f6;
        float f7 = (f2 + 0.0f) * 3.0f;
        double d2 = f7;
        double d3 = d + d;
        double d4 = f5;
        double d5 = (d2 - d3) + d4;
        if (d5 == 0.0d) {
            iB = d == d4 ? 0 : bko.b((float) ((d3 - d4) / (d3 - (d4 + d4))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d * d) - (d4 * d2));
            double d7 = (-d2) + d;
            int iB2 = bko.b((float) ((-(d6 + d7)) / d5), fArr, 0);
            iB = bko.b((float) ((d6 - d7) / d5), fArr, iB2) + iB2;
            if (iB > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    iB = 1;
                }
            }
        }
        float f10 = f5 - f6;
        float f11 = f6 - f7;
        float f12 = f11 + f11;
        int iB3 = iB + bko.b((-f12) / ((f10 + f10) - f12), fArr, iB);
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i = 0; i < iB3; i++) {
            float f13 = fArr[i];
            float f14 = ((((((((f2 - f4) * 3.0f) + 1.0f + 0.0f) * f13) + (((f4 - (f2 + f2)) + 0.0f) * 3.0f)) * f13) + f7) * f13) + 0.0f;
            fMin = Math.min(fMin, f14);
            fMax = Math.max(fMax, f14);
        }
        long jT = a.t(fMin, fMax);
        this.e = Float.intBitsToFloat((int) (jT >> 32));
        this.f = Float.intBitsToFloat((int) (jT & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x022f A[PHI: r3
      0x022f: PHI (r3v19 float) = (r3v6 float), (r3v12 float), (r3v17 float), (r3v34 float), (r3v39 float) binds: [B:125:0x022b, B:114:0x01fa, B:89:0x01ad, B:45:0x00da, B:22:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    @Override // defpackage.ack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r27) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aci.a(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aci)) {
            return false;
        }
        aci aciVar = (aci) obj;
        return this.a == aciVar.a && this.b == aciVar.b && this.c == aciVar.c && this.d == aciVar.d;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ')';
    }
}
