package defpackage;

import android.os.Process;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vbg implements Executor {
    final /* synthetic */ vbh a;
    private final Executor b;

    public vbg(vbh vbhVar, Executor executor) {
        this.a = vbhVar;
        executor.getClass();
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws SecurityException, IllegalArgumentException {
        vbh vbhVar = this.a;
        if (vbhVar.c == null) {
            Process.setThreadPriority(vbhVar.b);
            vbhVar.c = Thread.currentThread();
        }
        this.b.execute(runnable);
    }
}
