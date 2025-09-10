package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwb extends uht implements uiu {
    final /* synthetic */ gwv a;
    final /* synthetic */ azr b;
    final /* synthetic */ azr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwb(gwv gwvVar, azr azrVar, azr azrVar2, uhb uhbVar) {
        super(2, uhbVar);
        this.a = gwvVar;
        this.b = azrVar;
        this.c = azrVar2;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gwb) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        gwv gwvVar = this.a;
        if (!gwvVar.z()) {
            this.b.b(false);
            this.c.b(null);
            gwvVar.t.b(false);
            azr azrVar = gwvVar.u;
            Object objA = azrVar.a();
            gxj gxjVar = gxj.a;
            if (objA != gxjVar) {
                gwvVar.N.a();
                azrVar.b(gxjVar);
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new gwb(this.a, this.b, this.c, uhbVar);
    }
}
