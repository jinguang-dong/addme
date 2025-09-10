package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfb extends ceo {
    public final String c;
    public final cfp d;
    private final int e;

    public cfb(String str, cfp cfpVar, cfo cfoVar) {
        super(1, cgc.b, cfoVar);
        this.c = str;
        this.d = cfpVar;
        this.e = 0;
    }

    @Override // defpackage.cfc
    public final cfp b() {
        return this.d;
    }

    @Override // defpackage.cfc
    public final void c() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfb)) {
            return false;
        }
        cfb cfbVar = (cfb) obj;
        if (a.ao(this.c, cfbVar.c) && a.ao(this.d, cfbVar.d)) {
            int i = cfbVar.e;
            return a.p(0, 0) && a.ao(this.b, cfbVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.d.h) * 961) + this.b.hashCode();
    }

    public final String toString() {
        return "Font(familyName=\"" + ((Object) (TOnSyMaYeslEl.vNoRPjwssITiayJ + this.c + ')')) + "\", weight=" + this.d + ", style=" + ((Object) cfj.a()) + ')';
    }
}
