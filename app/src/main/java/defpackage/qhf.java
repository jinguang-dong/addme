package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qhf {
    private final int a;
    private final int[] b;
    private final int[] c = new int[2];
    private final qhi d;
    private final boolean e;

    public qhf(qhi qhiVar, int i, int[] iArr) {
        this.a = i;
        this.b = iArr;
        this.d = qhiVar;
        boolean z = false;
        if ((i & 7) == 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= 2) {
                    z = true;
                    break;
                } else if (iArr[i2] % 8 != 0) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.e = z;
        Arrays.fill(this.c, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhf)) {
            return false;
        }
        qhf qhfVar = (qhf) obj;
        return this.a == qhfVar.a && this.e == qhfVar.e && Arrays.equals(this.b, qhfVar.b) && Arrays.equals(this.c, qhfVar.c) && Objects.equals(this.d, qhfVar.d);
    }

    public final int hashCode() {
        return (((((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + (this.e ? 1 : 0);
    }

    public final String toString() {
        return "Channel[Norm8]";
    }
}
