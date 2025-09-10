package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uoe extends uod implements unk {
    private final Executor a;

    public uoe(Executor executor) {
        Method method;
        this.a = executor;
        Method method2 = uuz.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = uuz.a) == null) {
                return;
            }
            method.invoke(scheduledThreadPoolExecutor, true);
        } catch (Throwable unused) {
        }
    }

    private static final void e(uhf uhfVar, RejectedExecutionException rejectedExecutionException) {
        ujp.S(uhfVar, ujo.b("The task was rejected", rejectedExecutionException));
    }

    private static final ScheduledFuture i(ScheduledExecutorService scheduledExecutorService, Runnable runnable, uhf uhfVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            e(uhfVar, e);
            return null;
        }
    }

    @Override // defpackage.una
    public final void a(uhf uhfVar, Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            e(uhfVar, e);
            una unaVar = unr.a;
            uwm.a.a(uhfVar, runnable);
        }
    }

    @Override // defpackage.unk
    public final void c(long j, umk umkVar) {
        Executor executor = this.a;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture scheduledFutureI = scheduledExecutorService != null ? i(scheduledExecutorService, new jhj((una) this, umkVar, 4), ((uml) umkVar).b, j) : null;
        if (scheduledFutureI != null) {
            ((uml) umkVar).y(new umi(scheduledFutureI, 1));
        } else {
            unh.a.c(j, umkVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof uoe) && ((uoe) obj).a == this.a;
    }

    @Override // defpackage.unk
    public final unt h(long j, Runnable runnable, uhf uhfVar) {
        Executor executor = this.a;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture scheduledFutureI = scheduledExecutorService != null ? i(scheduledExecutorService, runnable, uhfVar, j) : null;
        return scheduledFutureI != null ? new uns(scheduledFutureI) : unh.a.v(j, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // defpackage.una
    public final String toString() {
        return this.a.toString();
    }
}
