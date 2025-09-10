package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hvx extends ibc {
    private final hvy a;
    private final lrp b;
    private final iso c;

    public hvx(iso isoVar, lrp lrpVar, hvy hvyVar) {
        this.c = isoVar;
        this.a = hvyVar;
        this.b = lrpVar;
    }

    @Override // defpackage.ibc, defpackage.hzi
    public final void i(ltd ltdVar) {
        lss lssVarA = this.b.a(ltdVar);
        if (lssVarA != null) {
            if (lssVarA.m() == ltf.SQUAD_PRIMARY || lssVarA.m() == ltf.SQUAD_BURST) {
                ibz ibzVarF = this.c.f(ltdVar);
                hvy hvyVar = this.a;
                ibzVarF.f(hvyVar);
                ibzVarF.a(hvyVar);
            }
        }
    }
}
