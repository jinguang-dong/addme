package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qjj implements qin {
    private final qin c;
    public final AtomicInteger a = new AtomicInteger(0);
    public final AtomicBoolean b = new AtomicBoolean(false);
    private final Throwable d = new Throwable("Context stacktrace");

    public qjj(qin qinVar) {
        this.c = qinVar;
    }

    @Override // defpackage.qff
    public final qgi a() {
        return this.c.a();
    }

    @Override // defpackage.qff, defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.set(true);
        this.c.close();
    }

    @Override // defpackage.qin
    public final qim d() {
        return this.c.d();
    }

    @Override // defpackage.qin
    public final qjq e() {
        return this.c.e();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.c.execute(new rsw(this, runnable, this.d, 1));
    }

    @Override // defpackage.qin
    public final qkq f() {
        return this.c.f();
    }

    @Override // defpackage.qin
    public final void g(qjt qjtVar, Runnable runnable) {
        this.c.g(qjtVar, runnable);
    }

    @Override // defpackage.qin
    public final boolean h() {
        return this.c.h();
    }

    @Override // defpackage.qin
    public final qms i(Object obj, rww rwwVar) {
        return this.c.i(obj, rwwVar);
    }
}
