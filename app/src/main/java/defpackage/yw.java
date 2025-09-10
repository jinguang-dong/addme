package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yw {
    public long[] a;
    public int b;

    public yw() {
        this((byte[]) null);
    }

    public final void a(int i) {
        long[] jArr = this.a;
        int length = jArr.length;
        if (length < i) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i, (length * 3) / 2));
            jArrCopyOf.getClass();
            this.a = jArrCopyOf;
        }
    }

    public final void b(long j) {
        a(this.b + 1);
        long[] jArr = this.a;
        int i = this.b;
        jArr[i] = j;
        this.b = i + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yw) {
            yw ywVar = (yw) obj;
            int i = ywVar.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = ywVar.a;
                ukv ukvVarU = ukc.u(0, i2);
                int i3 = ukvVarU.a;
                int i4 = ukvVarU.b;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
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

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int iR = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iR += a.r(jArr[i2]) * 31;
        }
        return iR;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }

    public yw(int i) {
        this.a = i == 0 ? za.a : new long[i];
    }

    public /* synthetic */ yw(byte[] bArr) {
        this(16);
    }
}
