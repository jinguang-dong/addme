package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class efz extends FutureTask {
    final /* synthetic */ ega a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efz(ega egaVar, Callable callable) {
        super(callable);
        this.a = egaVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        if (isCancelled()) {
            return;
        }
        try {
            this.a.c((efy) get());
        } catch (InterruptedException | ExecutionException e) {
            this.a.c(new efy(e));
        }
    }
}
