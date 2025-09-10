package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lku {
    public final long a;
    public final boolean b;

    public lku() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lku) {
            lku lkuVar = (lku) obj;
            if (this.a == lkuVar.a && this.b == lkuVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.b ? 1237 : 1231;
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + "}";
    }

    public lku(long j, boolean z) {
        this.a = j;
        this.b = z;
    }
}
