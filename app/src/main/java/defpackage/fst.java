package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fst implements Executor, ouu {
    public final Executor a;
    private final syu b;

    public fst(Executor executor, syu syuVar) {
        this.a = executor;
        this.b = syuVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        syu syuVar = this.b;
        if (syuVar.isDone()) {
            this.a.execute(runnable);
        } else {
            ojl.ck(syuVar, new jas(this, runnable, 1), sxo.a);
        }
    }
}
