package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cnd extends Thread {
    private final int a;

    public cnd(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
