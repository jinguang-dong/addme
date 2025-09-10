package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rez implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);
    private final ThreadGroup b = new ThreadGroup("HSV");

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        runnable.getClass();
        int andIncrement = this.a.getAndIncrement();
        return new Thread(this.b, new qly(runnable, 14), "HSV background #" + andIncrement);
    }
}
