package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apb extends bij implements bwx {
    public uif a;
    public aii b;
    public boolean c;
    public amr d;
    private cbl e;
    private final uiq f = new np(this, 16);
    private uiq g;

    public apb(uif uifVar, amr amrVar, aii aiiVar, boolean z) {
        this.a = uifVar;
        this.d = amrVar;
        this.b = aiiVar;
        this.c = z;
        c();
    }

    public final void c() {
        this.e = new cbl(new apa(this, 0), new apa(this, 2));
        this.g = this.c ? new np(this, 17) : null;
    }

    @Override // defpackage.bij
    public final boolean db() {
        return false;
    }

    @Override // defpackage.bwx
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.bwx
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.bwx
    public final void s(cbn cbnVar) {
        cbw.s(cbnVar);
        cbw.a(cbnVar, this.f);
        cbl cblVar = null;
        if (this.b == aii.a) {
            cbl cblVar2 = this.e;
            if (cblVar2 == null) {
                ujp.c("scrollAxisRange");
            } else {
                cblVar = cblVar2;
            }
            cbw.l(cbnVar, cblVar);
        } else {
            cbl cblVar3 = this.e;
            if (cblVar3 == null) {
                ujp.c("scrollAxisRange");
            } else {
                cblVar = cblVar3;
            }
            cbw.f(cbnVar, cblVar);
        }
        uiq uiqVar = this.g;
        if (uiqVar != null) {
            cbnVar.e(cbm.f, new cbc(null, uiqVar));
        }
        cbnVar.e(cbm.A, new cbc(null, new aal(new apa(this, 3), 19)));
        cbw.c(cbnVar, this.d.b ? new cbd(-1, 1) : new cbd(1, -1));
    }
}
