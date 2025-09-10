package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avu {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public avu(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof avu)) {
            return false;
        }
        long j = this.a;
        avu avuVar = (avu) obj;
        long j2 = avuVar.a;
        long j3 = bkv.a;
        return a.q(j, j2) && a.q(this.b, avuVar.b) && a.q(this.c, avuVar.c) && a.q(this.d, avuVar.d);
    }

    public final int hashCode() {
        long j = bkv.a;
        int iR = a.r(this.a) * 31;
        long j2 = this.d;
        return ((((iR + a.r(this.b)) * 31) + a.r(this.c)) * 31) + a.r(j2);
    }
}
