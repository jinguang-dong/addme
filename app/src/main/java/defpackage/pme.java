package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class pme implements paq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ pme(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.c == 0) {
            this.a.close();
            this.b.close();
        } else {
            Object obj = this.b;
            Object obj2 = this.a;
            synchronized (obj2) {
                ((qrh) obj2).d.remove(obj);
            }
        }
    }
}
