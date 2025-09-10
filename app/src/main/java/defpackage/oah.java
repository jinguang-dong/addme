package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oah extends ThreadPoolExecutor implements AutoCloseable {
    final /* synthetic */ oak a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oah(oak oakVar) {
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.a = oakVar;
        setThreadFactory(new oai());
        allowCoreThreadTimeOut(true);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.s(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new oag(this, runnable, obj);
    }
}
