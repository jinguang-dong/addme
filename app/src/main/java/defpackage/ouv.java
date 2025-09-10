package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ouv extends sww {
    private final Executor a;
    private final Object b = new Object();
    private int c = 0;
    private boolean d = false;

    public ouv(Executor executor) {
        this.a = executor;
    }

    private final void d() {
        Object obj = this.b;
        synchronized (obj) {
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                obj.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        Object obj = this.b;
        long nanos = timeUnit.toNanos(j);
        synchronized (obj) {
            while (true) {
                if (this.d && this.c == 0) {
                    return true;
                }
                if (nanos <= 0) {
                    return false;
                }
                long jNanoTime = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(obj, nanos);
                nanos -= System.nanoTime() - jNanoTime;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.b) {
            if (this.d) {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            this.c++;
        }
        try {
            this.a.execute(runnable);
        } finally {
            d();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean z;
        synchronized (this.b) {
            z = this.d;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean z;
        synchronized (this.b) {
            z = false;
            if (this.d && this.c == 0) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        Object obj = this.b;
        synchronized (obj) {
            this.d = true;
            if (this.c == 0) {
                obj.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        shutdown();
        return Collections.EMPTY_LIST;
    }
}
