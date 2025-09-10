package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ces extends uht implements uiq {
    int a;
    final /* synthetic */ ceu b;
    final /* synthetic */ cfc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ces(ceu ceuVar, cfc cfcVar, uhb uhbVar) {
        super(1, uhbVar);
        this.b = ceuVar;
        this.c = cfcVar;
    }

    @Override // defpackage.uiq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new ces(this.b, this.c, (uhb) obj).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i != 0) {
            return obj;
        }
        ceu ceuVar = this.b;
        cfc cfcVar = this.c;
        this.a = 1;
        Object objC = ceuVar.c(cfcVar, this);
        return objC == uhiVar ? uhiVar : objC;
    }
}
