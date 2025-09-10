package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dpd {
    public static final dpd a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f = 0.69000006f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float[][] fArr = dop.a;
        float[] fArr2 = dop.c;
        double d = dop.d(50.0d) * 63.66197723675813d;
        float[][] fArr3 = dop.a;
        float f = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f2 = fArr4[0] * f;
        float f3 = fArr2[1];
        float f4 = fArr4[1] * f3;
        float f5 = fArr2[2];
        float f6 = fArr4[2] * f5;
        float[] fArr5 = fArr3[1];
        float f7 = fArr5[0] * f;
        float f8 = fArr5[1] * f3;
        float f9 = fArr5[2] * f5;
        float[] fArr6 = fArr3[2];
        float f10 = f * fArr6[0];
        float f11 = f3 * fArr6[1];
        float f12 = f5 * fArr6[2];
        float f13 = (float) (d / 100.0d);
        float fExp = 1.0f - (((float) Math.exp(((-f13) - 42.0f) / 92.0f)) * 0.2777778f);
        double d2 = fExp;
        if (d2 > 1.0d) {
            fExp = 1.0f;
        } else if (d2 < 0.0d) {
            fExp = 0.0f;
        }
        float f14 = f7 + f8 + f9;
        float f15 = f2 + f4 + f6;
        float[] fArr7 = {(((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f14) * fExp) + 1.0f) - fExp, (((100.0f / ((f10 + f11) + f12)) * fExp) + 1.0f) - fExp};
        float f16 = 1.0f / ((5.0f * f13) + 1.0f);
        float f17 = f16 * f16 * f16 * f16;
        float f18 = 1.0f - f17;
        float f19 = f17 * f13;
        float fCbrt = (float) Math.cbrt(f13 * 5.0d);
        float fD = ((float) dop.d(50.0d)) / fArr2[1];
        double d3 = fD;
        float fSqrt = (float) Math.sqrt(d3);
        float fPow = (float) Math.pow(d3, 0.20000000298023224d);
        float f20 = f19 + (0.1f * f18 * f18 * fCbrt);
        float fPow2 = (float) Math.pow(((fArr7[0] * f20) * f15) / 100.0f, 0.41999998688697815d);
        float fPow3 = (float) Math.pow(((fArr7[1] * f20) * f14) / 100.0f, 0.41999998688697815d);
        float fPow4 = (float) Math.pow(((fArr7[2] * f20) * r7) / 100.0f, 0.41999998688697815d);
        float[] fArr8 = {fPow2, fPow3, fPow4};
        float f21 = fArr8[0];
        float f22 = fArr8[1];
        float f23 = (400.0f * fPow4) / (fPow4 + 27.13f);
        float[] fArr9 = {(f21 * 400.0f) / (f21 + 27.13f), (f22 * 400.0f) / (f22 + 27.13f), f23};
        float f24 = fArr9[0];
        float f25 = 0.725f / fPow;
        a = new dpd(fD, (f24 + f24 + fArr9[1] + (f23 * 0.05f)) * f25, f25, f25, fArr7, f20, (float) Math.pow(f20, 0.25d), fSqrt + 1.48f);
    }

    public dpd(float f, float f2, float f3, float f4, float[] fArr, float f5, float f6, float f7) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.g = fArr;
        this.h = f5;
        this.i = f6;
        this.j = f7;
    }
}
