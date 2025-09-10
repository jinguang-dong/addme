package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fsp implements paq {
    public static final sgv a = sgv.g("fsp");
    public final szh b;
    public final szh c;
    public final syu d;
    public final syu e;

    public fsp(ScheduledExecutorService scheduledExecutorService, szh szhVar, fdq fdqVar) {
        szh szhVar2 = new szh();
        fta.a(szhVar2, "ShutterButton");
        this.b = szhVar2;
        szh szhVar3 = new szh();
        fta.a(szhVar3, "FirstPreviewFrame");
        this.c = szhVar3;
        syj syjVarF = ske.F(szhVar3, szhVar2);
        Callable callable = new Callable() { // from class: fso
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fsq.f;
            }
        };
        sxo sxoVar = sxo.a;
        syu syuVarI = swz.i(syjVarF.a(callable, sxoVar), new fgb(9), sxoVar);
        this.d = syuVarI;
        syu syuVarI2 = swf.i(ske.T(syuVarI, 4000L, TimeUnit.MILLISECONDS, scheduledExecutorService), Throwable.class, new fgb(10), sxoVar);
        fta.a(syuVarI2, "Interactivity");
        this.e = syuVarI2;
        if (!szhVar.isDone()) {
            szhVar.f(swf.i(swz.i(syuVarI, new fgb(11), sxoVar), Throwable.class, new fgb(12), sxoVar));
        }
        fdqVar.j().d(this);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        syu syuVar = this.d;
        if (syuVar.isDone()) {
            return;
        }
        syuVar.cancel(true);
    }
}
