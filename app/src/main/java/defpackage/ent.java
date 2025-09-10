package defpackage;

import android.os.SystemClock;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ent {
    private static final eny a = new eny(YyLACfm.aXKFGxuaoOInFq);
    private int b;
    private boolean c;

    public ent() {
        c(1);
        this.c = false;
    }

    public final synchronized int a() {
        return this.b;
    }

    public final synchronized void b() {
        this.c = true;
    }

    public final synchronized void c(int i) {
        if (this.b != i) {
            eny enyVar = a;
            Integer.toBinaryString(i);
            enz.g(enyVar);
        }
        this.b = i;
        notifyAll();
    }

    public final synchronized boolean d() {
        return this.c;
    }

    public final void e(int i) {
        eny enyVar = a;
        Integer.toBinaryString(i);
        enz.g(enyVar);
        long jUptimeMillis = SystemClock.uptimeMillis() + 3500;
        synchronized (this) {
            while ((a() | i) != i) {
                try {
                    wait(3500L);
                } catch (InterruptedException unused) {
                    if (SystemClock.uptimeMillis() > jUptimeMillis) {
                        enz.c(a, "Timeout waiting.");
                    }
                    return;
                }
            }
        }
    }
}
