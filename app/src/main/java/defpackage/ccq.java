package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccq {
    private final cdk a;

    public ccq(cdk cdkVar) {
        this.a = cdkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccq)) {
            return false;
        }
        cdk cdkVar = this.a;
        cdk cdkVar2 = ((ccq) obj).a;
        return a.ao(cdkVar.a, cdkVar2.a) && cdkVar.b.v(cdkVar2.b) && a.ao(cdkVar.c, cdkVar2.c) && cdkVar.d == cdkVar2.d && cdkVar.e == cdkVar2.e && a.p(cdkVar.f, cdkVar2.f) && a.ao(cdkVar.g, cdkVar2.g) && cdkVar.h == cdkVar2.h && cdkVar.j == cdkVar2.j && a.q(cdkVar.i, cdkVar2.i);
    }

    public final int hashCode() {
        cdk cdkVar = this.a;
        int iHashCode = cdkVar.a.hashCode() * 31;
        cdo cdoVar = cdkVar.b;
        cdh cdhVar = cdoVar.b;
        long j = cdhVar.b;
        cfp cfpVar = cdhVar.c;
        long j2 = cid.a;
        int i = cfpVar != null ? cfpVar.h : 0;
        int iR = ((((a.r(j) * 31) + i) * 961) + (cdhVar.e != null ? 65535 : 0)) * 31;
        cfd cfdVar = cdhVar.f;
        int iHashCode2 = (iR + (cfdVar != null ? cfdVar.hashCode() : 0)) * 31;
        String str = cdhVar.g;
        int iHashCode3 = (((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + a.r(cdhVar.h)) * 31) + (cdhVar.i != null ? Float.floatToIntBits(0.0f) : 0)) * 31;
        chh chhVar = cdhVar.j;
        int iHashCode4 = (iHashCode3 + (chhVar != null ? chhVar.hashCode() : 0)) * 31;
        cgk cgkVar = cdhVar.k;
        int iHashCode5 = (iHashCode4 + (cgkVar != null ? cgkVar.hashCode() : 0)) * 31;
        long j3 = cdhVar.l;
        long j4 = bkv.a;
        int iR2 = (((iHashCode5 + a.r(j3)) * 961) + cdoVar.c.hashCode()) * 31;
        cdg cdgVar = cdoVar.d;
        return ((((((((((((((((iHashCode + iR2 + (cdgVar != null ? cdgVar.hashCode() : 0)) * 31) + cdkVar.c.hashCode()) * 31) + cdkVar.d) * 31) + a.o(cdkVar.e)) * 31) + cdkVar.f) * 31) + cdkVar.g.hashCode()) * 31) + cdkVar.h.hashCode()) * 31) + cdkVar.j.hashCode()) * 31) + a.r(cdkVar.i);
    }
}
