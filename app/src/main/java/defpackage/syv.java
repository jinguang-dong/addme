package defpackage;

import androidx.wear.ambient.AmbientDelegate;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syv extends FutureTask implements syu {
    private final sxr a;

    public syv(Callable callable) {
        super(callable);
        this.a = new sxr();
    }

    @Override // defpackage.syu
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        sxr sxrVar = this.a;
        synchronized (sxrVar) {
            if (sxrVar.a) {
                sxr.a(runnable, executor);
            } else {
                sxrVar.b = new AmbientDelegate(runnable, executor, sxrVar.b);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        sxr sxrVar = this.a;
        synchronized (sxrVar) {
            if (sxrVar.a) {
                return;
            }
            sxrVar.a = true;
            Object obj = sxrVar.b;
            Object obj2 = null;
            sxrVar.b = null;
            while (obj != null) {
                AmbientDelegate ambientDelegate = (AmbientDelegate) obj;
                Object obj3 = ambientDelegate.a;
                ambientDelegate.a = obj2;
                obj2 = obj;
                obj = obj3;
            }
            while (obj2 != null) {
                AmbientDelegate ambientDelegate2 = (AmbientDelegate) obj2;
                sxr.a(ambientDelegate2.b, ambientDelegate2.c);
                obj2 = ambientDelegate2.a;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        return nanos <= 2147483647999999999L ? super.get(j, timeUnit) : super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }
}
