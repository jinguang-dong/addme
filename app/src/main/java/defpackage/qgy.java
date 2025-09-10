package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qgy implements Runnable {
    private final Object a;
    private final Executor b;
    private final qhd c;
    private final qgj d;
    private final qpt e;

    public qgy(Object obj, qgj qgjVar, Executor executor, qhd qhdVar, qpt qptVar) {
        this.a = obj;
        this.b = executor;
        this.c = qhdVar;
        this.d = qgjVar;
        this.e = qptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qhd.l(this.a, this.d, this.b, this.c);
    }

    public final String toString() {
        return this.d.toString();
    }
}
