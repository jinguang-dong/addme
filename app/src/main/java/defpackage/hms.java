package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hms {
    public final hlg b;
    private final float[] d;
    private final long[] e;
    private final int f;
    private final int g;
    private final int h;
    private final hmr i;
    private final hmq j;
    private final int l;
    private final hmt m;
    public final Object a = new Object();
    public int c = 0;
    private boolean k = false;

    public hms(hlg hlgVar, int i, int i2, int i3, int i4, hmr hmrVar, hmt hmtVar, hmq hmqVar) {
        this.b = hlgVar;
        this.m = hmtVar;
        this.j = hmqVar;
        this.f = i3;
        int i5 = i2 * i;
        this.d = new float[i5];
        this.e = new long[i];
        this.g = i;
        this.h = i5;
        this.l = i4;
        this.i = hmrVar;
    }

    private final boolean h() {
        if (!this.k) {
            return false;
        }
        this.k = false;
        return this.i.a(this);
    }

    private static final int i(int i) {
        return i >= 0 ? i : -(i + 1);
    }

    private static final int j(int i) {
        return i >= 0 ? i : -(i + 2);
    }

    public final float a(long j) {
        rnt.M(this.f == 1, "valueAt() only applicable to 1D features!");
        synchronized (this.a) {
            int i = this.c;
            if (i == 0) {
                return Float.NaN;
            }
            long[] jArr = this.e;
            int iBinarySearch = Arrays.binarySearch(jArr, 0, i, j);
            int i2 = this.l;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0 || i3 == 1) {
                int iMax = Math.max(0, j(iBinarySearch));
                int iMin = Math.min(this.c - 1, i(iBinarySearch));
                long j2 = jArr[iMax];
                long j3 = jArr[iMin];
                float[] fArr = this.d;
                if (j - j2 >= j3 - j) {
                    iMax = iMin;
                }
                return fArr[iMax];
            }
            if (i3 == 2) {
                return iBinarySearch >= 0 ? this.d[iBinarySearch] : Float.NaN;
            }
            if (i3 == 3) {
                if (iBinarySearch != -1) {
                    f = this.d[j(iBinarySearch)];
                }
                return f;
            }
            if (i3 != 4) {
                return Float.NaN;
            }
            int iMax2 = Math.max(0, j(iBinarySearch));
            if (iMax2 == Math.min(this.c - 1, i(iBinarySearch))) {
                return this.d[iMax2];
            }
            long j4 = jArr[iMax2];
            double d = (j - j4) / (jArr[r2] - j4);
            float[] fArr2 = this.d;
            return (float) (((1.0d - d) * fArr2[iMax2]) + (d * fArr2[r2]));
        }
    }

    public final long b() {
        long j;
        synchronized (this.a) {
            int i = this.c;
            j = i > 0 ? this.e[i - 1] : 0L;
        }
        return j;
    }

    public final hle c(long j) {
        synchronized (this.a) {
            int i = this.c;
            if (i == 0) {
                return hle.b(this.b, j);
            }
            long[] jArr = this.e;
            int iBinarySearch = Arrays.binarySearch(jArr, 0, i, j);
            int i2 = this.l;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                int iMax = Math.max(0, j(iBinarySearch));
                int iMin = Math.min(this.c - 1, i(iBinarySearch));
                return j - jArr[iMax] < jArr[iMin] - j ? hle.c(this.b, j, this.d, this.j.a(iMax), this.m.a) : hle.c(this.b, j, this.d, this.j.a(iMin), this.m.a);
            }
            if (i3 == 1) {
                int iMax2 = Math.max(0, j(iBinarySearch));
                int iMin2 = Math.min(this.c - 1, i(iBinarySearch));
                long j2 = jArr[iMax2];
                long j3 = jArr[iMin2];
                return j - j2 < j3 - j ? hle.c(this.b, j2, this.d, this.j.a(iMax2), this.m.a) : hle.c(this.b, j3, this.d, this.j.a(iMin2), this.m.a);
            }
            if (i3 == 2) {
                return iBinarySearch >= 0 ? hle.c(this.b, j, this.d, this.j.a(iBinarySearch), this.m.a) : hle.b(this.b, j);
            }
            if (i3 == 3) {
                if (iBinarySearch == -1) {
                    return hle.b(this.b, j);
                }
                return hle.c(this.b, j, this.d, this.j.a(j(iBinarySearch)), this.m.a);
            }
            if (i3 != 4) {
                return hle.b(this.b, j);
            }
            rnt.L(true);
            int iMax3 = Math.max(0, j(iBinarySearch));
            int iMin3 = Math.min(this.c - 1, i(iBinarySearch));
            if (iMax3 == iMin3) {
                return hle.c(this.b, j, this.d, this.j.a(iMax3), this.m.a);
            }
            long j4 = jArr[iMax3];
            double d = (j - j4) / (jArr[iMin3] - j4);
            hlg hlgVar = this.b;
            float[] fArr = this.d;
            hmq hmqVar = this.j;
            int iA = hmqVar.a(iMax3);
            int iA2 = hmqVar.a(iMin3);
            int i4 = this.m.a;
            float[] fArr2 = new float[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                fArr2[i5] = (float) (((1.0d - d) * fArr[iA + i5]) + (fArr[iA2 + i5] * d));
            }
            return new hle(hlgVar, j, fArr2);
        }
    }

    public final hle d() {
        hle hleVarB;
        synchronized (this.a) {
            int i = this.c;
            if (i > 0) {
                int i2 = i - 1;
                hleVarB = hle.c(this.b, this.e[i2], this.d, this.j.a(i2), this.m.a);
            } else {
                hleVarB = hle.b(this.b, 0L);
            }
        }
        return hleVarB;
    }

    public final void e(long j, float f) {
        int iB;
        synchronized (this.a) {
            int i = this.c;
            if (i >= this.g || (iB = this.j.b(i)) >= this.h) {
                if (h()) {
                    e(j, f);
                }
                return;
            }
            this.d[iB] = f;
            this.e[i] = j;
            this.m.a(1);
            this.c++;
            this.k = true;
        }
    }

    public final void f(long j, float... fArr) {
        synchronized (this.a) {
            int i = this.c;
            if (i >= this.g) {
                if (h()) {
                    f(j, fArr);
                }
                return;
            }
            hmq hmqVar = this.j;
            int length = fArr.length;
            int iB = hmqVar.b(i);
            if (iB + length <= this.h) {
                System.arraycopy(fArr, 0, this.d, iB, this.m.a(length));
                long[] jArr = this.e;
                int i2 = this.c;
                jArr[i2] = j;
                this.c = i2 + 1;
                this.k = true;
            }
        }
    }

    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = this.c == 0;
        }
        return z;
    }
}
