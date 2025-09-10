package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qib {
    public static final qib a = c(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
    public static final qib b = c(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
    public final float[] c;

    public qib(float f, float f2) {
        a.I(true);
        this.c = new float[]{1.0f, 0.0f, f, 0.0f, 1.0f, f2, 0.0f, 0.0f, 1.0f};
    }

    public static qib c(float[] fArr) {
        return new qib(Arrays.copyOf(fArr, fArr.length));
    }

    public static qib d() {
        return c(a.Y());
    }

    public final float a() {
        return this.c[2];
    }

    public final float b() {
        return this.c[5];
    }

    public final qib e(qib qibVar) {
        float[] fArrF = qibVar.f();
        float[] fArr = new float[9];
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    int i4 = i * 3;
                    int i5 = i4 + i2;
                    fArr[i5] = fArr[i5] + (this.c[(i3 * 3) + i2] * fArrF[i4 + i3]);
                }
            }
        }
        return c(fArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qib) {
            return Arrays.equals(this.c, ((qib) obj).c);
        }
        return false;
    }

    public final float[] f() {
        float[] fArr = this.c;
        return Arrays.copyOf(fArr, fArr.length);
    }

    public final float[] g(float[] fArr) {
        float[] fArr2 = this.c;
        float f = fArr2[6];
        float f2 = fArr[0];
        float f3 = fArr2[7];
        float f4 = fArr[1];
        float f5 = (f * f2) + (f3 * f4) + fArr2[8];
        return new float[]{(((fArr2[0] * f2) + (fArr2[1] * f4)) + fArr2[2]) / f5, (((fArr2[3] * f2) + (fArr2[4] * f4)) + fArr2[5]) / f5};
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c);
    }

    public final String toString() {
        float[] fArr = this.c;
        return "[" + fArr[0] + ", " + fArr[1] + ", " + fArr[2] + "; " + fArr[3] + ", " + fArr[4] + ", " + fArr[5] + "; " + fArr[6] + ", " + fArr[7] + ", " + fArr[8] + "]";
    }

    private qib(float[] fArr) {
        a.I(fArr.length == 9);
        this.c = fArr;
    }
}
