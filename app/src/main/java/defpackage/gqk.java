package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqk {
    public static final gqj a = new gqj() { // from class: gqi
        @Override // defpackage.gqj
        public final void a(Long l) {
        }
    };
    public ScheduledFuture d;
    private final ScheduledExecutorService e;
    public gqj c = a;
    public final HashMap b = new HashMap();

    public gqk(ScheduledExecutorService scheduledExecutorService) {
        this.e = scheduledExecutorService;
    }

    public static final void b(ScheduledFuture scheduledFuture) {
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final synchronized void a(long j) {
        rnt.s(this.c != a);
        if (this.d == null) {
            this.d = this.e.scheduleAtFixedRate(new gpk(this, 4), 0L, 1000L, TimeUnit.MILLISECONDS);
        }
        this.b.put(Long.valueOf(j), Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
