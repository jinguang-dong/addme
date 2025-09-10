package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcu implements mcw, jhh, jgl {
    private final hbj a;

    public hcu(hbj hbjVar) {
        this.a = hbjVar;
    }

    @Override // defpackage.jgl
    public final void b() {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        ExecutorService executorServiceBZ = ojl.bZ("leak-checker");
        executorServiceBZ.execute(new hcv(jElapsedRealtimeNanos, executorServiceBZ, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        gzi gziVar = gzo.a;
    }
}
