package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oui extends Thread {
    private final int a;

    public oui(int i, Runnable runnable, String str) {
        super(runnable);
        this.a = i;
        setName(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
