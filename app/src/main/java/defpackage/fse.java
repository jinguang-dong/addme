package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fse {
    public static final sgv a = sgv.g("fse");
    public final syu b;
    private final long c;

    public fse(syu syuVar, long j) {
        this.b = syuVar;
        this.c = j;
    }

    public static fse a() {
        return new fse(ske.M(null), 0L);
    }

    public final rwc b() {
        try {
            return rwc.i(this.b.get(this.c, TimeUnit.MILLISECONDS));
        } catch (Exception unused) {
            ((sgt) a.c().M(363)).v("Failed to resolve %s, returning absent instead.", this.b);
            return rvk.a;
        }
    }

    public final syu c(ScheduledExecutorService scheduledExecutorService) {
        syu syuVarN = ske.N(this.b);
        fgb fgbVar = new fgb(8);
        sxo sxoVar = sxo.a;
        return swf.i(ske.T(swz.i(syuVarN, fgbVar, sxoVar), this.c, TimeUnit.MILLISECONDS, scheduledExecutorService), Exception.class, new fdz(this, 4), sxoVar);
    }
}
