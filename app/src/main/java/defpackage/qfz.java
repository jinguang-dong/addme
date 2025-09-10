package defpackage;

import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfz implements Executor {
    public final ArrayBlockingQueue a = new ArrayBlockingQueue(16);
    public boolean b;

    public final void a() throws InterruptedException {
        execute(new oze(this, 14, null));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws InterruptedException {
        try {
            this.a.put(runnable);
        } catch (InterruptedException unused) {
            Log.w("BlockingEventLoop", "Interrupted while attempting to post event: Dropping event.");
        }
    }
}
