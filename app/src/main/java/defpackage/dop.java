package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dop {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final double[][] d = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    private static final double[][] e = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    public static final int a(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (16.0f + f) / 116.0f;
        float f3 = f2 * f2 * f2;
        float f4 = f > 8.0f ? f3 : f / 903.2963f;
        boolean z = f3 > 0.008856452f;
        float f5 = z ? f3 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f3 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return cmg.b(f5 * fArr[0], f4 * fArr[1], f3 * fArr[2]);
    }

    public static final float b(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final int c(double d2) {
        if (d2 < 0.0d) {
            return -1;
        }
        return d2 != 0.0d ? 1 : 0;
    }

    public static final double d(double d2) {
        return (d2 > 8.0d ? Math.pow((d2 + 16.0d) / 116.0d, 3.0d) : d2 / 903.2962962962963d) * 100.0d;
    }

    public static final int e(double d2, double d3, double d4) {
        return g(h(d2), h(d3), h(d4));
    }

    public static final int f(double d2) {
        double d3 = (d2 + 16.0d) / 116.0d;
        double d4 = d3 * d3 * d3;
        double d5 = d2 > 8.0d ? d4 : d2 / 903.2962962962963d;
        boolean z = d4 > 0.008856451679035631d;
        double d6 = z ? d4 : d2 / 903.2962962962963d;
        if (!z) {
            d4 = d2 / 903.2962962962963d;
        }
        double d7 = d6 * r0[0];
        double d8 = d5 * r0[1];
        double d9 = c[2];
        double[][] dArr = e;
        double[] dArr2 = dArr[0];
        double d10 = dArr2[0] * d7;
        double d11 = dArr2[1] * d8;
        double d12 = d4 * d9;
        double d13 = dArr2[2] * d12;
        double[] dArr3 = dArr[1];
        double d14 = dArr3[0] * d7;
        double d15 = dArr3[1] * d8;
        double d16 = dArr3[2] * d12;
        double[] dArr4 = dArr[2];
        return g(h(d10 + d11 + d13), h(d14 + d15 + d16), h((dArr4[0] * d7) + (dArr4[1] * d8) + (dArr4[2] * d12)));
    }

    private static final int g(int i, int i2, int i3) {
        return (i << 16) | (-16777216) | (i2 << 8) | i3;
    }

    private static final int h(double d2) {
        double d3 = d2 / 100.0d;
        int iRound = (int) Math.round((d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (iRound < 0) {
            return 0;
        }
        if (iRound > 255) {
            return 255;
        }
        return iRound;
    }
}
