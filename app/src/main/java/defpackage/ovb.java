package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovb implements ScheduledExecutorService, AutoCloseable {
    public final out a = ouy.a;
    private final syx b;

    public ovb(ScheduledExecutorService scheduledExecutorService) {
        this.b = ske.B(scheduledExecutorService);
    }

    private final void a(syu syuVar) {
        syuVar.c(new ouz(this, syuVar, 0), sxo.a);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.b.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.s(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(this.b.submit(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.b.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        sza szaVarD = this.b.schedule(runnable, j, timeUnit);
        a(szaVarD);
        return szaVarD;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        sza szaVarF = this.b.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        a(szaVarF);
        return szaVarF;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        sza szaVarG = this.b.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        a(szaVarG);
        return szaVarG;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        syu syuVarA = this.b.submit(runnable);
        a(syuVarA);
        return syuVarA;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        sza szaVarE = this.b.schedule(callable, j, timeUnit);
        a(szaVarE);
        return szaVarE;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        syu syuVarC = this.b.submit(runnable, obj);
        a(syuVarC);
        return syuVarC;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        syu syuVarB = this.b.submit(callable);
        a(syuVarB);
        return syuVarB;
    }
}
