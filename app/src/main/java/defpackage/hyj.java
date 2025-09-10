package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hyj {
    public final String a;
    public final tcg b;
    public final int c;
    public final pnx d;

    public hyj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hyj) {
            hyj hyjVar = (hyj) obj;
            if (this.a.equals(hyjVar.a) && this.b.equals(hyjVar.b) && this.c == hyjVar.c && this.d.equals(hyjVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        pnx pnxVar = this.d;
        return ((this.c ^ (iHashCode * 1000003)) * 1000003) ^ pnxVar.hashCode();
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b.d + ", " + this.c + ", " + this.d.toString() + "}";
    }

    public hyj(String str, tcg tcgVar, int i, pnx pnxVar) {
        this.a = str;
        this.b = tcgVar;
        this.c = i;
        pnxVar.getClass();
        this.d = pnxVar;
    }
}
