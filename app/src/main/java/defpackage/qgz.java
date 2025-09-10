package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qgz {
    public qgz a;
    private final Executor b;
    private final Runnable c;
    private final qhd d;

    public qgz(Executor executor, Runnable runnable) {
        this.b = executor;
        this.c = runnable;
        this.d = null;
    }

    public final void a() {
        try {
            this.b.execute(this.c);
        } catch (Throwable th) {
            qhd qhdVar = this.d;
            if (qhdVar == null) {
                throw th;
            }
            qhdVar.j(qgg.a(th));
        }
    }

    public qgz(Executor executor, Runnable runnable, qhd qhdVar) {
        this.b = executor;
        this.c = runnable;
        this.d = qhdVar;
    }
}
