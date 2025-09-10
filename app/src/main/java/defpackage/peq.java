package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class peq {
    public final pet a;
    public final rwc b;
    public final rwc c;
    public final pas d;
    public final int e;
    public final int f;
    public final rwc g;
    public final rwc h;
    public final int i;
    public final rwc j;
    public final boolean k;
    public final int l;
    public final boolean m;
    public final long n;
    public final sbp o;
    public final boolean p;
    public final peg q;
    public final long r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;

    public peq() {
        throw null;
    }

    public static pep a() {
        pep pepVar = new pep(null);
        pepVar.i(0);
        pepVar.c(-1);
        pepVar.f(false);
        pepVar.h(false);
        pepVar.e(-1L);
        pepVar.g(true);
        pepVar.m(-1);
        int i = sbp.d;
        pepVar.o(sex.a);
        pepVar.t(-1L);
        pepVar.c = 1;
        pepVar.d(-1);
        pepVar.k(0);
        pepVar.j(rvk.a);
        pepVar.l(peg.a);
        pepVar.q(-1);
        pepVar.b = (short) (pepVar.b | 2048);
        return pepVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof peq) {
            peq peqVar = (peq) obj;
            if (this.a.equals(peqVar.a) && this.b.equals(peqVar.b) && this.c.equals(peqVar.c) && this.d.equals(peqVar.d) && this.e == peqVar.e && this.f == peqVar.f && this.g.equals(peqVar.g) && this.h.equals(peqVar.h) && this.i == peqVar.i && this.j.equals(peqVar.j) && this.k == peqVar.k && this.l == peqVar.l && this.m == peqVar.m && this.n == peqVar.n && ujp.aH(this.o, peqVar.o) && this.p == peqVar.p && this.q.equals(peqVar.q) && this.r == peqVar.r) {
                int i = this.v;
                int i2 = peqVar.v;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.s == peqVar.s && this.t == peqVar.t) {
                    int i3 = peqVar.u;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i) * 1000003) ^ this.j.hashCode()) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ this.l) * 1000003;
        int i = true != this.m ? 1237 : 1231;
        long j = this.n;
        int iHashCode2 = ((((((((iHashCode ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.o.hashCode()) * 1000003) ^ (true == this.p ? 1231 : 1237)) * 1000003) ^ this.q.hashCode();
        int i2 = this.v;
        a.aF(i2);
        long j2 = this.r;
        return (this.t ^ (((((((iHashCode2 * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ i2) * 1000003) ^ this.s) * 1000003)) * 1000003;
    }

    public final String toString() {
        int i = this.v;
        peg pegVar = this.q;
        sbp sbpVar = this.o;
        rwc rwcVar = this.j;
        rwc rwcVar2 = this.h;
        rwc rwcVar3 = this.g;
        pas pasVar = this.d;
        rwc rwcVar4 = this.c;
        rwc rwcVar5 = this.b;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(rwcVar5);
        String strValueOf3 = String.valueOf(rwcVar4);
        String strValueOf4 = String.valueOf(pasVar);
        String strValueOf5 = String.valueOf(rwcVar3);
        String strValueOf6 = String.valueOf(rwcVar2);
        String strValueOf7 = String.valueOf(rwcVar);
        String strValueOf8 = String.valueOf(sbpVar);
        String strValueOf9 = String.valueOf(pegVar);
        String str = i != 1 ? i != 2 ? "null" : "VIDEO_RECORD" : "DEFAULT";
        long j = this.r;
        boolean z = this.p;
        long j2 = this.n;
        String str2 = str;
        boolean z2 = this.m;
        int i2 = this.l;
        boolean z3 = this.k;
        int i3 = this.i;
        int i4 = this.f;
        return "{" + strValueOf + ", " + strValueOf2 + ", " + strValueOf3 + ", " + strValueOf4 + ", " + this.e + ", " + i4 + ", " + strValueOf5 + ", " + strValueOf6 + ", " + i3 + ", " + strValueOf7 + ", " + z3 + ", " + i2 + ", " + z2 + ", " + j2 + ", " + strValueOf8 + ", " + z + ", " + strValueOf9 + ", " + j + ", " + str2 + ", " + this.s + ", " + this.t + ", 0}";
    }

    public peq(pet petVar, rwc rwcVar, rwc rwcVar2, pas pasVar, int i, int i2, rwc rwcVar3, rwc rwcVar4, int i3, rwc rwcVar5, boolean z, int i4, boolean z2, long j, sbp sbpVar, boolean z3, peg pegVar, long j2, int i5, int i6, int i7) {
        this.a = petVar;
        this.b = rwcVar;
        this.c = rwcVar2;
        this.d = pasVar;
        this.e = i;
        this.f = i2;
        this.g = rwcVar3;
        this.h = rwcVar4;
        this.i = i3;
        this.j = rwcVar5;
        this.k = z;
        this.l = i4;
        this.m = z2;
        this.n = j;
        this.o = sbpVar;
        this.p = z3;
        this.q = pegVar;
        this.r = j2;
        this.v = i5;
        this.s = i6;
        this.t = i7;
        this.u = 0;
    }
}
