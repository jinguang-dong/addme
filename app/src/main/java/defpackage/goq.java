package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class goq implements mcw {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ goq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, tzj] */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        int i = this.b;
        if (i == 0) {
            this.a.a();
            return;
        }
        if (i == 1) {
            this.a.run();
            return;
        }
        if (i == 2) {
            this.a.a();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                ((mlg) this.a).b();
                return;
            } else {
                this.a.a();
                return;
            }
        }
        ?? r2 = this.a;
        paq paqVarX = gsn.X();
        try {
            r2.run();
            paqVarX.close();
        } catch (Throwable th) {
            try {
                paqVarX.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
