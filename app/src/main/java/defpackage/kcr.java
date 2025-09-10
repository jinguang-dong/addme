package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcr {
    public final iby a;
    public final long b;
    public final long c;

    public kcr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kcr) {
            kcr kcrVar = (kcr) obj;
            if (this.a.equals(kcrVar.a) && this.b == kcrVar.b && this.c == kcrVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.c;
        long j2 = j ^ (j >>> 32);
        long j3 = this.b;
        return ((((int) ((j3 >>> 32) ^ j3)) ^ (iHashCode * 1000003)) * 1000003) ^ ((int) j2);
    }

    public final String toString() {
        return "{" + this.a.toString() + ", " + this.b + ", " + this.c + "}";
    }

    public kcr(iby ibyVar, long j, long j2) {
        this.a = ibyVar;
        this.b = j;
        this.c = j2;
    }
}
