package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbs implements Executor {
    private final Executor a;
    private final pbn b;
    private final String c;

    public pbs(Executor executor, pbn pbnVar, String str) {
        this.a = executor;
        this.b = pbnVar;
        this.c = str;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(this.b.c(this.c, runnable));
    }
}
