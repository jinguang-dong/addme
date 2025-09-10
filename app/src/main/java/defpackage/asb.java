package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asb {
    public final long a;
    public final long b;
    private final long c;
    private final long d;

    public asb(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        asb asbVar = (asb) obj;
        long j = this.a;
        long j2 = asbVar.a;
        long j3 = bkv.a;
        return a.q(j, j2) && a.q(this.b, asbVar.b) && a.q(this.c, asbVar.c) && a.q(this.d, asbVar.d);
    }

    public final int hashCode() {
        long j = bkv.a;
        int iR = a.r(this.a) * 31;
        long j2 = this.d;
        return ((((iR + a.r(this.b)) * 31) + a.r(this.c)) * 31) + a.r(j2);
    }
}
