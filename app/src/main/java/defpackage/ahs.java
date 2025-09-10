package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahs extends ahn {
    public aii h;
    public boolean i;
    public uiv j;
    public uiv k;
    public got l;

    public ahs(got gotVar, uiq uiqVar, aii aiiVar, boolean z, ocq ocqVar, boolean z2, uiv uivVar, uiv uivVar2) {
        super(uiqVar, z, ocqVar, aiiVar);
        this.l = gotVar;
        this.h = aiiVar;
        this.i = z2;
        this.j = uivVar;
        this.k = uivVar2;
    }

    @Override // defpackage.ahn
    public final Object c(uiu uiuVar, uhb uhbVar) throws Throwable {
        Object objX = this.l.x(afs.b, new ahq(uiuVar, this, (uhb) null, 0), uhbVar);
        return objX == uhi.a ? objX : ufg.a;
    }

    @Override // defpackage.ahn
    public final void r(long j) {
        if (!this.w || a.ao(this.j, ahp.a)) {
            return;
        }
        ukc.C(C(), null, 4, new ahr(this, j, (uhb) null, 0), 1);
    }

    @Override // defpackage.ahn
    public final void t(long j) {
        if (!this.w || a.ao(this.k, ahp.b)) {
            return;
        }
        ukc.C(C(), null, 4, new ahr(this, j, null, 2, null), 1);
    }

    @Override // defpackage.ahn
    public final boolean w() {
        return this.i;
    }
}
