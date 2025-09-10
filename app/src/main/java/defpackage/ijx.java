package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijx implements ijq {
    private final float[] a;
    private imb b;
    private int d;
    private float[] e;
    private final ija f;
    private final ijr g;
    private final luj i;
    private final float[] c = new float[3];
    private mus h = mus.OFF;

    public ijx(ijr ijrVar, ija ijaVar, luj lujVar) {
        float[] fArr = {1.0f, 1.0f, 1.0f, 1.0f};
        this.a = fArr;
        this.f = ijaVar;
        this.g = ijrVar;
        this.i = lujVar;
        imb imbVar = new imb();
        this.b = imbVar;
        System.arraycopy(fArr, 0, imbVar.a, 0, 4);
    }

    @Override // defpackage.ijq
    public final void a() {
        imb imbVar = this.b;
        if (imbVar != null) {
            imbVar.a();
            this.b = null;
        }
    }

    @Override // defpackage.ijq
    public final void b() {
        mus musVarA = mus.a(((Integer) this.i.b(luf.d)).intValue());
        int i = 0;
        if (this.h != musVarA) {
            this.h = musVarA;
            int iOrdinal = musVarA.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    this.d = 2;
                    float[] fArr = this.c;
                    fArr[0] = 0.33333334f;
                    fArr[1] = 0.6666667f;
                } else if (iOrdinal == 2) {
                    this.d = 3;
                    float[] fArr2 = this.c;
                    fArr2[0] = 0.25f;
                    fArr2[1] = 0.5f;
                    fArr2[2] = 0.75f;
                } else if (iOrdinal == 3) {
                    this.d = 2;
                    float[] fArr3 = this.c;
                    fArr3[0] = 0.38196602f;
                    fArr3[1] = 0.618034f;
                }
                this.e = new float[this.d * 8];
            } else {
                this.d = 0;
            }
        }
        if (this.b == null || this.d == 0 || !this.f.b()) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        ijr ijrVar = this.g;
        if (ijrVar.h) {
            int i2 = 0;
            while (i < this.d) {
                float f = ijrVar.d;
                float f2 = f / 2.0f;
                float[] fArr4 = this.c;
                float f3 = fArr4[i] * f;
                float[] fArr5 = this.e;
                float f4 = f2 - f3;
                fArr5[i2] = f4;
                fArr5[i2 + 1] = 1.0f;
                fArr5[i2 + 2] = f4;
                fArr5[i2 + 3] = -1.0f;
                float f5 = fArr4[i];
                fArr5[i2 + 4] = (-f) / 2.0f;
                float f6 = (f5 + f5) - 1.0f;
                fArr5[i2 + 5] = f6;
                int i3 = i2 + 7;
                fArr5[i2 + 6] = f2;
                i2 += 8;
                fArr5[i3] = f6;
                i++;
            }
        } else {
            float f7 = ijrVar.a;
            float f8 = -f7;
            float f9 = f7 - f8;
            int i4 = 0;
            while (i < this.d) {
                float[] fArr6 = this.c;
                float f10 = (fArr6[i] * f9) + f8;
                float[] fArr7 = this.e;
                fArr7[i4] = f10;
                float f11 = ijrVar.e;
                float f12 = f11 / 2.0f;
                fArr7[i4 + 1] = f12;
                fArr7[i4 + 2] = f10;
                fArr7[i4 + 3] = (-f11) / 2.0f;
                float f13 = f11 * fArr6[i];
                fArr7[i4 + 4] = f8;
                float f14 = f12 - f13;
                fArr7[i4 + 5] = f14;
                int i5 = i4 + 7;
                fArr7[i4 + 6] = f7;
                i4 += 8;
                fArr7[i5] = f14;
                i++;
            }
        }
        imb imbVar = this.b;
        imbVar.getClass();
        imbVar.c(this.e, 1.0f);
        imb imbVar2 = this.b;
        imbVar2.getClass();
        imbVar2.b();
    }

    @Override // defpackage.ijq
    public final void c(int i, int i2) {
        imb imbVar = this.b;
        if (imbVar != null) {
            imbVar.d(i, i2);
        }
    }
}
