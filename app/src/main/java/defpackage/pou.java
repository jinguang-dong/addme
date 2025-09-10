package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pou {
    public final long a;
    public final long b;
    public final String c;
    public final pqa d;
    public final ppw e;

    public pou() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pou) {
            pou pouVar = (pou) obj;
            if (this.a == pouVar.a && this.b == pouVar.b && this.c.equals(pouVar.c) && this.d.equals(pouVar.d) && this.e.equals(pouVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        int iHashCode = ((((((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        return this.e.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        ppw ppwVar = this.e;
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + String.valueOf(this.d) + ", " + String.valueOf(ppwVar) + "}";
    }

    public pou(long j, long j2, String str, pqa pqaVar, ppw ppwVar) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = pqaVar;
        this.e = ppwVar;
    }
}
