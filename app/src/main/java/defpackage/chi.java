package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chi {
    public static final chi a = new chi(chp.C(0), chp.C(0));
    public final long b;
    public final long c;

    public chi(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chi)) {
            return false;
        }
        long j = this.b;
        chi chiVar = (chi) obj;
        long j2 = chiVar.b;
        long j3 = cid.a;
        return a.q(j, j2) && a.q(this.c, chiVar.c);
    }

    public final int hashCode() {
        long j = cid.a;
        return (a.r(this.b) * 31) + a.r(this.c);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) cid.c(this.b)) + ", restLine=" + ((Object) cid.c(this.c)) + ')';
    }
}
