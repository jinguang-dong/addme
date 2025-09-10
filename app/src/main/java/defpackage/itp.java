package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class itp extends uht implements uiq {
    int a;
    final /* synthetic */ itu b;
    final /* synthetic */ iue c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itp(itu ituVar, iue iueVar, uhb uhbVar) {
        super(1, uhbVar);
        this.b = ituVar;
        this.c = iueVar;
    }

    @Override // defpackage.uiq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new itp(this.b, this.c, (uhb) obj).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i != 0) {
            return obj;
        }
        itu ituVar = this.b;
        iue iueVar = this.c;
        this.a = 1;
        Object objB = ituVar.b(iueVar, this);
        return objB == uhiVar ? uhiVar : objB;
    }
}
