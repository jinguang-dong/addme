package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgm {
    public final ScheduledExecutorService a;
    public final mgp c;
    private ScheduledFuture e;
    public volatile mgn b = mgn.a;
    private final Object d = new Object();

    public mgm(mgp mgpVar, ScheduledExecutorService scheduledExecutorService) {
        this.c = mgpVar;
        this.a = scheduledExecutorService;
    }

    public final void a() {
        synchronized (this.d) {
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.e = null;
            }
        }
    }

    public final void b(mgl mglVar) {
        synchronized (this.d) {
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.e = this.a.scheduleAtFixedRate(new lsn(this, mglVar, 16, null), 0L, 30000L, TimeUnit.MILLISECONDS);
        }
    }
}
