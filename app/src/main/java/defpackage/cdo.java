package defpackage;

import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdo {
    public static final cdo a = new cdo(0, null, null, null, 16777215);
    public final cdh b;
    public final cdb c;
    public final cdg d;

    public cdo(cdh cdhVar, cdb cdbVar, cdg cdgVar) {
        this.b = cdhVar;
        this.c = cdbVar;
        this.d = cdgVar;
    }

    public static /* synthetic */ cdo w(cdo cdoVar, long j, cfp cfpVar, cfd cfdVar, String str, long j2, long j3, cdg cdgVar, chb chbVar, chj chjVar, int i) {
        long jB = (i & 1) != 0 ? cdoVar.b.b() : 0L;
        long j4 = (i & 2) != 0 ? cdoVar.b.b : j;
        cfp cfpVar2 = (i & 4) != 0 ? cdoVar.b.c : cfpVar;
        cfj cfjVar = (i & 8) != 0 ? cdoVar.b.d : null;
        cfk cfkVar = (i & 16) != 0 ? cdoVar.b.e : null;
        cfd cfdVar2 = (i & 32) != 0 ? cdoVar.b.f : cfdVar;
        String str2 = (i & 64) != 0 ? cdoVar.b.g : str;
        long j5 = (i & 128) != 0 ? cdoVar.b.h : j2;
        cgv cgvVar = (i & 256) != 0 ? cdoVar.b.i : null;
        chh chhVar = (i & 512) != 0 ? cdoVar.b.j : null;
        cgk cgkVar = (i & 1024) != 0 ? cdoVar.b.k : null;
        long j6 = (i & 2048) != 0 ? cdoVar.b.l : 0L;
        chd chdVar = (i & 4096) != 0 ? cdoVar.b.m : null;
        blo bloVar = (i & 8192) != 0 ? cdoVar.b.n : null;
        byi byiVar = (i & 16384) != 0 ? cdoVar.b.p : null;
        int i2 = (32768 & i) != 0 ? cdoVar.c.a : 0;
        int i3 = (65536 & i) != 0 ? cdoVar.c.b : 0;
        long j7 = (131072 & i) != 0 ? cdoVar.c.c : j3;
        chi chiVar = (262144 & i) != 0 ? cdoVar.c.d : null;
        cdg cdgVar2 = (524288 & i) != 0 ? cdoVar.d : cdgVar;
        chb chbVar2 = (1048576 & i) != 0 ? cdoVar.c.f : chbVar;
        int i4 = (2097152 & i) != 0 ? cdoVar.c.g : 0;
        int i5 = (4194304 & i) != 0 ? cdoVar.c.h : 0;
        chj chjVar2 = (i & 8388608) != 0 ? cdoVar.c.i : chjVar;
        cdg cdgVar3 = cdgVar2;
        cdh cdhVar = cdoVar.b;
        chi chiVar2 = chiVar;
        long jB2 = cdhVar.b();
        long j8 = bkv.a;
        return new cdo(new cdh(a.q(jB, jB2) ? cdhVar.a : chp.o(jB), j4, cfpVar2, cfjVar, cfkVar, cfdVar2, str2, j5, cgvVar, chhVar, cgkVar, j6, chdVar, bloVar, byiVar), new cdb(i2, i3, j7, chiVar2, cdgVar3 != null ? cdgVar3.b : null, chbVar2, i4, i5, chjVar2), cdgVar3);
    }

    public static /* synthetic */ cdo x(cdo cdoVar, long j, long j2, cfp cfpVar, cfd cfdVar, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 1) != 0 ? bkv.f : j;
        long j6 = (i2 & 2) != 0 ? cid.a : j2;
        cfp cfpVar2 = (i2 & 4) != 0 ? null : cfpVar;
        cfd cfdVar2 = (i2 & 32) != 0 ? null : cfdVar;
        long j7 = (i2 & 128) != 0 ? cid.a : j3;
        long j8 = (i2 & 2048) != 0 ? bkv.f : 0L;
        int i3 = (32768 & i2) != 0 ? Integer.MIN_VALUE : i;
        int i4 = (65536 & i2) == 0 ? 0 : Integer.MIN_VALUE;
        long j9 = (i2 & 131072) != 0 ? cid.a : j4;
        cdh cdhVar = cdoVar.b;
        cdh cdhVarA = cdi.a(cdhVar, j5, j6, cfpVar2, null, null, cfdVar2, null, j7, null, null, null, j8, null, null, null);
        cdb cdbVar = cdoVar.c;
        cdb cdbVarA = cdc.a(cdbVar, i3, i4, j9, null, null, null, 0, Integer.MIN_VALUE, null);
        return (cdhVar == cdhVarA && cdbVar == cdbVarA) ? cdoVar : new cdo(cdhVarA, cdbVarA);
    }

    public final float a() {
        return this.b.a();
    }

    public final int b() {
        return this.c.g;
    }

    public final int c() {
        return this.c.a;
    }

    public final int d() {
        return this.c.b;
    }

    public final long e() {
        return this.b.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdo)) {
            return false;
        }
        cdo cdoVar = (cdo) obj;
        return a.ao(this.b, cdoVar.b) && a.ao(this.c, cdoVar.c) && a.ao(this.d, cdoVar.d);
    }

    public final long f() {
        return this.b.b();
    }

    public final long g() {
        return this.b.b;
    }

    public final long h() {
        return this.b.h;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        cdg cdgVar = this.d;
        return (iHashCode * 31) + (cdgVar != null ? cdgVar.hashCode() : 0);
    }

    public final long i() {
        return this.c.c;
    }

    public final blo j() {
        return this.b.n;
    }

    public final cdo k(cdo cdoVar) {
        if (cdoVar == null || a.ao(cdoVar, a)) {
            return this;
        }
        return new cdo(this.b.c(cdoVar.b), this.c.a(cdoVar.c));
    }

    public final cfd l() {
        return this.b.f;
    }

    public final cfj m() {
        return this.b.d;
    }

    public final cfk n() {
        return this.b.e;
    }

    public final cfp o() {
        return this.b.c;
    }

    public final cgk p() {
        return this.b.k;
    }

    public final chb q() {
        return this.c.f;
    }

    public final chd r() {
        return this.b.m;
    }

    public final chi s() {
        return this.c.d;
    }

    public final chj t() {
        return this.c.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) bkv.g(f()));
        sb.append(", brush=null, alpha=");
        y();
        sb.append(a());
        sb.append(", fontSize=");
        sb.append((Object) cid.c(g()));
        sb.append(", fontWeight=");
        sb.append(o());
        sb.append(", fontStyle=");
        sb.append(m());
        sb.append(", fontSynthesis=");
        sb.append(n());
        sb.append(", fontFamily=");
        sb.append(l());
        sb.append(", fontFeatureSettings=");
        cdh cdhVar = this.b;
        sb.append(cdhVar.g);
        sb.append(", letterSpacing=");
        sb.append((Object) cid.c(h()));
        sb.append(", baselineShift=");
        sb.append(cdhVar.i);
        sb.append(", textGeometricTransform=");
        sb.append(cdhVar.j);
        sb.append(", localeList=");
        sb.append(p());
        sb.append(", background=");
        sb.append((Object) bkv.g(e()));
        sb.append(", textDecoration=");
        sb.append(r());
        sb.append(", shadow=");
        sb.append(j());
        sb.append(", drawStyle=");
        sb.append(z());
        sb.append(", textAlign=");
        sb.append((Object) chc.a(c()));
        sb.append(", textDirection=");
        sb.append((Object) che.a(d()));
        sb.append(", lineHeight=");
        sb.append((Object) cid.c(i()));
        sb.append(", textIndent=");
        sb.append(s());
        sb.append(", platformStyle=");
        sb.append(this.d);
        sb.append(", lineHeightStyle=");
        sb.append(q());
        sb.append(", lineBreak=");
        sb.append((Object) cgz.a(b()));
        sb.append(", hyphens=");
        sb.append((Object) cgy.a(this.c.h));
        sb.append(", textMotion=");
        sb.append(t());
        sb.append(')');
        return sb.toString();
    }

    public final boolean u(cdo cdoVar) {
        return this == cdoVar || this.b.e(cdoVar.b);
    }

    public final boolean v(cdo cdoVar) {
        if (this != cdoVar) {
            return a.ao(this.c, cdoVar.c) && this.b.d(cdoVar.b);
        }
        return true;
    }

    public final void y() {
        this.b.f();
    }

    public final byi z() {
        return this.b.p;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ cdo(long j, cfd cfdVar, byi byiVar, cdg cdgVar, int i) {
        long j2 = (i & 1) != 0 ? bkv.f : 0L;
        long j3 = (i & 2) != 0 ? cid.a : j;
        cfd cfdVar2 = (i & 32) != 0 ? null : cfdVar;
        long j4 = (i & 128) != 0 ? cid.a : 0L;
        long j5 = (i & 2048) != 0 ? bkv.f : 0L;
        byi byiVar2 = (i & 16384) != 0 ? null : byiVar;
        int i2 = (32768 & i) != 0 ? Integer.MIN_VALUE : 0;
        int i3 = (65536 & i) != 0 ? Integer.MIN_VALUE : 0;
        long j6 = (131072 & i) != 0 ? cid.a : 0L;
        cdg cdgVar2 = (i & ImageMetadata.LENS_APERTURE) != 0 ? null : cdgVar;
        this(new cdh(j2, j3, null, null, null, cfdVar2, j4, null, j5, byiVar2), new cdb(i2, i3, j6, null, cdgVar2 != null ? cdgVar2.b : null, null, 0, Integer.MIN_VALUE, null), cdgVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public cdo(cdh cdhVar, cdb cdbVar) {
        cde cdeVar = cdbVar.e;
        this(cdhVar, cdbVar, cdeVar == null ? null : new cdg(cdeVar));
    }
}
