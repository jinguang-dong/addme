package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qgv implements Runnable {
    final /* synthetic */ qgj a;
    final /* synthetic */ Executor b;
    final /* synthetic */ qhd c;
    final /* synthetic */ qhd d;
    final /* synthetic */ qpt e;

    public qgv(qhd qhdVar, qgj qgjVar, Executor executor, qhd qhdVar2, qpt qptVar) {
        this.a = qgjVar;
        this.b = executor;
        this.c = qhdVar2;
        this.e = qptVar;
        this.d = qhdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qhd qhdVar = this.d;
        Object obj = qhdVar.a;
        if (obj != null) {
            qhd.l(obj, this.a, this.b, this.c);
        } else {
            this.c.j(qhdVar.b);
        }
    }

    public final String toString() {
        qgj qgjVar = this.a;
        return this.d.toString() + "then[" + qgjVar.toString() + "]";
    }
}
