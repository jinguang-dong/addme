package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acg {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float[] e;

    public acg(int i, float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        float[] fArr = new float[101];
        this.e = fArr;
        float f5 = f3 - f;
        float f6 = f4 - f2;
        if (i == 3 || Math.abs(f5) < 0.001f || Math.abs(f6) < 0.001f) {
            Math.hypot(f6, f5);
            return;
        }
        float f7 = f3 - f;
        float f8 = f2 - f4;
        float[] fArr2 = ach.a;
        float f9 = f8;
        int i2 = 1;
        float fHypot = 0.0f;
        float f10 = 0.0f;
        while (true) {
            double radians = (float) Math.toRadians((i2 * 90.0d) / 90.0d);
            float fSin = ((float) Math.sin(radians)) * f7;
            float fCos = ((float) Math.cos(radians)) * f8;
            fHypot += (float) Math.hypot(fSin - f10, fCos - f9);
            fArr2[i2] = fHypot;
            if (i2 == 90) {
                break;
            }
            i2++;
            f9 = fCos;
            f10 = fSin;
        }
        int i3 = 1;
        while (true) {
            fArr2[i3] = fArr2[i3] / fHypot;
            if (i3 == 90) {
                break;
            } else {
                i3++;
            }
        }
        for (int i4 = 0; i4 < 101; i4++) {
            float f11 = i4 / 100.0f;
            int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f11);
            if (iBinarySearch >= 0) {
                fArr[i4] = iBinarySearch / 90.0f;
            } else if (iBinarySearch == -1) {
                fArr[i4] = 0.0f;
            } else {
                int i5 = -iBinarySearch;
                int i6 = i5 - 1;
                int i7 = i5 - 2;
                float f12 = fArr2[i7];
                fArr[i4] = (i7 + ((f11 - f12) / (fArr2[i6] - f12))) / 90.0f;
            }
        }
    }
}
