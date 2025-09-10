package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class szc extends syz implements AutoCloseable, syx {
    final ScheduledExecutorService a;

    public szc(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.sww, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.s(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final sza schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.a;
        szo szoVarG = szo.g(runnable, null);
        return new sza(szoVarG, scheduledExecutorService.schedule(szoVarG, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final sza schedule(Callable callable, long j, TimeUnit timeUnit) {
        szo szoVar = new szo(callable);
        return new sza(szoVar, this.a.schedule(szoVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final sza scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        szb szbVar = new szb(runnable);
        return new sza(szbVar, this.a.scheduleAtFixedRate(szbVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final sza scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        szb szbVar = new szb(runnable);
        return new sza(szbVar, this.a.scheduleWithFixedDelay(szbVar, j, j2, timeUnit));
    }
}
