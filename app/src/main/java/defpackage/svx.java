package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class svx implements Serializable {
    private static final svx b = new svx(new int[0]);
    public final int a;
    private final int[] c;

    public svx(int[] iArr) {
        int length = iArr.length;
        this.c = iArr;
        this.a = length;
    }

    public final int a(int i) {
        rnt.S(i, this.a);
        return this.c[i];
    }

    public final boolean b() {
        return this.a == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof svx)) {
            return false;
        }
        svx svxVar = (svx) obj;
        int i = this.a;
        if (i != svxVar.a) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (a(i2) != svxVar.a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.a; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    Object readResolve() {
        return b() ? b : this;
    }

    public final String toString() {
        if (b()) {
            return "[]";
        }
        int i = this.a;
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.c;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    Object writeReplace() {
        int[] iArr = this.c;
        int i = this.a;
        return i < iArr.length ? new svx(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}
