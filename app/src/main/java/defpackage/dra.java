package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dra extends uht implements uiu {
    int a;
    final /* synthetic */ dpj b;
    final /* synthetic */ float c;
    final /* synthetic */ ujw d;
    final /* synthetic */ ujw e;
    final /* synthetic */ abr f;
    final /* synthetic */ abr g;
    final /* synthetic */ bbo h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dra(dpj dpjVar, float f, ujw ujwVar, ujw ujwVar2, abr abrVar, abr abrVar2, bbo bboVar, uhb uhbVar) {
        super(2, uhbVar);
        this.b = dpjVar;
        this.c = f;
        this.d = ujwVar;
        this.e = ujwVar2;
        this.f = abrVar;
        this.g = abrVar2;
        this.h = bboVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dra) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            und undVar = (und) this.i;
            urk urkVarAi = byi.ai(new dqy(this.b, this.c, 0));
            dqz dqzVar = new dqz(this.d, this.e, this.f, this.g, undVar, this.h, null);
            this.a = 1;
            if (ukc.J(urkVarAi, dqzVar, this) == uhiVar) {
                return uhiVar;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        dra draVar = new dra(this.b, this.c, this.d, this.e, this.f, this.g, this.h, uhbVar);
        draVar.i = obj;
        return draVar;
    }
}
