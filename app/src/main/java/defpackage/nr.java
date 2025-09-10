package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nr implements cwf, nb {
    final /* synthetic */ nu a;
    private final cwc b;
    private final no c;
    private nb d;

    public nr(nu nuVar, cwc cwcVar, no noVar) {
        cwcVar.getClass();
        this.a = nuVar;
        this.b = cwcVar;
        this.c = noVar;
        cwcVar.a(this);
    }

    @Override // defpackage.cwf
    public final void a(cwh cwhVar, cwa cwaVar) {
        if (cwaVar == cwa.ON_START) {
            this.d = this.a.a(this.c);
            return;
        }
        if (cwaVar != cwa.ON_STOP) {
            if (cwaVar == cwa.ON_DESTROY) {
                b();
            }
        } else {
            nb nbVar = this.d;
            if (nbVar != null) {
                nbVar.b();
            }
        }
    }

    @Override // defpackage.nb
    public final void b() {
        this.b.c(this);
        this.c.f(this);
        nb nbVar = this.d;
        if (nbVar != null) {
            nbVar.b();
        }
        this.d = null;
    }
}
