package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ftm {
    private static final sgv a = sgv.g("ftm");
    private final fto b;
    private final ScheduledExecutorService c;
    private final int d;
    private final Map e = new HashMap();
    private int f = 0;

    public ftm(fto ftoVar, ScheduledExecutorService scheduledExecutorService, int i) {
        this.b = ftoVar;
        this.c = scheduledExecutorService;
        this.d = i;
    }

    public final void a() {
        this.c.schedule(new fnf(this, 5), 100L, TimeUnit.MILLISECONDS);
    }

    public final synchronized void b() {
        Thread threadCurrentThread = Thread.currentThread();
        Long lValueOf = Long.valueOf(threadCurrentThread.getId());
        Map map = this.e;
        if (!map.containsKey(lValueOf)) {
            this.b.a();
            map.put(lValueOf, threadCurrentThread.getName());
        }
        if (map.size() == this.d) {
            map.values().iterator().next();
            return;
        }
        int i = this.f + 1;
        this.f = i;
        if (i >= 50) {
            ((sgt) a.c().M(372)).s("Failed to throttle the executor!");
        } else {
            this.c.schedule(new fnf(this, 5), 10L, TimeUnit.MILLISECONDS);
        }
    }
}
