package defpackage;

import androidx.work.OverwritingInputMerger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebx {
    public static final String a = dwj.a("WorkSpec");
    public final String b;
    public String c;
    public String d;
    public dvx e;
    public dvx f;
    public long g;
    public long h;
    public long i;
    public dvv j;
    public int k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public int q;
    public final int r;
    public long s;
    public int t;
    public final int u;
    public String v;
    public Boolean w;
    public int x;
    public int y;
    public int z;

    public ebx(String str, int i, String str2, String str3, dvx dvxVar, dvx dvxVar2, long j, long j2, long j3, dvv dvvVar, int i2, int i3, long j4, long j5, long j6, long j7, boolean z, int i4, int i5, int i6, long j8, int i7, int i8, String str4, Boolean bool) {
        str.getClass();
        if (i != 0) {
            str2.getClass();
            str3.getClass();
            dvxVar.getClass();
            dvxVar2.getClass();
            dvvVar.getClass();
            if (i3 != 0 && i4 != 0) {
                this.b = str;
                this.x = i;
                this.c = str2;
                this.d = str3;
                this.e = dvxVar;
                this.f = dvxVar2;
                this.g = j;
                this.h = j2;
                this.i = j3;
                this.j = dvvVar;
                this.k = i2;
                this.y = i3;
                this.l = j4;
                this.m = j5;
                this.n = j6;
                this.o = j7;
                this.p = z;
                this.z = i4;
                this.q = i5;
                this.r = i6;
                this.s = j8;
                this.t = i7;
                this.u = i8;
                this.v = str4;
                this.w = bool;
                return;
            }
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ebx e(ebx ebxVar, String str, int i, String str2, dvx dvxVar, int i2, long j, int i3, int i4, long j2, int i5, int i6) throws Throwable {
        String str3;
        Throwable th;
        long j3;
        String str4 = (i6 & 1) != 0 ? ebxVar.b : str;
        int i7 = (i6 & 2) != 0 ? ebxVar.x : i;
        String str5 = (i6 & 4) != 0 ? ebxVar.c : str2;
        String str6 = (i6 & 8) != 0 ? ebxVar.d : null;
        dvx dvxVar2 = (i6 & 16) != 0 ? ebxVar.e : dvxVar;
        dvx dvxVar3 = (i6 & 32) != 0 ? ebxVar.f : null;
        long j4 = (i6 & 64) != 0 ? ebxVar.g : 0L;
        long j5 = (i6 & 128) != 0 ? ebxVar.h : 0L;
        if ((i6 & 256) != 0) {
            str3 = str4;
            th = null;
            j3 = ebxVar.i;
        } else {
            str3 = str4;
            th = null;
            j3 = 0;
        }
        dvv dvvVar = (i6 & 512) != 0 ? ebxVar.j : th;
        int i8 = (i6 & 1024) != 0 ? ebxVar.k : i2;
        int i9 = (i6 & 2048) != 0 ? ebxVar.y : 0;
        long j6 = (i6 & 4096) != 0 ? ebxVar.l : 0L;
        long j7 = (i6 & 8192) != 0 ? ebxVar.m : j;
        long j8 = (i6 & 16384) != 0 ? ebxVar.n : 0L;
        long j9 = (32768 & i6) != 0 ? ebxVar.o : 0L;
        boolean z = (65536 & i6) != 0 ? ebxVar.p : false;
        int i10 = (131072 & i6) != 0 ? ebxVar.z : 0;
        int i11 = (262144 & i6) != 0 ? ebxVar.q : i3;
        int i12 = (524288 & i6) != 0 ? ebxVar.r : i4;
        long j10 = (1048576 & i6) != 0 ? ebxVar.s : j2;
        int i13 = (i6 & 2097152) != 0 ? ebxVar.t : i5;
        int i14 = ebxVar.u;
        String str7 = ebxVar.v;
        Boolean bool = ebxVar.w;
        str3.getClass();
        if (i7 == 0) {
            throw th;
        }
        str5.getClass();
        str6.getClass();
        dvxVar2.getClass();
        dvxVar3.getClass();
        dvvVar.getClass();
        if (i9 == 0 || i10 == 0) {
            throw th;
        }
        return new ebx(str3, i7, str5, str6, dvxVar2, dvxVar3, j4, j5, j3, dvvVar, i8, i9, j6, j7, j8, j9, z, i10, i11, i12, j10, i13, i14, str7, bool);
    }

    public final long a() {
        long j;
        boolean zC = c();
        int i = this.k;
        int i2 = this.y;
        long j2 = this.l;
        long j3 = this.m;
        int i3 = this.q;
        boolean zD = d();
        long j4 = this.g;
        long j5 = this.i;
        long j6 = this.h;
        long j7 = this.s;
        if (i2 == 0) {
            throw null;
        }
        if (j7 != Long.MAX_VALUE && zD) {
            return i3 == 0 ? j7 : ukc.q(j7, j3 + 900000);
        }
        if (zC) {
            return j3 + ukc.r(i2 == 2 ? j2 * i : (long) Math.scalb(j2, i - 1), 18000000L);
        }
        if (!zD) {
            if (j3 == -1) {
                return Long.MAX_VALUE;
            }
            return j3 + j4;
        }
        if (i3 == 0) {
            j = j3 + j4;
            i3 = 0;
        } else {
            j = j3 + j6;
        }
        return (j5 == j6 || i3 != 0) ? j : j + (j6 - j5);
    }

    public final boolean b() {
        return !a.ao(dvv.a, this.j);
    }

    public final boolean c() {
        return this.x == 1 && this.k > 0;
    }

    public final boolean d() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebx)) {
            return false;
        }
        ebx ebxVar = (ebx) obj;
        return a.ao(this.b, ebxVar.b) && this.x == ebxVar.x && a.ao(this.c, ebxVar.c) && a.ao(this.d, ebxVar.d) && a.ao(this.e, ebxVar.e) && a.ao(this.f, ebxVar.f) && this.g == ebxVar.g && this.h == ebxVar.h && this.i == ebxVar.i && a.ao(this.j, ebxVar.j) && this.k == ebxVar.k && this.y == ebxVar.y && this.l == ebxVar.l && this.m == ebxVar.m && this.n == ebxVar.n && this.o == ebxVar.o && this.p == ebxVar.p && this.z == ebxVar.z && this.q == ebxVar.q && this.r == ebxVar.r && this.s == ebxVar.s && this.t == ebxVar.t && this.u == ebxVar.u && a.ao(this.v, ebxVar.v) && a.ao(this.w, ebxVar.w);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        int i = this.x;
        a.aQ(i);
        int iHashCode2 = ((((((((iHashCode + i) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        int iR = a.r(this.g);
        int iR2 = (((((((((iHashCode2 * 31) + iR) * 31) + a.r(this.h)) * 31) + a.r(this.i)) * 31) + this.j.hashCode()) * 31) + this.k;
        int i2 = this.y;
        a.aQ(i2);
        int iR3 = a.r(this.l);
        int iR4 = a.r(this.m);
        int iR5 = a.r(this.n);
        int iR6 = a.r(this.o);
        int iO = a.o(this.p);
        int i3 = this.z;
        a.aQ(i3);
        int iR7 = (((((((((((((((((((((iR2 * 31) + i2) * 31) + iR3) * 31) + iR4) * 31) + iR5) * 31) + iR6) * 31) + iO) * 31) + i3) * 31) + this.q) * 31) + this.r) * 31) + a.r(this.s)) * 31) + this.t;
        String str = this.v;
        int iHashCode3 = ((((iR7 * 31) + this.u) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.w;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "{WorkSpec: " + this.b + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ebx(String str, int i, String str2, String str3, dvx dvxVar, dvx dvxVar2, long j, long j2, long j3, dvv dvvVar, int i2, int i3, long j4, long j5, long j6, long j7, boolean z, int i4, int i5, long j8, int i6, int i7, String str4, Boolean bool, int i8) {
        String str5;
        if ((i8 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            name.getClass();
            str5 = name;
        } else {
            str5 = str3;
        }
        this(str, (i8 & 2) != 0 ? 1 : i, str2, str5, (i8 & 16) != 0 ? dvx.a : dvxVar, (i8 & 32) != 0 ? dvx.a : dvxVar2, (i8 & 64) != 0 ? 0L : j, (i8 & 128) != 0 ? 0L : j2, (i8 & 256) != 0 ? 0L : j3, (i8 & 512) != 0 ? dvv.a : dvvVar, (i8 & 1024) != 0 ? 0 : i2, (i8 & 2048) != 0 ? 1 : i3, (i8 & 4096) != 0 ? 30000L : j4, (i8 & 8192) != 0 ? -1L : j5, (i8 & 16384) == 0 ? j6 : 0L, (32768 & i8) != 0 ? -1L : j7, ((65536 & i8) == 0) & z, (131072 & i8) != 0 ? 1 : i4, (262144 & i8) != 0 ? 0 : i5, 0, (1048576 & i8) != 0 ? Long.MAX_VALUE : j8, (2097152 & i8) != 0 ? 0 : i6, (4194304 & i8) != 0 ? -256 : i7, (8388608 & i8) != 0 ? null : str4, (16777216 & i8) != 0 ? false : bool);
    }
}
