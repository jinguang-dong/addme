package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vcs implements Executor {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ vcs(qel qelVar, Executor executor, int i) {
        this.c = i;
        this.a = qelVar;
        this.b = executor;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.c != 0) {
            this.b.execute(new pev(this.a, runnable, 7));
        } else {
            try {
                this.a.execute(runnable);
            } catch (RejectedExecutionException e) {
                ((vct) this.b).g(e);
            }
        }
    }

    public vcs(vct vctVar, Executor executor, int i) {
        this.c = i;
        this.a = executor;
        this.b = vctVar;
    }
}
