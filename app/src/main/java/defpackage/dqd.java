package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dqd extends uht implements uiu {
    final /* synthetic */ uif a;
    final /* synthetic */ aby b;
    final /* synthetic */ bbb c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqd(uif uifVar, bbb bbbVar, aby abyVar, uhb uhbVar) {
        super(2, uhbVar);
        this.a = uifVar;
        this.c = bbbVar;
        this.b = abyVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqd) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        ukc.C((und) this.d, null, 0, new agq(this.a, this.c, this.b, (uhb) null, 6), 3);
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        dqd dqdVar = new dqd(this.a, this.c, this.b, uhbVar);
        dqdVar.d = obj;
        return dqdVar;
    }
}
