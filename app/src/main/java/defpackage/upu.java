package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class upu implements uiq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ upu(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [azr, java.lang.Object] */
    @Override // defpackage.uiq
    public final Object a(Object obj) {
        if (this.c != 0) {
            ((Float) obj).floatValue();
            this.b.b(this.a);
            return ufg.a;
        }
        ((upv) this.a).a.removeCallbacks(this.b);
        return ufg.a;
    }
}
