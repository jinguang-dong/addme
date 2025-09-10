package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpi implements Executor {
    private final Executor a;
    private final pbc b;

    public gpi(pbc pbcVar, Executor executor) {
        this.a = executor;
        this.b = pbcVar.a("SQLiteExpnCatchr");
        gzi gziVar = gzo.a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new gph(this.b, runnable));
    }
}
