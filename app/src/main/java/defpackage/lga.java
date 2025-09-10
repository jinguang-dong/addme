package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lga {
    public final long a;
    public final obu b;
    private final String c;
    private final String d;

    public lga() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lga) {
            lga lgaVar = (lga) obj;
            if (this.b.equals(lgaVar.b) && this.c.equals(lgaVar.c) && this.d.equals(lgaVar.d) && this.a == lgaVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "{" + this.b.toString() + ", " + this.c + ", " + this.d + ", " + this.a + "}";
    }

    public lga(obu obuVar, String str, String str2, long j) {
        this.b = obuVar;
        str.getClass();
        this.c = str;
        str2.getClass();
        this.d = str2;
        this.a = j;
    }
}
