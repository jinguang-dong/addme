package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lte {
    public final ltd a;
    public final long b;
    public final String c;
    public final ltf d;
    public final long e;
    public final boolean f;
    private final sbv g;

    public lte() {
        throw null;
    }

    public static lte a(ltd ltdVar, long j, String str, ltf ltfVar, boolean z) {
        return new lte(ltdVar, j, str, ltfVar, Process.myPid(), z, sfc.a);
    }

    public static lte b(ltd ltdVar, long j, String str, ltf ltfVar, sbv sbvVar) {
        return new lte(ltdVar, j, str, ltfVar, Process.myPid(), false, sbvVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lte) {
            lte lteVar = (lte) obj;
            ltd ltdVar = this.a;
            if (ltdVar != null ? ltdVar.equals(lteVar.a) : lteVar.a == null) {
                if (this.b == lteVar.b && this.c.equals(lteVar.c) && this.d.equals(lteVar.d) && this.e == lteVar.e && this.f == lteVar.f && this.g.equals(lteVar.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ltd ltdVar = this.a;
        int iHashCode = ltdVar == null ? 0 : ltdVar.hashCode();
        long j = this.b;
        int iHashCode2 = ((((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        long j2 = this.e;
        return this.g.hashCode() ^ (((((iHashCode2 * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        sbv sbvVar = this.g;
        ltf ltfVar = this.d;
        return "{" + String.valueOf(this.a) + ", " + this.b + ", " + this.c + ", " + ltfVar.toString() + ", " + this.e + ", " + this.f + ", " + sbvVar.toString() + "}";
    }

    public lte(ltd ltdVar, long j, String str, ltf ltfVar, long j2, boolean z, sbv sbvVar) {
        this.a = ltdVar;
        this.b = j;
        str.getClass();
        this.c = str;
        ltfVar.getClass();
        this.d = ltfVar;
        this.e = j2;
        this.f = z;
        sbvVar.getClass();
        this.g = sbvVar;
    }
}
