package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class euc extends Thread {
    public euc(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(9);
        super.run();
    }
}
