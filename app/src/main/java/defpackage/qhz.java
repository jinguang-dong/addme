package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qhz {
    public final long a;

    public qhz(long j) {
        this.a = j;
    }

    public final long a() {
        return Math.max(0L, this.a - System.nanoTime());
    }

    public qhz(hbj hbjVar) {
        int iIntValue = ((Integer) hbjVar.a(gzo.m).get()).intValue();
        this.a = (iIntValue > 0 ? iIntValue : 420L) * 1000000;
    }

    public qhz() {
        this.a = SystemClock.elapsedRealtimeNanos();
        new Throwable();
    }
}
