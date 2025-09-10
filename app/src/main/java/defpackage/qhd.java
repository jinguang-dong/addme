package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qhd implements qgf {
    public volatile Object a = null;
    public volatile qgg b = null;
    private qgz c = null;
    private qgz d = null;

    public static void l(Object obj, qgj qgjVar, Executor executor, qhd qhdVar) {
        try {
            qgjVar.a(obj, executor).c(sxo.a, new qhb(qhdVar), new qha(qhdVar)).g(qfs.a);
        } catch (qgg e) {
            qhdVar.j(e);
        } catch (Throwable th) {
            qhdVar.j(qgg.a(th));
        }
    }

    private final void m() {
        qgz qgzVar;
        synchronized (this) {
            this.c = null;
            this.d = null;
            notifyAll();
        }
        for (qgzVar = this.c; qgzVar != null; qgzVar = qgzVar.a) {
            qgzVar.a();
        }
    }

    private final void n(Executor executor, Runnable runnable, qhd qhdVar) {
        synchronized (this) {
            if (f()) {
                throw new IllegalStateException("Should not be delaying execution when done");
            }
            qgz qgzVar = new qgz(executor, runnable, qhdVar);
            qgz qgzVar2 = this.d;
            if (qgzVar2 != null) {
                qgzVar2.a = qgzVar;
            } else {
                this.c = qgzVar;
            }
            this.d = qgzVar;
        }
    }

    private static void o(qgg qggVar, qfh qfhVar, Executor executor, qhd qhdVar) {
        try {
            executor.execute(new qgx(qggVar, qfhVar, qhdVar, 0));
        } catch (Throwable th) {
            qhdVar.j(qgg.a(th));
        }
    }

    private static void p(Object obj, qfh qfhVar, Executor executor, qhd qhdVar) {
        try {
            executor.execute(new qgx(obj, qfhVar, qhdVar, 0));
        } catch (Throwable th) {
            qhdVar.j(qgg.a(th));
        }
    }

    private static void q(qgg qggVar, qgj qgjVar, Executor executor, qhd qhdVar, qpt qptVar) {
        qhd qhdVar2;
        try {
            qhdVar2 = qhdVar;
            try {
                executor.execute(new qgy(qggVar, qgjVar, executor, qhdVar2, qptVar));
            } catch (Throwable th) {
                th = th;
                qhdVar2.j(qgg.a(th));
            }
        } catch (Throwable th2) {
            th = th2;
            qhdVar2 = qhdVar;
        }
    }

    private static void r(Object obj, qgj qgjVar, Executor executor, qhd qhdVar, qpt qptVar) {
        qhd qhdVar2;
        try {
            qhdVar2 = qhdVar;
            try {
                executor.execute(new qgy(obj, qgjVar, executor, qhdVar2, qptVar));
            } catch (Throwable th) {
                th = th;
                qhdVar2.j(qgg.a(th));
            }
        } catch (Throwable th2) {
            th = th2;
            qhdVar2 = qhdVar;
        }
    }

    @Override // defpackage.qgf
    public final qgf a(Executor executor, qfh qfhVar) {
        qhd qhdVar = new qhd();
        Object obj = this.a;
        if (obj != null) {
            p(obj, qfhVar, executor, qhdVar);
            return qhdVar;
        }
        qgg qggVar = this.b;
        if (qggVar != null) {
            qhdVar.j(qggVar);
            return qhdVar;
        }
        synchronized (this) {
            Object obj2 = this.a;
            if (obj2 == null && (qggVar = this.b) == null) {
                n(executor, new qgt(this, qfhVar, qhdVar), qhdVar);
                return qhdVar;
            }
            if (obj2 != null) {
                p(obj2, qfhVar, executor, qhdVar);
                return qhdVar;
            }
            qhdVar.j(qggVar);
            return qhdVar;
        }
    }

    @Override // defpackage.qgf
    public final qgf b(Executor executor, qgj qgjVar) throws Throwable {
        qpt qptVar = qhe.a;
        qhd qhdVar = new qhd();
        Object obj = this.a;
        if (obj != null) {
            r(obj, qgjVar, executor, qhdVar, qptVar);
            return qhdVar;
        }
        qgg qggVar = this.b;
        if (qggVar != null) {
            qhdVar.j(qggVar);
            return qhdVar;
        }
        synchronized (this) {
            try {
                Object obj2 = this.a;
                if (obj2 != null || (qggVar = this.b) != null) {
                    if (obj2 != null) {
                        r(obj2, qgjVar, executor, qhdVar, qptVar);
                        return qhdVar;
                    }
                    qhdVar.j(qggVar);
                    return qhdVar;
                }
                try {
                    n(executor, new qgv(this, qgjVar, executor, qhdVar, qptVar), qhdVar);
                    return qhdVar;
                } catch (Throwable th) {
                    th = th;
                    this = this;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // defpackage.qgf
    public final qgf c(Executor executor, qfh qfhVar, qfh qfhVar2) {
        qhd qhdVar = new qhd();
        Object obj = this.a;
        if (obj != null) {
            p(obj, qfhVar, executor, qhdVar);
            return qhdVar;
        }
        qgg qggVar = this.b;
        if (qggVar != null) {
            o(qggVar, qfhVar2, executor, qhdVar);
            return qhdVar;
        }
        synchronized (this) {
            Object obj2 = this.a;
            if (obj2 == null && (qggVar = this.b) == null) {
                n(executor, new qgu(this, qfhVar, qhdVar, qfhVar2), qhdVar);
                return qhdVar;
            }
            if (obj2 != null) {
                p(obj2, qfhVar, executor, qhdVar);
                return qhdVar;
            }
            o(qggVar, qfhVar2, executor, qhdVar);
            return qhdVar;
        }
    }

    @Override // defpackage.qgf
    public final syu d() {
        return new qhc(this, 0);
    }

    @Override // defpackage.qgf
    public final Object e() throws qgg {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null) {
            return obj2;
        }
        if (this.b != null) {
            throw this.b;
        }
        synchronized (this) {
            while (!f()) {
                wait();
            }
            obj = this.a;
            if (obj == null) {
                throw this.b;
            }
        }
        return obj;
    }

    @Override // defpackage.qgf
    public final boolean f() {
        return (this.a == null && this.b == null) ? false : true;
    }

    @Override // defpackage.qgf
    public final void g(qfs qfsVar) {
        if (this.a != null) {
            return;
        }
        qgg qggVar = this.b;
        if (qggVar != null) {
            throw rxa.a(qggVar);
        }
        synchronized (this) {
            Object obj = this.a;
            if (obj == null && (qggVar = this.b) == null) {
                k(sxo.a, new qgs(this, qfsVar, 0));
            } else if (obj == null) {
                throw rxa.a(qggVar);
            }
        }
    }

    @Override // defpackage.qgf
    public final qgf h(Executor executor, qaq qaqVar) throws Throwable {
        qgq qgqVar = new qgq(this, qaqVar);
        qgr qgrVar = new qgr(this, qaqVar);
        qpt qptVar = qhe.a;
        qhd qhdVar = new qhd();
        Object obj = this.a;
        if (obj != null) {
            r(obj, qgqVar, executor, qhdVar, qptVar);
            return qhdVar;
        }
        qgg qggVar = this.b;
        if (qggVar != null) {
            q(qggVar, qgrVar, executor, qhdVar, qptVar);
            return qhdVar;
        }
        synchronized (this) {
            try {
                try {
                    Object obj2 = this.a;
                    if (obj2 == null && (qggVar = this.b) == null) {
                        n(executor, new qgw(this, qgqVar, executor, qhdVar, qptVar, qgrVar), qhdVar);
                        return qhdVar;
                    }
                    if (obj2 != null) {
                        r(obj2, qgqVar, executor, qhdVar, qptVar);
                        return qhdVar;
                    }
                    q(qggVar, qgrVar, executor, qhdVar, qptVar);
                    return qhdVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final void i(Object obj) {
        if (f()) {
            return;
        }
        synchronized (this) {
            if (f()) {
                return;
            }
            this.a = obj;
            m();
        }
    }

    public final void j(qgg qggVar) {
        if (f()) {
            return;
        }
        synchronized (this) {
            if (f()) {
                return;
            }
            this.b = qggVar;
            m();
        }
    }

    public final void k(Executor executor, Runnable runnable) {
        synchronized (this) {
            if (f()) {
                throw new IllegalStateException("Should not be delaying execution when done");
            }
            qgz qgzVar = new qgz(executor, runnable);
            qgz qgzVar2 = this.d;
            if (qgzVar2 != null) {
                qgzVar2.a = qgzVar;
            } else {
                this.c = qgzVar;
            }
            this.d = qgzVar;
        }
    }
}
