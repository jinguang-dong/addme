package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqn {
    private final boolean a;
    private final int b;
    private final bqm[] c;
    private int d;
    private final float[] e;
    private final float[] f;
    private final float[] g;
    private final int h;

    public bqn() {
        this(0, 3);
    }

    public final float a() {
        float[] fArr;
        float[] fArr2;
        float f;
        int i;
        float fSqrt;
        bqm[] bqmVarArr = this.c;
        int i2 = this.d;
        bqm bqmVar = bqmVarArr[i2];
        if (bqmVar == null) {
            return 0.0f;
        }
        bqm bqmVar2 = bqmVar;
        int i3 = 0;
        while (true) {
            fArr = this.f;
            fArr2 = this.e;
            bqm bqmVar3 = bqmVarArr[i2];
            if (bqmVar3 == null) {
                f = 0.0f;
                i = 0;
                break;
            }
            long j = bqmVar.a;
            long j2 = bqmVar3.a;
            long j3 = j - j2;
            f = 0.0f;
            i = 0;
            float fAbs = Math.abs(j2 - bqmVar2.a);
            bqmVar2 = (this.h == 1 || this.a) ? bqmVar3 : bqmVar;
            float f2 = j3;
            if (f2 > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr2[i3] = bqmVar3.b;
            fArr[i3] = -f2;
            if (i2 == 0) {
                i2 = 20;
            }
            i2--;
            i3++;
            if (i3 >= 20) {
                break;
            }
        }
        if (i3 < this.b) {
            return f;
        }
        int i4 = this.h;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        if (i5 == 0) {
            try {
                float[] fArr3 = this.g;
                int i6 = i3 <= 2 ? 1 : 2;
                int i7 = i6 + 1;
                float[][] fArr4 = new float[i7][];
                for (int i8 = i; i8 < i7; i8++) {
                    fArr4[i8] = new float[i3];
                }
                for (int i9 = i; i9 < i3; i9++) {
                    fArr4[i][i9] = 1.0f;
                    for (int i10 = 1; i10 < i7; i10++) {
                        fArr4[i10][i9] = fArr4[i10 - 1][i9] * fArr[i9];
                    }
                }
                float[][] fArr5 = new float[i7][];
                for (int i11 = i; i11 < i7; i11++) {
                    fArr5[i11] = new float[i3];
                }
                float[][] fArr6 = new float[i7][];
                for (int i12 = i; i12 < i7; i12++) {
                    fArr6[i12] = new float[i7];
                }
                int i13 = i;
                while (i13 < i7) {
                    float[] fArr7 = fArr5[i13];
                    rnt.av(fArr4[i13], fArr7, i3);
                    for (int i14 = i; i14 < i13; i14++) {
                        float[] fArr8 = fArr5[i14];
                        float fS = akg.s(fArr7, fArr8);
                        for (int i15 = i; i15 < i3; i15++) {
                            fArr7[i15] = fArr7[i15] - (fArr8[i15] * fS);
                        }
                    }
                    float fSqrt2 = (float) Math.sqrt(akg.s(fArr7, fArr7));
                    if (fSqrt2 < 1.0E-6f) {
                        fSqrt2 = 1.0E-6f;
                    }
                    float f3 = 1.0f / fSqrt2;
                    for (int i16 = i; i16 < i3; i16++) {
                        fArr7[i16] = fArr7[i16] * f3;
                    }
                    float[] fArr9 = fArr6[i13];
                    int i17 = i;
                    while (i17 < i7) {
                        fArr9[i17] = i17 < i13 ? f : akg.s(fArr7, fArr4[i17]);
                        i17++;
                    }
                    i13++;
                }
                for (int i18 = i6; i18 >= 0; i18--) {
                    float fS2 = akg.s(fArr5[i18], fArr2);
                    float[] fArr10 = fArr6[i18];
                    int i19 = i18 + 1;
                    if (i19 <= i6) {
                        int i20 = i6;
                        while (true) {
                            fS2 -= fArr10[i20] * fArr3[i20];
                            if (i20 != i19) {
                                i20--;
                            }
                        }
                    }
                    fArr3[i18] = fS2 / fArr10[i18];
                }
                fSqrt = fArr3[1];
            } catch (IllegalArgumentException unused) {
                fSqrt = f;
            }
        } else {
            if (i5 != 1) {
                throw new uet();
            }
            boolean z = this.a;
            int i21 = i3 - 1;
            float f4 = fArr[i21];
            int i22 = i21;
            float fSqrt3 = f;
            while (i22 > 0) {
                int i23 = i22 - 1;
                float f5 = fArr[i23];
                if (f4 != f5) {
                    float f6 = z ? -fArr2[i23] : fArr2[i22] - fArr2[i23];
                    float fSignum = Math.signum(fSqrt3);
                    float fAbs2 = Math.abs(fSqrt3);
                    float f7 = f6 / (f4 - f5);
                    fSqrt3 += (f7 - (fSignum * ((float) Math.sqrt(fAbs2 + fAbs2)))) * Math.abs(f7);
                    if (i22 == i21) {
                        fSqrt3 *= 0.5f;
                    }
                }
                i22 = i23;
                f4 = f5;
            }
            float fSignum2 = Math.signum(fSqrt3);
            float fAbs3 = Math.abs(fSqrt3);
            fSqrt = fSignum2 * ((float) Math.sqrt(fAbs3 + fAbs3));
        }
        return fSqrt * 1000.0f;
    }

    public final float b(float f) {
        if (f <= 0.0f) {
            bqs.c("maximumVelocity should be a positive value. You specified=" + f);
        }
        float fA = a();
        if (fA == 0.0f || Float.isNaN(fA)) {
            return 0.0f;
        }
        return fA > 0.0f ? ukc.l(fA, f) : ukc.k(fA, -f);
    }

    public final void c(long j, float f) {
        int i = (this.d + 1) % 20;
        this.d = i;
        bqm[] bqmVarArr = this.c;
        bqm bqmVar = bqmVarArr[i];
        if (bqmVar == null) {
            bqmVarArr[i] = new bqm(j, f);
        } else {
            bqmVar.a = j;
            bqmVar.b = f;
        }
    }

    public final void d() {
        bqm[] bqmVarArr = this.c;
        rnt.af(bqmVarArr, null, 0, bqmVarArr.length);
        this.d = 0;
    }

    public bqn(byte[] bArr) {
        this(true, 2);
    }

    public bqn(boolean z, int i) {
        int i2;
        this.a = z;
        this.h = i;
        if (z) {
            if (i == 0) {
                throw null;
            }
            if (i == 1) {
                throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
            }
        }
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i3 == 0) {
            i2 = 3;
        } else {
            if (i3 != 1) {
                throw new uet();
            }
            i2 = 2;
        }
        this.b = i2;
        this.c = new bqm[20];
        this.e = new float[20];
        this.f = new float[20];
        this.g = new float[3];
    }

    public /* synthetic */ bqn(int i, int i2) {
        this(false, i | (((i2 & 2) != 0 ? 0 : 1) ^ 1));
    }
}
