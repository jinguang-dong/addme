package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dea extends uht implements uiu {
    final /* synthetic */ Object a;
    private /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dea(uhb uhbVar, uiq uiqVar, int i) {
        super(2, uhbVar);
        this.c = i;
        this.a = uiqVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.c != 0) {
            return ((dea) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((dea) c((ddq) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, uiu] */
    @Override // defpackage.uhn
    public final Object b(Object obj) throws Throwable {
        if (this.c == 0) {
            rnt.aN(obj);
            ddq ddqVar = (ddq) this.b;
            ddqVar.getClass();
            return this.a.a(ddqVar.b());
        }
        rnt.aN(obj);
        uhd uhdVar = ((und) this.b).c().get(uhc.k);
        uhdVar.getClass();
        uhc uhcVar = (uhc) uhdVar;
        umr umrVar = new umr();
        ung.t(uof.a, uhcVar, 4, new utu(umrVar, (uiu) this.a, (uhb) null, 1));
        while (!umrVar.v()) {
            try {
                return ukc.z(uhcVar, new crd(umrVar, (uhb) null, 6));
            } catch (InterruptedException unused) {
            }
        }
        return umrVar.fY();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, uiu] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.c != 0) {
            dea deaVar = new dea((uiu) this.a, uhbVar, 1);
            deaVar.b = obj;
            return deaVar;
        }
        dea deaVar2 = new dea(uhbVar, (uiq) this.a, 0);
        deaVar2.b = obj;
        return deaVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dea(uiu uiuVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.c = i;
        this.a = uiuVar;
    }
}
