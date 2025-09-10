package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfd {
    public final Runnable a;
    public final Executor b;
    public final long c;

    public nfd(Runnable runnable, Executor executor, long j) {
        this.a = runnable;
        this.b = executor;
        this.c = j;
    }
}
