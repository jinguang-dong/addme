package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwm extends uod implements Executor {
    public static final uwm a = new uwm();
    private static final una b = uws.a.g(ukc.ac("kotlinx.coroutines.io.parallelism", ukc.n(64, uwd.a), 0, 0, 12));

    private uwm() {
    }

    @Override // defpackage.una
    public final void a(uhf uhfVar, Runnable runnable) {
        b.a(uhfVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(uhg.a, runnable);
    }

    @Override // defpackage.una
    public final void f(uhf uhfVar, Runnable runnable) {
        b.f(uhfVar, runnable);
    }

    @Override // defpackage.una
    public final String toString() {
        return "Dispatchers.IO";
    }
}
