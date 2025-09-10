package defpackage;

import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sxp extends sww {
    private final ujf c = new ujf();
    private int a = 0;
    private boolean b = false;

    private final void d() {
        ujf ujfVar = this.c;
        synchronized (ujfVar) {
            int i = this.a - 1;
            this.a = i;
            if (i == 0) {
                ujfVar.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        ujf ujfVar = this.c;
        long nanos = timeUnit.toNanos(j);
        synchronized (ujfVar) {
            while (true) {
                if (this.b && this.a == 0) {
                    return true;
                }
                if (nanos <= 0) {
                    return false;
                }
                long jNanoTime = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(ujfVar, nanos);
                nanos -= System.nanoTime() - jNanoTime;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.c) {
            if (this.b) {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            this.a++;
        }
        try {
            runnable.run();
        } finally {
            d();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean z;
        synchronized (this.c) {
            z = this.b;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean z;
        synchronized (this.c) {
            z = false;
            if (this.b && this.a == 0) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        ujf ujfVar = this.c;
        synchronized (ujfVar) {
            this.b = true;
            if (this.a == 0) {
                ujfVar.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        shutdown();
        int i = sbp.d;
        return sex.a;
    }
}
