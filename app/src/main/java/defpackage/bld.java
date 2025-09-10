package defpackage;

import java.util.Arrays;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class bld {
    public final float[] a;

    public /* synthetic */ bld(float[] fArr) {
        this.a = fArr;
    }

    public static final long a(float[] fArr, long j) {
        int length = fArr.length;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1.0f / (((f3 * fIntBitsToFloat) + (f6 * fIntBitsToFloat2)) + f9);
        float f11 = (f * fIntBitsToFloat) + (f4 * fIntBitsToFloat2) + f7;
        float f12 = (f2 * fIntBitsToFloat) + (f5 * fIntBitsToFloat2) + f8;
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = 0.0f;
        }
        return (Float.floatToRawIntBits(f11 * f10) << 32) | (Float.floatToRawIntBits(f10 * f12) & 4294967295L);
    }

    public static final void b(float[] fArr, bke bkeVar) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float f10 = bkeVar.a;
        float f11 = f3 * f10;
        float f12 = bkeVar.b;
        float f13 = f6 * f12;
        float f14 = 1.0f / ((f11 + f13) + f9);
        float f15 = bkeVar.c;
        float f16 = bkeVar.d;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f14) & Integer.MAX_VALUE;
        float f17 = f * f10;
        float f18 = f4 * f12;
        float f19 = f17 + f18 + f7;
        float f20 = f10 * f2;
        float f21 = f12 * f5;
        float f22 = f20 + f21 + f8;
        float f23 = f6 * f16;
        float f24 = 1.0f / ((f11 + f23) + f9);
        int iFloatToRawIntBits2 = Float.floatToRawIntBits(f24) & Integer.MAX_VALUE;
        float f25 = f4 * f16;
        float f26 = f17 + f25 + f7;
        float f27 = f5 * f16;
        float f28 = f20 + f27 + f8;
        float f29 = f3 * f15;
        float f30 = 1.0f / ((f13 + f29) + f9);
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f30) & Integer.MAX_VALUE;
        float f31 = f * f15;
        float f32 = f31 + f18 + f7;
        float f33 = f15 * f2;
        float f34 = f21 + f33 + f8;
        float f35 = 1.0f / ((f29 + f23) + f9);
        int iFloatToRawIntBits4 = Float.floatToRawIntBits(f35) & Integer.MAX_VALUE;
        float f36 = f31 + f25 + f7;
        float f37 = f33 + f27 + f8;
        if (iFloatToRawIntBits2 >= 2139095040) {
            f24 = 0.0f;
        }
        float f38 = f24 * f26;
        if (iFloatToRawIntBits3 >= 2139095040) {
            f30 = 0.0f;
        }
        float f39 = f30 * f32;
        if (iFloatToRawIntBits4 >= 2139095040) {
            f35 = 0.0f;
        }
        float f40 = f35 * f36;
        float fMin = Math.min(f38, Math.min(f39, f40));
        if (iFloatToRawIntBits >= 2139095040) {
            f14 = 0.0f;
        }
        float f41 = f14 * f19;
        bkeVar.a = Math.min(f41, fMin);
        float f42 = f30 * f34;
        float f43 = f35 * f37;
        float f44 = f24 * f28;
        float f45 = f14 * f22;
        bkeVar.b = Math.min(f45, Math.min(f44, Math.min(f42, f43)));
        bkeVar.c = Math.max(f41, Math.max(f38, Math.max(f39, f40)));
        bkeVar.d = Math.max(f45, Math.max(f44, Math.max(f42, f43)));
    }

    public static final void c(float[] fArr) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static /* synthetic */ float[] d() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final void e(float[] fArr, float f, float f2) {
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
    }

    public static /* synthetic */ void f(float[] fArr, float f, float f2) {
        float f3 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * 0.0f) + fArr[12];
        float f4 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * 0.0f) + fArr[13];
        float f5 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * 0.0f) + fArr[14];
        float f6 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * 0.0f) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bld) && a.ao(this.a, ((bld) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |");
        float[] fArr = this.a;
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return ujp.l(sb.toString());
    }
}
