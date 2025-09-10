package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class szg implements Executor {
    public static final syt a = new syt(szg.class);
    private final Executor e;
    public final Deque b = new ArrayDeque();
    public int d = 1;
    public long c = 0;
    private final szf f = new szf(this);

    public szg(Executor executor) {
        executor.getClass();
        this.e = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        Deque deque = this.b;
        synchronized (deque) {
            int i = this.d;
            if (i != 4 && i != 3) {
                long j = this.c;
                sze szeVar = new sze(runnable);
                deque.add(szeVar);
                this.d = 2;
                try {
                    this.e.execute(this.f);
                    if (this.d != 2) {
                        return;
                    }
                    synchronized (this.b) {
                        if (this.c == j && this.d == 2) {
                            this.d = 3;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    Deque deque2 = this.b;
                    synchronized (deque2) {
                        int i2 = this.d;
                        boolean z = false;
                        if ((i2 == 1 || i2 == 2) && deque2.removeLastOccurrence(szeVar)) {
                            z = true;
                        }
                        if (!(th instanceof RejectedExecutionException) || z) {
                            throw th;
                        }
                        return;
                    }
                }
            }
            deque.add(runnable);
        }
    }

    public final String toString() {
        Executor executor = this.e;
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + String.valueOf(executor) + "}";
    }
}
