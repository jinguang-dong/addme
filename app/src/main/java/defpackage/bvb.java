package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bvb {
    public int a;
    public Object b;

    public bvb() {
        this.b = new long[2];
    }

    private final void i(int i, int i2) {
        int[] iArr = (int[]) this.b;
        amo.m(iArr, i, i2);
        amo.m(iArr, i + 1, i2 + 1);
        amo.m(iArr, i + 2, i2 + 2);
    }

    private final int[] j(int[] iArr) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length);
        iArrCopyOf.getClass();
        this.b = iArrCopyOf;
        return iArrCopyOf;
    }

    public final int a(int i) {
        return ((int[]) this.b)[i];
    }

    public final int b() {
        Object obj = this.b;
        int i = this.a - 1;
        this.a = i;
        return ((int[]) obj)[i];
    }

    public final void c(int i, int i2, int i3) {
        int i4 = this.a;
        int i5 = i4 + 3;
        Object objJ = this.b;
        int[] iArr = (int[]) objJ;
        if (i5 >= iArr.length) {
            objJ = j(iArr);
        }
        int[] iArr2 = (int[]) objJ;
        iArr2[i4] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.a = i5;
    }

    public final void d(int i, int i2, int i3, int i4) {
        int i5 = this.a;
        int i6 = i5 + 4;
        Object objJ = this.b;
        int[] iArr = (int[]) objJ;
        if (i6 >= iArr.length) {
            objJ = j(iArr);
        }
        int[] iArr2 = (int[]) objJ;
        iArr2[i5] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.a = i6;
    }

    public final void e(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = (int[]) this.b;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    i(i3, i4);
                }
            }
            i(i3 + 3, i2);
            e(i, i3);
            e(i3 + 6, i2);
        }
    }

    public final boolean f(long j) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.b)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public final void g(long j) {
        if (f(j)) {
            return;
        }
        int i = this.a;
        Object objCopyOf = this.b;
        long[] jArr = (long[]) objCopyOf;
        int length = jArr.length;
        if (i >= length) {
            objCopyOf = Arrays.copyOf(jArr, Math.max(i + 1, length + length));
            objCopyOf.getClass();
            this.b = objCopyOf;
        }
        ((long[]) objCopyOf)[i] = j;
        if (i >= this.a) {
            this.a = i + 1;
        }
    }

    public final void h(long j) {
        int i = this.a;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.b)[i2]) {
                int i3 = this.a - 1;
                while (i2 < i3) {
                    int i4 = i2 + 1;
                    long[] jArr = (long[]) this.b;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.a--;
                return;
            }
            i2++;
        }
    }

    public bvb(int i) {
        this.b = new int[i];
    }
}
