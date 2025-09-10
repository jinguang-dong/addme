package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dpp extends uht implements uiu {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ uiu c;
    final /* synthetic */ dpq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpp(uiu uiuVar, dpq dpqVar, uhb uhbVar) {
        super(2, uhbVar);
        this.c = uiuVar;
        this.d = dpqVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpp) c(new cif(((cif) obj).a), (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            long j = this.b;
            uiu uiuVar = this.c;
            cif cifVar = new cif(j);
            this.a = 1;
            obj = uiuVar.a(cifVar, this);
            if (obj == uhiVar) {
                return uhiVar;
            }
        }
        long j2 = ((cif) obj).a;
        this.d.g(0L);
        return new cif(j2);
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        dpp dppVar = new dpp(this.c, this.d, uhbVar);
        dppVar.b = ((cif) obj).a;
        return dppVar;
    }
}
