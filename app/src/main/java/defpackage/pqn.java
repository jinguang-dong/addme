package defpackage;

import android.os.Process;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pqn {
    public final long a;

    private pqn(long j) {
        this.a = j;
    }

    public static pqn b() {
        for (int i = 0; i < 3; i++) {
            SystemClock.elapsedRealtimeNanos();
            System.currentTimeMillis();
            SystemClock.elapsedRealtimeNanos();
        }
        long j = 0;
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < 3; i2++) {
            long jNanoTime = System.nanoTime();
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long jNanoTime2 = System.nanoTime();
            long j3 = jNanoTime2 - jNanoTime;
            if (j3 < j2) {
                j = jElapsedRealtimeNanos - ((jNanoTime + jNanoTime2) / 2);
                j2 = j3;
            }
        }
        return new pqn(j);
    }

    public final long a(long j) {
        return j - this.a;
    }

    public pqn() {
        this.a = Process.getStartUptimeMillis();
    }
}
