package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqb extends uht implements uiu {
    int a;
    final /* synthetic */ und b;
    final /* synthetic */ abr c;
    final /* synthetic */ acn d;
    final /* synthetic */ acn e;
    final /* synthetic */ ocq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqb(ocq ocqVar, und undVar, abr abrVar, acn acnVar, acn acnVar2, uhb uhbVar) {
        super(2, uhbVar);
        this.f = ocqVar;
        this.b = undVar;
        this.c = abrVar;
        this.d = acnVar;
        this.e = acnVar2;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqb) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            ocq ocqVar = this.f;
            dqa dqaVar = new dqa(this.b, this.c, this.d, this.e);
            this.a = 1;
            if (usx.f((usx) ocqVar.a, dqaVar, this) == uhiVar) {
                return uhiVar;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new dqb(this.f, this.b, this.c, this.d, this.e, uhbVar);
    }
}
