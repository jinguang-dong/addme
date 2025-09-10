package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aps extends uht implements uiu {
    final /* synthetic */ apt a;
    final /* synthetic */ bry b;
    final /* synthetic */ uif c;
    final /* synthetic */ uif d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aps(apt aptVar, bry bryVar, uif uifVar, uif uifVar2, uhb uhbVar) {
        super(2, uhbVar);
        this.a = aptVar;
        this.b = bryVar;
        this.c = uifVar;
        this.d = uifVar2;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aps) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        und undVar = (und) this.e;
        apt aptVar = this.a;
        ukc.C(undVar, null, 0, new agq(aptVar, this.b, this.c, (uhb) null, 5), 3);
        return ukc.C(undVar, null, 0, new aej(aptVar, this.d, (uhb) null, 9), 3);
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        aps apsVar = new aps(this.a, this.b, this.c, this.d, uhbVar);
        apsVar.e = obj;
        return apsVar;
    }
}
