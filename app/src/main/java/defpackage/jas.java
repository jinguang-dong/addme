package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jas implements paf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jas(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.paf
    public final void a(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                ((out) ((mns) this.b).b).c(new img((ngk) obj, this.a, 16, null));
                return;
            } else {
                ((fst) this.a).a.execute(this.b);
                return;
            }
        }
        fel felVar = (fel) obj;
        if (((our) this.b).b()) {
            return;
        }
        Object obj2 = this.a;
        felVar.getClass();
        felVar.d(((jbc) obj2).aq.j());
    }

    public /* synthetic */ jas(mns mnsVar, jtd jtdVar, int i) {
        this.c = i;
        this.b = mnsVar;
        this.a = jtdVar;
    }
}
