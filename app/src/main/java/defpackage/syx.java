package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface syx extends ScheduledExecutorService, syw {
    sza d(Runnable runnable, long j, TimeUnit timeUnit);

    sza e(Callable callable, long j, TimeUnit timeUnit);

    sza f(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    sza g(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
