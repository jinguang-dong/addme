package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class sye extends syc implements syu {
    protected sye() {
    }

    @Override // defpackage.syu
    public final void c(Runnable runnable, Executor executor) {
        h().c(runnable, executor);
    }

    @Override // defpackage.syc
    protected /* bridge */ /* synthetic */ Future fj() {
        throw null;
    }

    protected abstract syu h();
}
