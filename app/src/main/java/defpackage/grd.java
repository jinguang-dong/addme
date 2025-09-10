package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grd {
    public grc a = new grc() { // from class: grb
        @Override // defpackage.grc
        public final void j() {
        }
    };
    public final int b;
    public long c;
    private final ScheduledExecutorService d;
    private ScheduledFuture e;

    public grd(ScheduledExecutorService scheduledExecutorService, hbj hbjVar) {
        this.d = scheduledExecutorService;
        this.b = ((Integer) hbjVar.a(gzw.b).get()).intValue();
    }

    public final void a() {
        ScheduledFuture scheduledFuture;
        synchronized (this) {
            scheduledFuture = this.e;
            this.e = null;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final synchronized void b() {
        this.c = SystemClock.elapsedRealtime();
        if (this.e == null) {
            ScheduledExecutorService scheduledExecutorService = this.d;
            gpk gpkVar = new gpk(this, 7);
            long j = this.b;
            this.e = scheduledExecutorService.scheduleAtFixedRate(gpkVar, j, j, TimeUnit.MILLISECONDS);
        }
    }
}
