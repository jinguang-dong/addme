package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cre extends uht implements uiu {
    /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cre(uhb uhbVar, int i) {
        super(2, uhbVar);
        this.b = i;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            return ((cre) c((csl) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i != 1) {
            return ((cre) c((rba) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((cre) c((byi) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        int i = this.b;
        if (i == 0) {
            rnt.aN(obj);
            return Boolean.valueOf(!(((csl) this.a) instanceof cse));
        }
        if (i == 1) {
            rnt.aN(obj);
            return Boolean.valueOf(((byi) this.a) instanceof tc);
        }
        rnt.aN(obj);
        rba rbaVar = (rba) this.a;
        tpc tpcVar = (tpc) rbaVar.a(5, null);
        tpcVar.r(rbaVar);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        rba rbaVar2 = (rba) tpcVar.b;
        rba rbaVar3 = rba.a;
        rbaVar2.b = trb.a;
        tph tphVarL = tpcVar.l();
        tphVarL.getClass();
        return tphVarL;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        int i = this.b;
        if (i == 0) {
            cre creVar = new cre(uhbVar, 0);
            creVar.a = obj;
            return creVar;
        }
        if (i != 1) {
            cre creVar2 = new cre(uhbVar, 2, (char[]) null);
            creVar2.a = obj;
            return creVar2;
        }
        cre creVar3 = new cre(uhbVar, 1, (byte[]) null);
        creVar3.a = obj;
        return creVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cre(uhb uhbVar, int i, byte[] bArr) {
        super(2, uhbVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cre(uhb uhbVar, int i, char[] cArr) {
        super(2, uhbVar);
        this.b = i;
    }
}
