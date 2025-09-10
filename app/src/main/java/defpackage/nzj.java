package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzj {
    public final String a;
    public final long b;

    public nzj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nzj) {
            nzj nzjVar = (nzj) obj;
            if (this.a.equals(nzjVar.a) && this.b == nzjVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + "}";
    }

    public nzj(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }
}
