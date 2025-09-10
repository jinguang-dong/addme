package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fss implements paq {
    final /* synthetic */ rnn a;
    private final AtomicBoolean b = new AtomicBoolean(true);
    private final ScheduledFuture c;

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    public fss(rnn rnnVar) {
        this.a = rnnVar;
        this.c = rnnVar.b.schedule(new fnf(this, 2), 4000L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.b.getAndSet(false)) {
            this.c.cancel(true);
            this.a.d();
        }
    }
}
