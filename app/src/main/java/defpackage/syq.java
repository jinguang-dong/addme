package defpackage;

import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class syq implements syu {
    public static final syu a = new syq(null);
    private static final syt c = new syt(syq.class);
    public final Object b;

    public syq(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.syu
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            c.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.b;
    }

    public final String toString() {
        Object obj = this.b;
        return super.toString() + pAAtrB.wXTbeqlyQTdpv + String.valueOf(obj) + "]]";
    }
}
