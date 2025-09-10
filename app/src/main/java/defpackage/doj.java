package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class doj {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;

    public doj(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.e = j;
        this.f = j2;
        this.a = j3;
        this.b = j4;
        this.g = j5;
        this.h = j6;
        this.c = j7;
        this.d = j8;
    }

    public final long a(boolean z) {
        return z ? this.e : this.g;
    }

    public final long b(boolean z) {
        return z ? this.f : this.h;
    }

    public final doj c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        long j9;
        long j10;
        long j11 = j != 16 ? j : this.e;
        long j12 = j2 != 16 ? j2 : this.f;
        long j13 = j3 != 16 ? j3 : this.a;
        long j14 = j4 != 16 ? j4 : this.b;
        long j15 = j5 != 16 ? j5 : this.g;
        long j16 = j6 != 16 ? j6 : this.h;
        if (j7 != 16) {
            j9 = 16;
            j10 = j7;
        } else {
            j9 = 16;
            j10 = this.c;
        }
        return new doj(j11, j12, j13, j14, j15, j16, j10, j8 != j9 ? j8 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof doj)) {
            return false;
        }
        long j = this.e;
        doj dojVar = (doj) obj;
        long j2 = dojVar.e;
        long j3 = bkv.a;
        return a.q(j, j2) && a.q(this.f, dojVar.f) && a.q(this.a, dojVar.a) && a.q(this.b, dojVar.b) && a.q(this.g, dojVar.g) && a.q(this.h, dojVar.h) && a.q(this.c, dojVar.c) && a.q(this.d, dojVar.d);
    }

    public final int hashCode() {
        long j = bkv.a;
        int iR = a.r(this.e) * 31;
        long j2 = this.d;
        long j3 = this.c;
        long j4 = this.h;
        long j5 = this.g;
        long j6 = this.b;
        return ((((((((((((iR + a.r(this.f)) * 31) + a.r(this.a)) * 31) + a.r(j6)) * 31) + a.r(j5)) * 31) + a.r(j4)) * 31) + a.r(j3)) * 31) + a.r(j2);
    }
}
