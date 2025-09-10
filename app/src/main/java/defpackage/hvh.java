package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvh {
    public final qin a;
    public final int b;
    public final float[] c;
    public final float[] d;
    private final short[] e;

    public hvh(qin qinVar, int i) {
        rnt.L(qinVar != null && i > 0);
        this.a = qinVar;
        this.b = i;
        short[] sArr = new short[i * 6];
        for (int i2 = 0; i2 < i + i; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                sArr[(i2 * 3) + i3] = (short) (i2 + i3);
            }
        }
        this.e = sArr;
        int i4 = i + 1;
        this.d = c(-1.0f, 1.0f, -1.0f, i4, 4);
        this.c = c(0.0f, 0.0f, 1.0f, i4, 2);
    }

    private static float[] c(float f, float f2, float f3, int i, int i2) {
        float[] fArr = new float[(i + i) * i2];
        float f4 = f2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            float f5 = f;
            int i5 = 0;
            while (true) {
                if (i5 < 2) {
                    fArr[i3] = f5;
                    fArr[i3 + 1] = f4;
                    f5 += 1.0f - f;
                    if (i2 > 2) {
                        for (int i6 = 2; i6 < i2 - 1; i6 = 3) {
                            fArr[i3 + 2] = 0.0f;
                        }
                        fArr[(i3 + i2) - 1] = 1.0f;
                    }
                    i3 += i2;
                    i5++;
                }
            }
            f4 += (f3 - f2) / (i - 1);
        }
        return fArr;
    }

    public final qju a() {
        return qju.b(this.a, this.e);
    }

    public final qkr b(List list) {
        rnt.L(list.size() == this.b);
        float[] fArr = this.d;
        float[] fArr2 = new float[fArr.length];
        int size = list.size();
        int i = 0;
        while (i <= size) {
            qib qibVar = i > 0 ? (qib) list.get(i - 1) : (qib) list.get(0);
            int i2 = i * 8;
            for (int i3 = 0; i3 < 2; i3++) {
                int i4 = (i3 * 4) + i2;
                float f = fArr[i4];
                float[] fArr3 = qibVar.c;
                int i5 = i4 + 1;
                int i6 = i4 + 3;
                fArr2[i4] = (f * fArr3[0]) + (fArr[i5] * fArr3[1]) + (fArr[i6] * fArr3[2]);
                fArr2[i5] = (fArr[i4] * fArr3[3]) + (fArr[i5] * fArr3[4]) + (fArr[i6] * fArr3[5]);
                fArr2[i4 + 2] = 0.0f;
                fArr2[i6] = (fArr[i4] * fArr3[6]) + (fArr[i5] * fArr3[7]) + (fArr[i6] * fArr3[8]);
            }
            i++;
        }
        return qkr.e(this.a, qkt.c(fArr2), qkt.b(this.c));
    }
}
