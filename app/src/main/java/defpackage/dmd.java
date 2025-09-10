package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dmd extends uht implements uiu {
    final /* synthetic */ dme a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmd(dme dmeVar, int i, uhb uhbVar) {
        super(2, uhbVar);
        this.a = dmeVar;
        this.b = i;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmd) c((aim) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        dme.l(this.a, this.b);
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new dmd(this.a, this.b, uhbVar);
    }
}
