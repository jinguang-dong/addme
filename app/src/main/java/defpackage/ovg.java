package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableScheduledFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ovg extends ovh {
    public ovg(RunnableScheduledFuture runnableScheduledFuture) {
        super(runnableScheduledFuture);
    }

    @Override // defpackage.ovh, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        try {
            super.run();
            if (!super.isDone() || super.isCancelled()) {
                return;
            }
            super.get();
        } catch (InterruptedException | CancellationException unused) {
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
