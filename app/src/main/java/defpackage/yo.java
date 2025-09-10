package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yo {
    public int[] a;
    public int b;

    public yo() {
        this((byte[]) null);
    }

    public final int a(int i) {
        if (i < 0 || i >= this.b) {
            a.bn("Index must be between 0 and size");
        }
        return this.a[i];
    }

    public final int b() {
        if (this.b == 0) {
            a.bo("IntList is empty.");
        }
        return this.a[this.b - 1];
    }

    public final int c(int i) {
        if (i < 0 || i >= this.b) {
            a.bn("Index must be between 0 and size");
        }
        int[] iArr = this.a;
        int i2 = iArr[i];
        int i3 = this.b;
        if (i != i3 - 1) {
            rnt.aw(iArr, iArr, i, i + 1, i3);
        }
        this.b--;
        return i2;
    }

    public final void d() {
        this.b = 0;
    }

    public final void e(int i) {
        int[] iArr = this.a;
        int length = iArr.length;
        if (length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i, (length * 3) / 2));
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yo) {
            yo yoVar = (yo) obj;
            int i = yoVar.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = yoVar.a;
                ukv ukvVarU = ukc.u(0, i2);
                int i3 = ukvVarU.a;
                int i4 = ukvVarU.b;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i) {
        e(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void g(int i, int i2) {
        if (i < 0 || i >= this.b) {
            a.bn("Index must be between 0 and size");
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3] * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }

    public yo(int i) {
        this.a = i == 0 ? yt.a : new int[i];
    }

    public /* synthetic */ yo(byte[] bArr) {
        this(16);
    }
}
