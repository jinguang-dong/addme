package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class umi implements umj {
    private final /* synthetic */ int a;
    private final Object b;

    public umi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Future, unt] */
    @Override // defpackage.umj
    public final void a(Throwable th) {
        int i = this.a;
        if (i == 0) {
            this.b.a(th);
            return;
        }
        ?? r1 = this.b;
        if (i != 1) {
            r1.fL();
        } else {
            r1.cancel(false);
        }
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "CancelHandler.UserSupplied[" + ung.a(this.b) + "@" + ung.b(this) + "]";
        }
        if (i != 1) {
            return "DisposeOnCancel[" + this.b + "]";
        }
        return "CancelFutureOnCancel[" + this.b + "]";
    }
}
