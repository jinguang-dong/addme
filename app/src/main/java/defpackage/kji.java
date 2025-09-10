package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kji implements kle {
    final /* synthetic */ kjj a;
    private final lss b;
    private final lmh c;
    private int d = 0;
    private pao e;
    private final lmi f;
    private final oge g;

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, lss] */
    public kji(kjj kjjVar, gga ggaVar, kle kleVar, lmi lmiVar) {
        szh szhVar;
        this.a = kjjVar;
        ?? r11 = ggaVar.b;
        this.b = r11;
        this.f = lmiVar;
        oge ogeVar = new oge(kjjVar, kleVar, (short[]) null);
        this.g = ogeVar;
        lly llyVar = kjjVar.c;
        Executor executor = kjjVar.d;
        rwc rwcVarJ = rwc.j(ogeVar);
        pbn pbnVar = kjjVar.b;
        Long.toString(SystemClock.elapsedRealtime());
        jiz jizVar = new jiz();
        lmk lmkVar = new lmk(llyVar, executor, lmiVar, jizVar, pbnVar);
        lmh lmhVar = new lmh(llyVar, lmkVar, rwcVarJ, jizVar);
        lmkVar.b = lmhVar;
        this.c = lmhVar;
        lmhVar.f.d = SystemClock.elapsedRealtimeNanos();
        synchronized (lmhVar.c) {
            rnt.L(lmhVar.d == 1);
            lmhVar.a.set(1);
            lmhVar.d = 2;
            szhVar = lmhVar.b;
        }
        ske.W(szhVar, new iiz(lmhVar, (Object) r11, 9), sxo.a);
        mdm mdmVarO = r11.o();
        mdmVarO.getClass();
        ((mdo) mdmVarO).b = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.kle
    public final void a(poj pojVar, syu syuVar) {
        this.d++;
        lss lssVar = this.b;
        this.e = pao.b(lssVar.e());
        lmf lmfVar = new lmf(pojVar);
        lmfVar.d = syuVar;
        pao paoVar = this.e;
        if (paoVar == null) {
            paoVar = pao.CLOCKWISE_0;
        }
        lmfVar.c = paoVar;
        lmfVar.e = this.a.e;
        this.c.b(lmfVar.a(), lssVar);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
        if (this.d == 0) {
            this.b.b(new hht("LuckyShotReprocessingImageSaver closed without processing any Images."));
        }
    }
}
