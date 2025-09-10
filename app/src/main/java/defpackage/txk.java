package defpackage;

import android.opengl.Matrix;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txk {
    public static final float[] a = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public final float[] b;

    private txk() {
        this.b = new float[16];
    }

    public static void b(txk txkVar, txk txkVar2, txk txkVar3) {
        float[] fArr = txkVar2.b;
        Matrix.multiplyMM(txkVar3.b, 0, txkVar.b, 0, fArr, 0);
    }

    public final txn a(txo txoVar) {
        txo txoVar2 = new txo();
        float[] fArr = this.b;
        float f = txoVar.a;
        float f2 = txoVar.b;
        float f3 = txoVar.c;
        float f4 = txoVar.d;
        float f5 = fArr[0] * f;
        float f6 = fArr[4] * f2;
        float f7 = f5 + f6 + (fArr[8] * f3) + (fArr[12] * f4);
        txoVar2.a = f7;
        float f8 = fArr[1] * f;
        float f9 = fArr[5] * f2;
        float f10 = f8 + f9 + (fArr[9] * f3) + (fArr[13] * f4);
        txoVar2.b = f10;
        float f11 = fArr[2] * f;
        float f12 = fArr[6] * f2;
        float f13 = f11 + f12 + (fArr[10] * f3) + (fArr[14] * f4);
        txoVar2.c = f13;
        float f14 = fArr[3] * f;
        float f15 = fArr[7] * f2;
        float f16 = f14 + f15 + (fArr[11] * f3) + (fArr[15] * f4);
        txoVar2.d = f16;
        return new txn(f7 / f16, f10 / f16, f13 / f16);
    }

    public final String toString() {
        float[] fArr = this.b;
        return "Matrix:\n[ " + fArr[0] + "\t" + fArr[4] + "\t" + fArr[8] + "\t" + fArr[12] + "\n  " + fArr[1] + "\t" + fArr[5] + "\t" + fArr[9] + "\t" + fArr[13] + "\n  " + fArr[2] + "\t" + fArr[6] + "\t" + fArr[10] + "\t" + fArr[14] + "\n  " + fArr[3] + "\t" + fArr[7] + "\t" + fArr[11] + "\t" + fArr[15] + " ]";
    }

    public txk(float[] fArr) {
        float[] fArr2 = new float[16];
        this.b = fArr2;
        System.arraycopy(fArr, 0, fArr2, 0, 16);
    }
}
