package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hlt extends ojl {
    final /* synthetic */ pdk a;
    final /* synthetic */ peo b;
    final /* synthetic */ hlu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlt(hlu hluVar, pdk pdkVar, peo peoVar) {
        super((short[]) null);
        this.a = pdkVar;
        this.b = peoVar;
        this.c = hluVar;
    }

    @Override // defpackage.ojl
    public final void dI() {
        this.a.close();
    }

    @Override // defpackage.ojl
    public final void dY() {
        try {
            hlu hluVar = this.c;
            pao paoVarB = hluVar.b.b(hluVar.c);
            pdk pdkVar = this.a;
            poe poeVarD = pdkVar.d();
            int i = paoVarB.e;
            if (poeVarD != null) {
                new lnl(poeVarD, i, hluVar.a);
                pdo pdoVarB = pdkVar.b();
                poj pojVarE = pdkVar.e(this.b);
                if (pdoVarB != null && pojVarE != null) {
                    try {
                        hmk hmkVar = hluVar.d;
                        hmkVar.a.e(pdoVarB.b, hmkVar.b.ar(pojVarE));
                    } finally {
                    }
                }
                if (pojVarE != null) {
                    pojVarE.close();
                }
            }
        } finally {
            this.a.close();
        }
    }
}
