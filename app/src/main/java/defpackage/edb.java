package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class edb implements Executor {
    public final ArrayDeque a = new ArrayDeque();
    public final Object b = new Object();
    private final Executor c;
    private Runnable d;

    public edb(Executor executor) {
        this.c = executor;
    }

    public final void a() {
        Runnable runnable = (Runnable) this.a.poll();
        this.d = runnable;
        if (runnable != null) {
            this.c.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.b) {
            this.a.add(new dxr(this, runnable, 2));
            if (this.d == null) {
                a();
            }
        }
    }
}
