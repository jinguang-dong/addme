package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class msw extends uhs implements uiu {
    int a;
    final /* synthetic */ und b;
    final /* synthetic */ bqo c;
    final /* synthetic */ ujx d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msw(und undVar, bqo bqoVar, ujx ujxVar, uhb uhbVar) {
        super(uhbVar);
        this.b = undVar;
        this.c = bqoVar;
        this.d = ujxVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((msw) c((bqk) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        bqk bqkVar;
        uhi uhiVar = uhi.a;
        int i = this.a;
        if (i == 0) {
            rnt.aN(obj);
            bqkVar = (bqk) this.e;
            this.e = bqkVar;
            this.a = 1;
            obj = ajq.c(bqkVar, 1 == (2 & 1), 2, this);
            if (obj != uhiVar) {
            }
        }
        if (i != 1) {
            rnt.aN(obj);
            return obj;
        }
        bqkVar = (bqk) this.e;
        rnt.aN(obj);
        bqk bqkVar2 = bqkVar;
        long j = ((bpv) obj).a;
        ahz ahzVar = new ahz(this.b, this.c, this.d, bqkVar2, 4);
        this.e = null;
        this.a = 2;
        Object objBh = a.bh(bqkVar2, j, ahzVar, this);
        return objBh == uhiVar ? uhiVar : objBh;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        msw mswVar = new msw(this.b, this.c, this.d, uhbVar);
        mswVar.e = obj;
        return mswVar;
    }
}
