package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class frn implements Executor, paq {
    public final Executor a;
    private final int b;
    private final ScheduledExecutorService c;

    public frn(String str, int i) {
        out outVar = new out();
        this.b = i;
        this.c = ojl.cc(str);
        this.a = outVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.c.shutdown();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.c.schedule(new fjw(this, runnable, 9), this.b, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException unused) {
        }
    }
}
