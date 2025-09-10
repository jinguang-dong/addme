package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sya extends syn {
    private final syu a;

    public sya(syu syuVar) {
        syuVar.getClass();
        this.a = syuVar;
    }

    @Override // defpackage.swn, defpackage.syu
    public final void c(Runnable runnable, Executor executor) {
        this.a.c(runnable, executor);
    }

    @Override // defpackage.swn, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.swn, java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // defpackage.swn, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.swn, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.swn
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.swn, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
