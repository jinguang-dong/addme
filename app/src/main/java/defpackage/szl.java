package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class szl extends sxz {
    public syu a;
    public ScheduledFuture b;

    public szl(syu syuVar) {
        syuVar.getClass();
        this.a = syuVar;
    }

    @Override // defpackage.swn
    protected final void d() {
        p(this.a);
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.swn
    protected final String ez() {
        syu syuVar = this.a;
        ScheduledFuture scheduledFuture = this.b;
        if (syuVar == null) {
            return null;
        }
        String strBx = a.bx(syuVar, "inputFuture=[", "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return strBx + ", remaining delay=[" + delay + " ms]";
            }
        }
        return strBx;
    }
}
