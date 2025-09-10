package defpackage;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class sww extends AbstractExecutorService implements AutoCloseable, syw {
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final syu submit(Runnable runnable) {
        return (syu) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final syu submit(Callable callable) {
        return (syu) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final syu submit(Runnable runnable, Object obj) {
        return (syu) super.submit(runnable, obj);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() throws InterruptedException {
        a.s(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return szo.g(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new szo(callable);
    }
}
