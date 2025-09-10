package defpackage;

import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdh implements cci {
    public final chg a;
    public final long b;
    public final cfp c;
    public final cfj d;
    public final cfk e;
    public final cfd f;
    public final String g;
    public final long h;
    public final cgv i;
    public final chh j;
    public final cgk k;
    public final long l;
    public final chd m;
    public final blo n;
    public final cdf o;
    public final byi p;

    public cdh(chg chgVar, long j, cfp cfpVar, cfj cfjVar, cfk cfkVar, cfd cfdVar, String str, long j2, cgv cgvVar, chh chhVar, cgk cgkVar, long j3, chd chdVar, blo bloVar, byi byiVar) {
        this.a = chgVar;
        this.b = j;
        this.c = cfpVar;
        this.d = cfjVar;
        this.e = cfkVar;
        this.f = cfdVar;
        this.g = str;
        this.h = j2;
        this.i = cgvVar;
        this.j = chhVar;
        this.k = cgkVar;
        this.l = j3;
        this.m = chdVar;
        this.n = bloVar;
        this.o = null;
        this.p = byiVar;
    }

    public final float a() {
        return this.a.a();
    }

    public final long b() {
        return this.a.b();
    }

    public final cdh c(cdh cdhVar) {
        if (cdhVar == null) {
            return this;
        }
        chg chgVar = cdhVar.a;
        long jB = chgVar.b();
        chgVar.e();
        chgVar.a();
        return cdi.a(this, jB, cdhVar.b, cdhVar.c, cdhVar.d, cdhVar.e, cdhVar.f, cdhVar.g, cdhVar.h, cdhVar.i, cdhVar.j, cdhVar.k, cdhVar.l, cdhVar.m, cdhVar.n, cdhVar.p);
    }

    public final boolean d(cdh cdhVar) {
        if (this == cdhVar) {
            return true;
        }
        long j = this.b;
        long j2 = cdhVar.b;
        long j3 = cid.a;
        if (!a.q(j, j2) || !a.ao(this.c, cdhVar.c) || !a.ao(this.d, cdhVar.d) || !a.ao(this.e, cdhVar.e) || !a.ao(this.f, cdhVar.f) || !a.ao(this.g, cdhVar.g) || !a.q(this.h, cdhVar.h) || !a.ao(this.i, cdhVar.i) || !a.ao(this.j, cdhVar.j) || !a.ao(this.k, cdhVar.k)) {
            return false;
        }
        long j4 = this.l;
        long j5 = cdhVar.l;
        long j6 = bkv.a;
        if (!a.q(j4, j5)) {
            return false;
        }
        cdf cdfVar = cdhVar.o;
        return a.ao(null, null);
    }

    public final boolean e(cdh cdhVar) {
        return a.ao(this.a, cdhVar.a) && a.ao(this.m, cdhVar.m) && a.ao(this.n, cdhVar.n) && a.ao(this.p, cdhVar.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdh)) {
            return false;
        }
        cdh cdhVar = (cdh) obj;
        return d(cdhVar) && e(cdhVar);
    }

    public final void f() {
        this.a.e();
    }

    public final int hashCode() {
        long jB = b();
        long j = bkv.a;
        int iR = a.r(jB);
        f();
        int iFloatToIntBits = (iR * 961) + Float.floatToIntBits(a());
        long j2 = cid.a;
        cfp cfpVar = this.c;
        int iR2 = ((((((iFloatToIntBits * 31) + a.r(this.b)) * 31) + (cfpVar != null ? cfpVar.h : 0)) * 961) + (this.e != null ? 65535 : 0)) * 31;
        cfd cfdVar = this.f;
        int iHashCode = (iR2 + (cfdVar != null ? cfdVar.hashCode() : 0)) * 31;
        String str = this.g;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + a.r(this.h)) * 31) + (this.i != null ? Float.floatToIntBits(0.0f) : 0)) * 31;
        chh chhVar = this.j;
        int iHashCode3 = (iHashCode2 + (chhVar != null ? chhVar.hashCode() : 0)) * 31;
        cgk cgkVar = this.k;
        int iHashCode4 = (((iHashCode3 + (cgkVar != null ? cgkVar.hashCode() : 0)) * 31) + a.r(this.l)) * 31;
        chd chdVar = this.m;
        int i = (iHashCode4 + (chdVar != null ? chdVar.d : 0)) * 31;
        blo bloVar = this.n;
        int iHashCode5 = (i + (bloVar != null ? bloVar.hashCode() : 0)) * 961;
        byi byiVar = this.p;
        return iHashCode5 + (byiVar != null ? byiVar.hashCode() : 0);
    }

    public cdh(long j, long j2, cfp cfpVar, cfj cfjVar, cfk cfkVar, cfd cfdVar, long j3, cgv cgvVar, long j4, byi byiVar) {
        this(chp.o(j), j2, cfpVar, cfjVar, cfkVar, cfdVar, null, j3, cgvVar, null, null, j4, null, null, byiVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append((Object) bkv.g(b()));
        sb.append(", brush=null, alpha=");
        f();
        sb.append(a());
        sb.append(", fontSize=");
        sb.append((Object) cid.c(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) cid.c(this.h));
        sb.append(VnmwoBe.GfOty);
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append((Object) bkv.g(this.l));
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ cdh(cfp cfpVar, cfj cfjVar, cfk cfkVar, cfd cfdVar, long j, cgv cgvVar, long j2, int i) {
        this((i & 1) != 0 ? bkv.f : 0L, (i & 2) != 0 ? cid.a : 0L, (i & 4) != 0 ? null : cfpVar, (i & 8) != 0 ? null : cfjVar, (i & 16) != 0 ? null : cfkVar, (i & 32) != 0 ? null : cfdVar, (i & 128) != 0 ? cid.a : j, (i & 256) != 0 ? null : cgvVar, (i & 2048) != 0 ? bkv.f : j2, null);
    }
}
