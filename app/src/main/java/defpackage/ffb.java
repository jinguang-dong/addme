package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ffb implements kle {
    private final fee a;
    private final pjo b;
    private final syu c;
    private final kle d;
    private kiy e;

    public ffb(fee feeVar, pjo pjoVar, syu syuVar, kle kleVar) {
        this.a = feeVar;
        this.c = syuVar;
        this.d = kleVar;
        this.b = pjoVar;
    }

    @Override // defpackage.kle
    public final void a(poj pojVar, syu syuVar) {
        if (pojVar.a() == 35 && (this.e == null || pojVar.d() > this.e.d())) {
            pkf pkfVar = new pkf(pojVar, 2);
            kiy kiyVar = this.e;
            if (kiyVar != null) {
                kiyVar.close();
            }
            this.e = new kiy(new pkg(pkfVar), syuVar);
            pojVar = pkfVar;
        }
        this.d.a(new pkg(pojVar), syuVar);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.e != null) {
            fel felVar = (fel) ojl.ci(this.c);
            if (felVar != null) {
                pao paoVarB = pao.b(((Integer) this.a.a(this.b).dL()).intValue());
                lmf lmfVarA = lmg.a(this.e);
                lmfVarA.c = paoVarB;
                felVar.f(lmfVarA.a());
            }
            this.e.close();
        }
        this.d.close();
    }
}
