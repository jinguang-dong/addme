package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vg extends uht implements uiu {
    int a;
    final /* synthetic */ una b;
    final /* synthetic */ uiq c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg(una unaVar, uiq uiqVar, long j, uhb uhbVar) {
        super(2, uhbVar);
        this.b = unaVar;
        this.c = uiqVar;
        this.d = j;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vg) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) throws Throwable {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i != 0) {
            return obj;
        }
        und undVar = vh.a;
        unj unjVarA = ukc.A(vh.a, this.b, new vf(this.c, (uhb) null, 1), 2);
        long j = this.d;
        vf vfVar = new vf(unjVarA, (uhb) null, 0);
        this.a = 1;
        Object objI = ujo.i(j, vfVar, this);
        return objI == uhiVar ? uhiVar : objI;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new vg(this.b, this.c, this.d, uhbVar);
    }
}
