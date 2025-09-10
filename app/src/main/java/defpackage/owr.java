package defpackage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owr implements Executor {
    private boolean a = false;
    private final Queue b = new LinkedList();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Runnable runnable2;
        Queue queue = this.b;
        synchronized (queue) {
            if (this.a) {
                queue.add(runnable);
                return;
            }
            this.a = true;
            while (runnable != null) {
                runnable.run();
                Queue queue2 = this.b;
                synchronized (queue2) {
                    runnable2 = (Runnable) queue2.poll();
                    if (runnable2 == null) {
                        this.a = false;
                    }
                }
                runnable = runnable2;
            }
        }
    }
}
