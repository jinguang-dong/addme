package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class raw extends uht implements uiu {
    /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public raw(csl cslVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.c = i;
        this.b = cslVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.c != 0) {
            return ((raw) c((csl) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((raw) c((rba) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        if (this.c != 0) {
            rnt.aN(obj);
            csl cslVar = (csl) this.a;
            boolean z = false;
            if ((cslVar instanceof cqu) && ((cqu) cslVar).c <= ((cqu) this.b).c) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        rnt.aN(obj);
        rba rbaVar = (rba) this.a;
        tpc tpcVar = (tpc) rbaVar.a(5, null);
        tpcVar.r(rbaVar);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        Object obj2 = this.b;
        rba rbaVar2 = (rba) tpcVar.b;
        rba rbaVar3 = rba.a;
        rbaVar2.b();
        rbaVar2.b.add(obj2);
        tph tphVarL = tpcVar.l();
        tphVarL.getClass();
        rba rbaVar4 = (rba) tphVarL;
        rbaVar4.b.size();
        tpw<raz> tpwVar = rbaVar4.b;
        tpwVar.getClass();
        for (raz razVar : tpwVar) {
        }
        return rbaVar4;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.c != 0) {
            raw rawVar = new raw((csl) this.b, uhbVar, 1);
            rawVar.a = obj;
            return rawVar;
        }
        raw rawVar2 = new raw((raz) this.b, uhbVar, 0);
        rawVar2.a = obj;
        return rawVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public raw(raz razVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.c = i;
        this.b = razVar;
    }
}
