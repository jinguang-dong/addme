package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class iuu implements rpr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ iuu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.rpr
    public final void a(rpn rpnVar, int i) {
        if (this.b == 0) {
            rpnVar.a = this.a;
        } else {
            Integer num = gmv.a;
            rpnVar.d((CharSequence) this.a.get(i));
        }
    }
}
