package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gkd extends gjy {
    public final fvu e;
    public final ndj f;
    public final mts g;
    public final mzz h;
    public final rwc i;
    public final gnt j;
    public gjy k;
    public gaw l;
    public final hbj m;
    public final gtm n;

    public gkd(fvu fvuVar, ndj ndjVar, mts mtsVar, mzz mzzVar, gtm gtmVar, rwc rwcVar, gnt gntVar, hbj hbjVar) {
        this.e = fvuVar;
        this.f = ndjVar;
        this.g = mtsVar;
        this.h = mzzVar;
        this.n = gtmVar;
        this.i = rwcVar;
        this.j = gntVar;
        this.m = hbjVar;
    }

    @Override // defpackage.gjw
    public final int e() {
        return this.k.e();
    }

    public final void j() {
        this.n.i();
        this.e.z(true);
        mzz mzzVar = this.h;
        mzzVar.w(true);
        mzzVar.m(true);
        this.f.at();
        this.g.d(true);
        rwc rwcVar = this.i;
        if (rwcVar.h() && this.j.i()) {
            gmt gmtVar = (gmt) rwcVar.c();
            gmtVar.b.set(false);
            if (gmtVar.f.equals(gho.LOCKED)) {
                gmtVar.j.a(moa.IDLE);
                gmtVar.e();
                synchronized (gmtVar.i) {
                    gmtVar.h = -1;
                }
            }
        }
        nql.c();
    }
}
