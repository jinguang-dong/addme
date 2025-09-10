package defpackage;

import j$.time.Duration;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfr {
    public final pju a;
    public final Object b = new Object();
    public szh c;
    private final hfw d;
    private final Executor e;

    public hfr(hfw hfwVar, pju pjuVar, Executor executor) {
        this.d = hfwVar;
        this.a = pjuVar;
        this.e = executor;
    }

    public final syu a() {
        boolean z;
        szh szhVar;
        syu syuVarC;
        synchronized (this.b) {
            if (this.c == null) {
                this.c = new szh();
                z = true;
            } else {
                z = false;
            }
            szhVar = this.c;
        }
        if (z) {
            hfw hfwVar = this.d;
            Duration duration = hfw.a;
            hfv hfvVarA = hfwVar.a();
            if (hfvVarA != null) {
                hfwVar.d.i();
                syuVarC = ske.M(hfvVarA);
            } else {
                syuVarC = hfwVar.c(duration);
            }
            ske.F(syuVarC).c(new cmc(this, syuVarC, 14, null), this.e);
        }
        return szhVar;
    }
}
