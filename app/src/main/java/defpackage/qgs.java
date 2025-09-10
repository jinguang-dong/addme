package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qgs implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public qgs(Runnable runnable, qjt qjtVar, int i) {
        this.c = i;
        this.a = runnable;
        this.b = qjtVar;
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            qhd qhdVar = (qhd) this.a;
            if (qhdVar.a == null) {
                throw rxa.a(qhdVar.b);
            }
        } else {
            if (i != 1) {
                this.a.run();
                return;
            }
            try {
                Object obj = this.b;
                ((qfx) obj).d.a(this.a, ((qfx) obj).e, ((qfx) obj).a);
            } catch (Throwable th) {
                th = th;
                Object obj2 = this.a;
                if (th != obj2) {
                    th = qgg.a(th);
                    th.addSuppressed((Throwable) obj2);
                }
                ((qfx) this.b).a(th);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, qjt] */
    public final String toString() {
        int i = this.c;
        if (i != 0) {
            ?? r2 = this.b;
            return i != 1 ? r2.a() : ((qfx) r2).d.toString();
        }
        Object obj = this.a;
        Object obj2 = this.b;
        return obj.toString() + "finallyHandleException[" + obj2.toString() + "]";
    }

    public qgs(qfx qfxVar, qgg qggVar, int i) {
        this.c = i;
        this.a = qggVar;
        this.b = qfxVar;
    }

    public qgs(qhd qhdVar, qfs qfsVar, int i) {
        this.c = i;
        this.b = qfsVar;
        this.a = qhdVar;
    }
}
