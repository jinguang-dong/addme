package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqt {
    public final long a;
    public final long b;

    public dqt(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dqt)) {
            return false;
        }
        long j = this.a;
        dqt dqtVar = (dqt) obj;
        long j2 = dqtVar.a;
        long j3 = bkv.a;
        return a.q(j, j2) && a.q(this.b, dqtVar.b);
    }

    public final int hashCode() {
        long j = bkv.a;
        return (a.r(this.a) * 31) + a.r(this.b);
    }
}
