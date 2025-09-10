package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gkr {
    private static final sgv b = sgv.g("gkr");
    ScheduledFuture a = null;
    private final uem c;
    private final ScheduledExecutorService d;
    private final hbj e;

    public gkr(uem uemVar, ScheduledExecutorService scheduledExecutorService, hbj hbjVar) {
        this.c = uemVar;
        this.d = scheduledExecutorService;
        this.e = hbjVar;
    }

    public final synchronized void a() {
        ScheduledFuture scheduledFuture;
        if (this.e.p(gym.Z) && (scheduledFuture = this.a) != null) {
            scheduledFuture.cancel(false);
            this.a = null;
        }
    }

    public final synchronized void b() {
        if (this.e.p(gym.Z)) {
            if (this.a != null) {
                ((sgt) b.b().M(931)).s("Scheduler running already. Stopping it.");
                a();
            }
            ScheduledExecutorService scheduledExecutorService = this.d;
            uem uemVar = this.c;
            gkt gktVar = (gkt) uemVar.a();
            gktVar.getClass();
            this.a = scheduledExecutorService.scheduleWithFixedDelay(new gba(gktVar, 20), 0L, 2000L, TimeUnit.MILLISECONDS);
            ((gkt) uemVar.a()).a();
        }
    }
}
