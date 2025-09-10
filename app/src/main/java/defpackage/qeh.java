package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qeh implements Executor {
    public final /* synthetic */ qei a;
    private final Executor b;

    public qeh(qei qeiVar, Executor executor) {
        this.a = qeiVar;
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.execute(new pev(this, runnable, 6));
    }
}
