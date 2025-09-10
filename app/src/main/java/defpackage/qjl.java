package defpackage;

import android.util.Log;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qjl implements qin {
    private final qin a;

    public qjl(qin qinVar) {
        this.a = qinVar;
    }

    @Override // defpackage.qff
    public final qgi a() {
        return this.a.a();
    }

    @Override // defpackage.qff, defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.qin
    public final qim d() {
        return this.a.d();
    }

    @Override // defpackage.qin
    public final qjq e() {
        return this.a.e();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.e("GLContext", "Executing command on GL context was rejected! Command ignored.", e);
        }
    }

    @Override // defpackage.qin
    public final qkq f() {
        return this.a.f();
    }

    @Override // defpackage.qin
    public final void g(qjt qjtVar, Runnable runnable) {
        try {
            this.a.g(qjtVar, runnable);
        } catch (RejectedExecutionException e) {
            Log.e("GLContext", "Executing command on GL context was rejected! Command ignored.", e);
        }
    }

    @Override // defpackage.qin
    public final boolean h() {
        return this.a.h();
    }

    @Override // defpackage.qin
    public final qms i(Object obj, rww rwwVar) {
        return this.a.i(obj, rwwVar);
    }
}
