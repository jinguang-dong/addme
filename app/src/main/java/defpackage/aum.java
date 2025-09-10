package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aum extends uht implements uiu {
    final /* synthetic */ float a;
    final /* synthetic */ aus b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aum(float f, aus ausVar, uhb uhbVar) {
        super(2, uhbVar);
        this.a = f;
        this.b = ausVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aum) c((rnu) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        ((rnu) this.c).p(this.a - this.b.l.e());
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        aum aumVar = new aum(this.a, this.b, uhbVar);
        aumVar.c = obj;
        return aumVar;
    }
}
