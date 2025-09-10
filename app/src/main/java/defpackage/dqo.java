package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqo extends uht implements uiu {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    final /* synthetic */ dkf c;
    final /* synthetic */ kwp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqo(boolean z, kwp kwpVar, Object obj, dkf dkfVar, uhb uhbVar) {
        super(2, uhbVar);
        this.a = z;
        this.d = kwpVar;
        this.b = obj;
        this.c = dkfVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqo) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        if (this.a) {
            kwp kwpVar = this.d;
            Object obj2 = this.b;
            dkf dkfVar = this.c;
            ((bgz) ((tdy) kwpVar.a).c).add(new dqj(obj2, new azz(dkfVar, bap.c)));
        } else {
            kwp kwpVar2 = this.d;
            ((tdy) kwpVar2.a).h(this.b);
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new dqo(this.a, this.d, this.b, this.c, uhbVar);
    }
}
