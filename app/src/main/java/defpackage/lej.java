package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lej {
    public final boolean a;
    public final long b;

    public lej() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lej) {
            lej lejVar = (lej) obj;
            if (this.a == lejVar.a && this.b == lejVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + "}";
    }

    public lej(boolean z, long j) {
        this.a = z;
        this.b = j;
    }
}
