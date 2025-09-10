package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class drb extends uht implements uiu {
    final /* synthetic */ dpj a;
    final /* synthetic */ float b;
    final /* synthetic */ abr c;
    final /* synthetic */ abr d;
    final /* synthetic */ bbo e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drb(dpj dpjVar, float f, abr abrVar, abr abrVar2, bbo bboVar, uhb uhbVar) {
        super(2, uhbVar);
        this.a = dpjVar;
        this.b = f;
        this.c = abrVar;
        this.d = abrVar2;
        this.e = bboVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drb) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        und undVar = (und) this.f;
        ujw ujwVar = new ujw();
        ujwVar.a = true;
        ujw ujwVar2 = new ujw();
        ujwVar2.a = true;
        abr abrVar = this.c;
        ukc.C(undVar, null, 0, new dra(this.a, this.b, ujwVar2, ujwVar, abrVar, this.d, this.e, null), 3);
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        drb drbVar = new drb(this.a, this.b, this.c, this.d, this.e, uhbVar);
        drbVar.f = obj;
        return drbVar;
    }
}
