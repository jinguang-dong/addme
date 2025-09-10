package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oow extends oor {
    public boolean b;
    public volatile boolean c;
    public Exception d;
    private Object f;
    public final Object a = new Object();
    public final rsn e = new rsn((byte[]) null);

    private final void s() {
        if (this.b) {
            if (!e()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excC = c();
        }
    }

    @Override // defpackage.oor
    public final oor a(Executor executor, oog oogVar) {
        oow oowVar = new oow();
        this.e.c(new ooh(executor, oogVar, oowVar));
        n();
        return oowVar;
    }

    @Override // defpackage.oor
    public final oor b(Executor executor, oog oogVar) {
        oow oowVar = new oow();
        this.e.c(new ooi(executor, oogVar, oowVar));
        n();
        return oowVar;
    }

    @Override // defpackage.oor
    public final Exception c() {
        Exception exc;
        synchronized (this.a) {
            exc = this.d;
        }
        return exc;
    }

    @Override // defpackage.oor
    public final Object d() {
        Object obj;
        synchronized (this.a) {
            ojl.av(this.b, "Task is not yet complete");
            if (this.c) {
                throw new CancellationException("Task is already canceled.");
            }
            Exception exc = this.d;
            if (exc != null) {
                throw new ooq(exc);
            }
            obj = this.f;
        }
        return obj;
    }

    @Override // defpackage.oor
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    @Override // defpackage.oor
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b && !this.c && this.d == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.oor
    public final void g(Executor executor, ook ookVar) {
        this.e.c(new ool(executor, ookVar, 1));
        n();
    }

    @Override // defpackage.oor
    public final void h(oom oomVar) {
        i(oov.a, oomVar);
    }

    @Override // defpackage.oor
    public final void i(Executor executor, oom oomVar) {
        this.e.c(new ool(executor, oomVar, 0));
        n();
    }

    @Override // defpackage.oor
    public final void j(oon oonVar) {
        k(oov.a, oonVar);
    }

    @Override // defpackage.oor
    public final void k(Executor executor, oon oonVar) {
        this.e.c(new ool(executor, oonVar, 2));
        n();
    }

    @Override // defpackage.oor
    public final void l(Executor executor, ooo oooVar) {
        this.e.c(new ool(executor, oooVar, 3));
        n();
    }

    @Override // defpackage.oor
    public final void m(ooo oooVar) {
        l(oov.a, oooVar);
    }

    public final void n() {
        synchronized (this.a) {
            if (this.b) {
                this.e.d(this);
            }
        }
    }

    public final void o(Exception exc) {
        ojl.az(exc, "Exception must not be null");
        synchronized (this.a) {
            s();
            this.b = true;
            this.d = exc;
        }
        this.e.d(this);
    }

    public final void p(Object obj) {
        synchronized (this.a) {
            s();
            this.b = true;
            this.f = obj;
        }
        this.e.d(this);
    }

    public final void q() {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c = true;
            this.e.d(this);
        }
    }

    public final void r(Object obj) {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.f = obj;
            this.e.d(this);
        }
    }
}
