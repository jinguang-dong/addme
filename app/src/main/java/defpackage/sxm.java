package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class sxm extends sys {
    private final Executor a;
    final /* synthetic */ sxn b;

    public sxm(sxn sxnVar, Executor executor) {
        this.b = sxnVar;
        executor.getClass();
        this.a = executor;
    }

    public abstract void c(Object obj);

    @Override // defpackage.sys
    public final void d(Throwable th) {
        sxn sxnVar = this.b;
        sxnVar.b = null;
        if (th instanceof ExecutionException) {
            sxnVar.a(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            sxnVar.cancel(false);
        } else {
            sxnVar.a(th);
        }
    }

    @Override // defpackage.sys
    public final void e(Object obj) {
        this.b.b = null;
        c(obj);
    }

    final void f() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.b.a(e);
        }
    }

    @Override // defpackage.sys
    public final boolean g() {
        return this.b.isDone();
    }
}
