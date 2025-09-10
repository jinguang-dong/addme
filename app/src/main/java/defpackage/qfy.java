package defpackage;

import android.util.Log;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfy extends AbstractExecutorService implements AutoCloseable, qfo {
    private final Thread b;
    private final qfz d;
    private final AtomicBoolean c = new AtomicBoolean(false);
    public final qhd a = new qhd();

    public qfy(String str, qfz qfzVar) {
        this.d = qfzVar;
        this.b = new Thread(new ovw(this, qfzVar, 12), str);
    }

    public final void a() {
        this.b.start();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        try {
            this.b.join(TimeUnit.MILLISECONDS.convert(j, timeUnit));
            return isTerminated();
        } catch (InterruptedException unused) {
            Log.w("EventLoopThread", "Interrupted while waiting for thread to stop.");
            return false;
        }
    }

    @Override // java.lang.AutoCloseable, defpackage.qfo, java.io.Closeable
    public final void close() {
        this.a.g(qfs.a);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws InterruptedException {
        this.d.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.c.get();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return !this.b.isAlive();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() throws InterruptedException {
        this.c.set(true);
        this.d.a();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() throws InterruptedException {
        this.c.set(true);
        qfz qfzVar = this.d;
        qfzVar.a.clear();
        qfzVar.a();
        return (List) qpt.am(this.a);
    }

    public final String toString() {
        return "EventLoopThread[" + this.b.getName() + "]";
    }
}
