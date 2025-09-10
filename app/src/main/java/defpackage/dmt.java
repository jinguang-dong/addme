package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dmt implements uiu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ dmt(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r7v4, types: [bsr, java.lang.Object] */
    @Override // defpackage.uiu
    public final Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            dmw dmwVar = new dmw((tdy) this.a, (bts) obj);
            return (bss) this.b.a(dmwVar, (cho) obj2);
        }
        if (i == 1) {
            bts btsVar = (bts) obj;
            long j = ((cho) obj2).a;
            return this.a.e(btsVar, btsVar.p(ufg.a, new bfh(-431986394, true, new ars(this.b, new akz(btsVar, j), 1, null))), j);
        }
        uhd uhdVar = (uhd) obj2;
        ((ufg) obj).getClass();
        uhdVar.getClass();
        ujy ujyVar = (ujy) this.a;
        int i2 = ujyVar.a;
        ujyVar.a = i2 + 1;
        ((uhf[]) this.b)[i2] = uhdVar;
        return ufg.a;
    }

    public /* synthetic */ dmt(uhf[] uhfVarArr, ujy ujyVar, int i) {
        this.c = i;
        this.b = uhfVarArr;
        this.a = ujyVar;
    }
}
