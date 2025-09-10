package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hpg implements paq {
    private static final sgv a = sgv.g("hpg");
    private final qla b;
    private final ScheduledExecutorService c;
    private final long d;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private ScheduledFuture f = null;
    private final hoq g;

    public hpg(qla qlaVar, hoq hoqVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.b = qlaVar;
        this.g = hoqVar;
        this.d = j;
        this.c = scheduledExecutorService;
    }

    private final void c() {
        ScheduledFuture scheduledFuture = this.f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f = null;
            this.b.d();
        }
    }

    public final synchronized void a() {
        if (this.e.get()) {
            ((sgt) a.c().M(1421)).s("Attempted to start audio sampler after it has been closed.");
        } else if (this.f != null) {
            ((sgt) a.c().M(1420)).s("Sampler already started.");
        } else {
            this.b.c();
            this.f = this.c.scheduleAtFixedRate(new hbv(this.g, 13), 0L, this.d, TimeUnit.MICROSECONDS);
        }
    }

    public final synchronized void b() {
        c();
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        c();
        boolean z = qia.a;
        this.b.close();
        this.e.set(true);
    }
}
