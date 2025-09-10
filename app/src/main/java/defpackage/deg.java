package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class deg extends uht implements uiu {
    final /* synthetic */ uiq a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deg(uhb uhbVar, uiq uiqVar) {
        super(2, uhbVar);
        this.a = uiqVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((deg) c((ddq) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        ddq ddqVar = (ddq) this.b;
        ddqVar.getClass();
        return this.a.a(ddqVar.b());
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        deg degVar = new deg(uhbVar, this.a);
        degVar.b = obj;
        return degVar;
    }
}
