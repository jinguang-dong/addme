package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rvj {
    public static final rxc a;

    static {
        rxc rviVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            rviVar = new rvh();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            rviVar = new rvi();
        }
        a = rviVar;
    }
}
