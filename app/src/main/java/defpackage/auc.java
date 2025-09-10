package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class auc implements uif {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ auc(bbo bboVar, ank ankVar, byz byzVar, int i) {
        this.d = i;
        this.c = bboVar;
        this.a = ankVar;
        this.b = byzVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r0v2, types: [bbo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [aby, java.lang.Object] */
    @Override // defpackage.uif
    public final Object a() {
        if (this.d == 0) {
            ?? r0 = this.c;
            return new aus(this.a, this.b, r0);
        }
        ocq ocqVar = (ocq) this.c.a();
        ank ankVar = (ank) this.a;
        return new amt(ankVar, ocqVar, (byz) this.b, new qzx(((aop) ankVar.p.d).a(), ocqVar));
    }

    public /* synthetic */ auc(Object obj, aby abyVar, uiq uiqVar, int i) {
        this.d = i;
        this.a = obj;
        this.b = abyVar;
        this.c = uiqVar;
    }
}
