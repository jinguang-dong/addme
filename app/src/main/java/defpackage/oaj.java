package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oaj extends Thread {
    public oaj(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        super.run();
    }
}
