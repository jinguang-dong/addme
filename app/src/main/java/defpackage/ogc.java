package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogc implements ohh {
    public final oeo a;
    public final ofl b;
    public final /* synthetic */ ogd e;
    public oid f = null;
    public Set c = null;
    public boolean d = false;

    public ogc(ogd ogdVar, oeo oeoVar, ofl oflVar) {
        this.e = ogdVar;
        this.a = oeoVar;
        this.b = oflVar;
    }

    @Override // defpackage.ohh
    public final void a(odj odjVar) {
        this.e.n.post(new lor(this, odjVar, 14));
    }

    public final void b(odj odjVar) {
        oga ogaVar = (oga) this.e.k.get(this.b);
        if (ogaVar != null) {
            ogaVar.l(odjVar);
        }
    }

    public final void c() {
        oid oidVar;
        if (!this.d || (oidVar = this.f) == null) {
            return;
        }
        this.a.p(oidVar, this.c);
    }
}
