package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aiy extends uht implements uiu {
    final /* synthetic */ long a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiy(long j, uhb uhbVar) {
        super(2, uhbVar);
        this.a = j;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aiy) c((rnu) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        ((rnu) this.b).o(this.a);
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        aiy aiyVar = new aiy(this.a, uhbVar);
        aiyVar.b = obj;
        return aiyVar;
    }
}
