package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jiv {
    public static final long a = TimeUnit.SECONDS.toNanos(10);
    public final pbc b;
    public final ScheduledExecutorService c;
    public final mdy d;

    public jiv(mdy mdyVar, pbb pbbVar, ScheduledExecutorService scheduledExecutorService) {
        this.d = mdyVar;
        this.b = pbbVar.a("ProcessingEvent");
        this.c = scheduledExecutorService;
    }
}
