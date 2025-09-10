package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uwr {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;

    static {
        String strA = uwd.a("kotlinx.coroutines.scheduler.default.name");
        if (strA == null) {
            strA = "DefaultDispatcher";
        }
        a = strA;
        b = ukc.aa("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        c = ukc.ac("kotlinx.coroutines.scheduler.core.pool.size", ukc.n(uwd.a, 2), 1, 0, 8);
        d = ukc.ac("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(ukc.aa("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
    }
}
