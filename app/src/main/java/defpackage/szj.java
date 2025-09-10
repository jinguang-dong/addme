package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class szj implements Runnable {
    szl a;

    public szj(szl szlVar) {
        this.a = szlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        syu syuVar;
        szl szlVar = this.a;
        if (szlVar == null || (syuVar = szlVar.a) == null) {
            return;
        }
        this.a = null;
        if (syuVar.isDone()) {
            szlVar.f(syuVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = szlVar.b;
            szlVar.b = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    szlVar.a(new szk(str));
                    throw th;
                }
            }
            szlVar.a(new szk(str + ": " + syuVar.toString()));
        } finally {
            syuVar.cancel(true);
        }
    }
}
