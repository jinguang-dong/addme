package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agm extends uht implements uiu {
    int a;
    final /* synthetic */ ajs b;
    final /* synthetic */ ago c;
    final /* synthetic */ agi d;
    final /* synthetic */ uol e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agm(ajs ajsVar, ago agoVar, agi agiVar, uol uolVar, uhb uhbVar) {
        super(2, uhbVar);
        this.b = ajsVar;
        this.c = agoVar;
        this.d = agiVar;
        this.e = uolVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agm) c((rnu) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            rnu rnuVar = (rnu) this.f;
            ajs ajsVar = this.b;
            ago agoVar = this.c;
            agi agiVar = this.d;
            ajsVar.e = agoVar.c(agiVar);
            ahg ahgVar = new ahg(agoVar, this.e, rnuVar, 1);
            au auVar = new au(agoVar, ajsVar, agiVar, 2);
            this.a = 1;
            if (ajsVar.a(ahgVar, auVar, this) == uhiVar) {
                return uhiVar;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        agm agmVar = new agm(this.b, this.c, this.d, this.e, uhbVar);
        agmVar.f = obj;
        return agmVar;
    }
}
