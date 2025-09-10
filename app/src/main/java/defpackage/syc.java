package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class syc extends sai implements Future {
    protected syc() {
    }

    @Override // defpackage.sai
    protected /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return fj().cancel(z);
    }

    protected abstract Future fj();

    @Override // java.util.concurrent.Future
    public final Object get() {
        return fj().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return fj().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return fj().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return fj().get(j, timeUnit);
    }
}
