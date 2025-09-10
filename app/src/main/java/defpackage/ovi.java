package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovi implements Executor, paq {
    private final ScheduledExecutorService a;
    private final long b;
    private final TimeUnit c;
    private ScheduledFuture e;
    private final Object d = new Object();
    private boolean f = false;

    public ovi(ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit) {
        this.a = scheduledExecutorService;
        this.b = j;
        this.c = timeUnit;
    }

    public final void a(Runnable runnable, long j, TimeUnit timeUnit) {
        synchronized (this.d) {
            if (this.f) {
                return;
            }
            b();
            this.e = this.a.schedule(runnable, j, timeUnit);
        }
    }

    public final void b() {
        synchronized (this.d) {
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            if (this.f) {
                return;
            }
            this.f = true;
            this.a.shutdownNow();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(runnable, this.b, this.c);
    }
}
