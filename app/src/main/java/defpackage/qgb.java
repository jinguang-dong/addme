package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qgb implements Runnable {
    private final Object a;
    private final Executor b;
    private final qhd c;
    private final qgj d;

    public qgb(Object obj, qgj qgjVar, Executor executor, qhd qhdVar) {
        this.a = obj;
        this.b = executor;
        this.c = qhdVar;
        this.d = qgjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qgj qgjVar = this.d;
        Object obj = this.a;
        Executor executor = this.b;
        qhd qhdVar = this.c;
        try {
            qgjVar.a(obj, executor).c(sxo.a, new qgd(qhdVar), new qgc(qhdVar)).g(qfs.a);
        } catch (qgg e) {
            qhdVar.j(e);
        } catch (Throwable th) {
            qhdVar.j(qgg.a(th));
        }
    }

    public final String toString() {
        return this.d.toString();
    }
}
