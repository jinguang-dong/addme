package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class puw {
    public final String a;
    public final long b;
    public final String c;
    public final rwc d;
    public final sbp e;
    public final sbv f;
    public final rwc g;

    public puw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof puw) {
            puw puwVar = (puw) obj;
            if (this.a.equals(puwVar.a) && this.b == puwVar.b && this.c.equals(puwVar.c) && this.d.equals(puwVar.d) && ujp.aH(this.e, puwVar.e) && ujp.aA(this.f, puwVar.f) && this.g.equals(puwVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        int iHashCode2 = (((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
        return this.g.hashCode() ^ (iHashCode2 * 1000003);
    }

    public final String toString() {
        rwc rwcVar = this.g;
        sbv sbvVar = this.f;
        sbp sbpVar = this.e;
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + String.valueOf(this.d) + ", " + String.valueOf(sbpVar) + ", " + String.valueOf(sbvVar) + ", " + String.valueOf(rwcVar) + "}";
    }

    public puw(String str, long j, String str2, rwc rwcVar, sbp sbpVar, sbv sbvVar, rwc rwcVar2) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = rwcVar;
        this.e = sbpVar;
        this.f = sbvVar;
        this.g = rwcVar2;
    }
}
