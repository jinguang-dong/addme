package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class szo extends sxz implements RunnableFuture {
    private volatile sys a;

    public szo(sxh sxhVar) {
        this.a = new szm(this, sxhVar);
    }

    public static szo g(Runnable runnable, Object obj) {
        return new szo(Executors.callable(runnable, obj));
    }

    @Override // defpackage.swn
    protected final void d() {
        sys sysVar;
        if (r() && (sysVar = this.a) != null) {
            sysVar.h();
        }
        this.a = null;
    }

    @Override // defpackage.swn
    protected final String ez() {
        sys sysVar = this.a;
        return sysVar != null ? a.bx(sysVar, "task=[", "]") : super.ez();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        sys sysVar = this.a;
        if (sysVar != null) {
            sysVar.run();
        }
        this.a = null;
    }

    public szo(Callable callable) {
        this.a = new szn(this, callable);
    }
}
