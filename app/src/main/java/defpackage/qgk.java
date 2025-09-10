package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qgk implements Runnable {
    final /* synthetic */ qhd a;
    final /* synthetic */ Callable b;

    public qgk(qhd qhdVar, Callable callable) {
        this.a = qhdVar;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        try {
            qhd qhdVar = this.a;
            Object objCall = this.b.call();
            objCall.getClass();
            qhdVar.i(objCall);
        } catch (Exception e) {
            this.a.j(qgg.a(e));
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
