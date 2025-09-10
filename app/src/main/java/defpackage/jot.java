package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jot implements paq {
    public final long a;
    public final szh b;
    public final szh c;

    public jot() {
        throw null;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.b.cancel(true);
        this.c.cancel(true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jot) {
            jot jotVar = (jot) obj;
            if (this.a == jotVar.a && this.b.equals(jotVar.b) && this.c.equals(jotVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        szh szhVar = this.c;
        return "{" + this.a + ", " + this.b.toString() + ", " + szhVar.toString() + "}";
    }

    public jot(long j, szh szhVar, szh szhVar2) {
        this.a = j;
        this.b = szhVar;
        this.c = szhVar2;
    }
}
