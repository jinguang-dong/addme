package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dnk extends bup implements bwx {
    public final bkb a;
    private uif b;

    public dnk() {
        bkb bkbVarU = bdq.u(0, new nsd(this, 1, null), 1);
        M(bkbVarU);
        this.a = bkbVarU;
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
        cbw.e(cbnVar, this.a.c().a());
        if (this.b == null) {
            this.b = new dlc(this, 5);
        }
        cbnVar.e(cbm.u, new cbc(null, this.b));
    }
}
