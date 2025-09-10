package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mer {
    public final String a;
    public final int b;
    public final long c;

    public mer() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mer) {
            mer merVar = (mer) obj;
            if (this.a.equals(merVar.a) && this.b == merVar.b && this.c == merVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.c;
        return ((this.b ^ (iHashCode * 1000003)) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + "}";
    }

    public mer(String str, int i, long j) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = j;
    }
}
