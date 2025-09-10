package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kuq implements pec {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kuq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, peo] */
    @Override // defpackage.pec
    public final void a(pdk pdkVar) {
        int i = this.c;
        if (i == 0) {
            int i2 = kur.a;
            poj pojVarE = pdkVar.e((peo) ((rwc) this.a).c());
            if (pojVarE != null) {
                ((mlw) ((rwc) this.b).c()).f(pojVarE);
            }
            pdkVar.close();
            return;
        }
        if (i == 1) {
            Object obj = this.b;
            Object obj2 = this.a;
            ((kpi) obj2).c.f.execute(new gts(obj2, obj, pdkVar, 6));
            return;
        }
        poj pojVarE2 = pdkVar.e(this.b);
        if (pojVarE2 != null) {
            Object obj3 = this.a;
            ((lyu) obj3).c.execute(new lor(obj3, pojVarE2, 5));
        }
        pdkVar.close();
    }
}
