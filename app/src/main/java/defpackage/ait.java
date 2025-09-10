package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ait extends uht implements uiu {
    int a;
    final /* synthetic */ aji b;
    final /* synthetic */ long c;
    final /* synthetic */ ujx d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ait(aji ajiVar, long j, ujx ujxVar, uhb uhbVar) {
        super(2, uhbVar);
        this.b = ajiVar;
        this.c = j;
        this.d = ujxVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ait) c((rnu) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            rnu rnuVar = (rnu) this.e;
            aji ajiVar = this.b;
            long j = this.c;
            ujx ujxVar = this.d;
            float fB = ajiVar.b(j);
            ais aisVar = new ais(ujxVar, ajiVar, rnuVar, 0);
            this.a = 1;
            if (byi.ba(0.0f, fB, null, aisVar, this, 12) == uhiVar) {
                return uhiVar;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        ait aitVar = new ait(this.b, this.c, this.d, uhbVar);
        aitVar.e = obj;
        return aitVar;
    }
}
