package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ciz implements syu {
    final WeakReference a;
    public final ciu b = new ciy(this);

    public ciz(civ civVar) {
        this.a = new WeakReference(civVar);
    }

    public final boolean a(Throwable th) {
        cio cioVar = new cio(th);
        cil cilVar = ciu.b;
        ciu ciuVar = this.b;
        if (!cilVar.d(ciuVar, null, cioVar)) {
            return false;
        }
        ciu.d(ciuVar);
        return true;
    }

    @Override // defpackage.syu
    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        civ civVar = (civ) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (!zCancel || civVar == null) {
            return zCancel;
        }
        civVar.a = null;
        civVar.b = null;
        civVar.c.e(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
