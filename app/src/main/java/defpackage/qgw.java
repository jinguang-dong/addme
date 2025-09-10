package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qgw implements Runnable {
    final /* synthetic */ qgj a;
    final /* synthetic */ Executor b;
    final /* synthetic */ qhd c;
    final /* synthetic */ qgj d;
    final /* synthetic */ qhd e;
    final /* synthetic */ qpt f;

    public qgw(qhd qhdVar, qgj qgjVar, Executor executor, qhd qhdVar2, qpt qptVar, qgj qgjVar2) {
        this.a = qgjVar;
        this.b = executor;
        this.c = qhdVar2;
        this.f = qptVar;
        this.d = qgjVar2;
        this.e = qhdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qhd qhdVar = this.e;
        Object obj = qhdVar.a;
        if (obj != null) {
            qhd.l(obj, this.a, this.b, this.c);
            return;
        }
        qgg qggVar = qhdVar.b;
        qgj qgjVar = this.d;
        Executor executor = this.b;
        qhd qhdVar2 = this.c;
        try {
            qgjVar.a(qggVar, executor).c(sxo.a, new qhb(qhdVar2), new qha(qhdVar2)).g(qfs.a);
        } catch (qgg e) {
            qhdVar2.j(e);
        } catch (Throwable th) {
            qhdVar2.j(qgg.a(th));
        }
    }

    public final String toString() {
        qgj qgjVar = this.d;
        qgj qgjVar2 = this.a;
        return this.e.toString() + "then[" + qgjVar2.toString() + ", " + qgjVar.toString() + "]";
    }
}
