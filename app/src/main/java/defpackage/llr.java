package defpackage;

import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llr {
    private final PowerManager a;
    private final String b = "ProcessingService";
    private final long c;
    private PowerManager.WakeLock d;

    public llr(PowerManager powerManager, long j) {
        this.a = powerManager;
        this.c = j;
    }

    public final synchronized void a(String str) {
        PowerManager.WakeLock wakeLockNewWakeLock = this.a.newWakeLock(1, this.b + ":" + str);
        wakeLockNewWakeLock.acquire(this.c);
        PowerManager.WakeLock wakeLock = this.d;
        if (wakeLock != null) {
            wakeLock.release();
        }
        this.d = wakeLockNewWakeLock;
    }

    public final synchronized void b() {
        PowerManager.WakeLock wakeLock = this.d;
        if (wakeLock != null) {
            wakeLock.release();
            this.d = null;
        }
    }
}
