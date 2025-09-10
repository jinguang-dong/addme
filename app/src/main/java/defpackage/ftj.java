package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftj implements Executor {
    private final Executor a;
    private final uem b;
    private final AtomicBoolean c;
    private final Object d;

    public ftj(Executor executor, uem uemVar, AtomicBoolean atomicBoolean, Object obj) {
        this.a = executor;
        this.b = uemVar;
        this.c = atomicBoolean;
        this.d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.concurrent.Executor] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!this.c.get()) {
            this.a.execute(runnable);
            return;
        }
        synchronized (this.d) {
            ExecutorService executorService = (ExecutorService) this.b.a();
            boolean zIsShutdown = executorService.isShutdown();
            ExecutorService executorService2 = executorService;
            if (zIsShutdown) {
                executorService2 = this.a;
            }
            executorService2.execute(runnable);
        }
    }
}
