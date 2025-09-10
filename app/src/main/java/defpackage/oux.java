package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oux implements Executor {
    private final out a;

    public oux(out outVar) {
        this.a = outVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        if (out.d()) {
            runnable.run();
            return;
        }
        final szh szhVar = new szh();
        this.a.execute(new Runnable() { // from class: ouw
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = runnable;
                szh szhVar2 = szhVar;
                try {
                    runnable2.run();
                    szhVar2.e(true);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        });
        try {
            szhVar.s();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }
}
