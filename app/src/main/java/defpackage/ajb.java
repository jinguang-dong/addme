package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajb extends uht implements uiu {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ ajc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajb(ajc ajcVar, uhb uhbVar) {
        super(2, uhbVar);
        this.c = ajcVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajb) c(new bkf(((bkf) obj).a), (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i != 0) {
            return obj;
        }
        long j = this.b;
        ajc ajcVar = this.c;
        this.a = 1;
        Object objA = aiu.a(ajcVar.i, j, this);
        return objA == uhiVar ? uhiVar : objA;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        ajb ajbVar = new ajb(this.c, uhbVar);
        ajbVar.b = ((bkf) obj).a;
        return ajbVar;
    }
}
