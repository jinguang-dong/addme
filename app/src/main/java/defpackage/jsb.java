package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsb {
    private volatile boolean a = false;

    public final synchronized long a() {
        if (this.a) {
            return 4611686018427387903L;
        }
        return SystemClock.elapsedRealtimeNanos();
    }

    public final synchronized void b() {
        this.a = true;
    }
}
