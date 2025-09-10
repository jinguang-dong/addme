package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qhc implements syu {
    private final /* synthetic */ int a;
    private final Object b;

    public qhc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, syu] */
    @Override // defpackage.syu
    public final void c(Runnable runnable, Executor executor) {
        if (this.a != 0) {
            this.b.c(runnable, executor);
            return;
        }
        Object obj = this.b;
        if (((qhd) obj).f()) {
            executor.execute(runnable);
            return;
        }
        synchronized (obj) {
            if (((qhd) obj).f()) {
                executor.execute(runnable);
            } else {
                ((qhd) obj).k(executor, runnable);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (this.a == 0) {
            return false;
        }
        throw new UnsupportedOperationException("Cancellation of future is invalid.");
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        if (this.a != 0) {
            return ((swn) this.b).s();
        }
        try {
            return ((qhd) this.b).e();
        } catch (qgg e) {
            throw new ExecutionException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, syu] */
    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        if (this.a != 0) {
            return this.b.isCancelled();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, syu] */
    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        int i = this.a;
        ?? r1 = this.b;
        return i != 0 ? r1.isDone() : ((qhd) r1).f();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Object obj;
        if (this.a != 0) {
            return ((swn) this.b).t(j, timeUnit);
        }
        Object obj2 = this.b;
        synchronized (obj2) {
            if (!isDone()) {
                timeUnit.timedWait(obj2, j);
                if (!isDone()) {
                    throw new TimeoutException();
                }
            }
            obj = ((qhd) obj2).a;
            if (obj == null) {
                throw new ExecutionException(((qhd) obj2).b);
            }
        }
        return obj;
    }
}
