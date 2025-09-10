package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kwo implements kgz {
    private static final sgv a = sgv.g("kwo");
    private final syu b;
    private final rwc c;
    private final rwc d;
    private final fee e;
    private final pjo f;

    public kwo(syu syuVar, rwc rwcVar, rwc rwcVar2, fee feeVar, pjo pjoVar) {
        this.b = syuVar;
        this.c = rwcVar;
        this.d = rwcVar2;
        this.e = feeVar;
        this.f = pjoVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sgt, shi] */
    @Override // defpackage.kgz
    public final void a() {
        rwc rwcVar = this.c;
        if (rwcVar.h()) {
            rwc rwcVar2 = this.d;
            if (rwcVar2.h()) {
                peo peoVar = (peo) rwcVar2.c();
                try {
                    pdk pdkVarE = ((pdn) rwcVar.c()).e();
                    try {
                        if (pdkVarE == null) {
                            ((sgt) a.c().M(3549)).s("Got empty Frame, skipping.");
                            return;
                        }
                        pdkVarE.b();
                        ojl.by(pdkVarE);
                        poj pojVarE = pdkVarE.e(peoVar);
                        fel felVar = (fel) ojl.ci(this.b);
                        if (pojVarE != null) {
                            if (felVar != null) {
                                lmf lmfVar = new lmf(pojVarE);
                                poe poeVarD = pdkVarE.d();
                                lmfVar.d = poeVarD != null ? ske.M(poeVarD) : null;
                                lmfVar.c = pao.b(((Integer) this.e.a(this.f).dL()).intValue());
                                felVar.g(lmfVar.a());
                            } else {
                                pojVarE.close();
                            }
                        }
                        pdkVarE.close();
                    } finally {
                    }
                } catch (InterruptedException e) {
                    ((sgt) ((sgt) a.c().i(e)).M((char) 3548)).s("Unable to retrieve frame");
                }
            }
        }
    }
}
