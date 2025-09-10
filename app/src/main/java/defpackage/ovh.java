package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
class ovh extends syb implements RunnableScheduledFuture {
    private final RunnableScheduledFuture a;

    public ovh(RunnableScheduledFuture runnableScheduledFuture) {
        super(runnableScheduledFuture);
        this.a = runnableScheduledFuture;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return this.a.isPeriodic();
    }

    public void run() {
        this.a.run();
    }
}
