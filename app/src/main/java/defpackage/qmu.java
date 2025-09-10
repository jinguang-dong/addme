package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qmu implements Iterable {
    public final int[] a;

    private qmu(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            this.a = new int[0];
            return;
        }
        Arrays.sort(iArr);
        int i = iArr[0] + 1;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            i3 += i == i4 ? 0 : 1;
            i2++;
            i = i4;
        }
        int[] iArr2 = new int[i3];
        this.a = iArr2;
        int i5 = iArr[0] + 1;
        int i6 = 0;
        for (int i7 : iArr) {
            if (i5 != i7) {
                iArr2[i6] = i7;
                i6++;
                i5 = i7;
            }
        }
    }

    public static qmu a(int... iArr) {
        return new qmu(Arrays.copyOf(iArr, iArr.length));
    }

    public final boolean b(int i) {
        return Arrays.binarySearch(this.a, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qmu) {
            return Arrays.equals(this.a, ((qmu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new qmt(this);
    }

    public final String toString() {
        return "IntSet[" + this.a.length + "]";
    }
}
