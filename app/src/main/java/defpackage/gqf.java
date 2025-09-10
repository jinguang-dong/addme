package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqf {
    public final sbp a;
    private final long b;

    public gqf() {
        throw null;
    }

    static gqe a() {
        gqe gqeVar = new gqe();
        int i = sbp.d;
        gqeVar.b(sex.a);
        return gqeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gqf) {
            gqf gqfVar = (gqf) obj;
            if (this.b == gqfVar.b && ujp.aH(this.a, gqfVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return this.a.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.b + ", " + String.valueOf(this.a) + "}";
    }

    public gqf(long j, sbp sbpVar) {
        this.b = j;
        this.a = sbpVar;
    }
}
