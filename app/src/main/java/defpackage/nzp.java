package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzp {
    public final long a;

    public nzp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof nzp) && this.a == ((nzp) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "{" + this.a + "}";
    }

    public nzp(long j) {
        this.a = j;
    }
}
