package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qlz implements Executor {
    public final Executor b;
    public final Object a = new Object();
    public final Deque c = new ArrayDeque();
    public boolean d = false;

    public qlz(Executor executor) {
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.a) {
            this.c.addLast(runnable);
            if (!this.d) {
                this.d = true;
                this.b.execute(new qly(this, 0));
            }
        }
    }
}
