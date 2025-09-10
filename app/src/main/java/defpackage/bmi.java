package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmi extends blz {
    public bmi() {
        super("Generic L*a*b*", 12884901890L, 15);
    }

    @Override // defpackage.blz
    public final float a(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // defpackage.blz
    public final float b(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    @Override // defpackage.blz
    public final float c(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        float f4 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
        float f5 = f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f);
        bmp bmpVar = bmh.a;
        return f5 * bmh.e[2];
    }

    @Override // defpackage.blz
    public final long d(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f2 < -128.0f) {
            f2 = -128.0f;
        }
        if (f2 > 128.0f) {
            f2 = 128.0f;
        }
        float f4 = (f + 16.0f) / 116.0f;
        float f5 = (f2 * 0.002f) + f4;
        float f6 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
        float f7 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
        bmp bmpVar = bmh.a;
        float[] fArr = bmh.e;
        return (Float.floatToRawIntBits(f6 * fArr[0]) << 32) | (4294967295L & Float.floatToRawIntBits(f7 * fArr[1]));
    }

    @Override // defpackage.blz
    public final long e(float f, float f2, float f3, float f4, blz blzVar) {
        bmp bmpVar = bmh.a;
        float[] fArr = bmh.e;
        float f5 = f / fArr[0];
        float f6 = f2 / fArr[1];
        float f7 = f3 / fArr[2];
        float fCbrt = f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f6 > 0.008856452f ? (float) Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
        float fCbrt3 = f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f;
        float f8 = 116.0f * fCbrt2;
        float f9 = fCbrt - fCbrt2;
        float f10 = fCbrt2 - fCbrt3;
        float f11 = f8 - 16.0f;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > 100.0f) {
            f11 = 100.0f;
        }
        float f12 = f9 * 500.0f;
        if (f12 < -128.0f) {
            f12 = -128.0f;
        }
        if (f12 > 128.0f) {
            f12 = 128.0f;
        }
        float f13 = f10 * 200.0f;
        float f14 = f13 >= -128.0f ? f13 : -128.0f;
        return bko.k(f11, f12, f14 <= 128.0f ? f14 : 128.0f, f4, blzVar);
    }
}
