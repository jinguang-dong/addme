package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbq implements kfg {
    private static final AtomicInteger f = new AtomicInteger(0);
    public final our a;
    public final our b;
    public final pbc c;
    public final ovq d;
    public syu e;
    private final Executor g;
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final kli i;
    private final fbl j;
    private final hfs k;
    private final fql l;
    private final lbc m;
    private final pfu n;
    private final uh o;
    private final mwq p;

    public lbq(our ourVar, our ourVar2, pfu pfuVar, pbc pbcVar, knd kndVar, out outVar, owf owfVar, kfw kfwVar, owf owfVar2, owf owfVar3, syu syuVar, Executor executor, kli kliVar, ovq ovqVar, fbl fblVar, kow kowVar, hfs hfsVar, owf owfVar4, fql fqlVar, lbc lbcVar) {
        this.a = ourVar;
        this.b = ourVar2;
        this.n = pfuVar;
        this.c = pbcVar.a("PckOneCamera-" + f.getAndIncrement());
        this.p = new mwq(kndVar, outVar);
        this.g = executor;
        this.i = kliVar;
        this.d = ovqVar;
        this.j = fblVar;
        this.k = hfsVar;
        this.l = fqlVar;
        this.m = lbcVar;
        this.o = new uh(kndVar, owfVar, kfwVar.a, owfVar2, owfVar3, syuVar, kowVar, owfVar4);
    }

    @Override // defpackage.fbl
    public final fda a(ejt ejtVar) {
        return this.j.a(ejtVar);
    }

    @Override // defpackage.kfg
    public final paq c(pdh pdhVar) {
        return this.k.c(pdhVar);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.h.compareAndSet(false, true)) {
            this.n.close();
            this.g.execute(new kxw(this, 2));
        }
    }

    @Override // defpackage.kfg
    public final syu d() {
        pbc pbcVar = this.c;
        pfu pfuVar = this.n;
        pbcVar.b(mn.i(pfuVar, "Start. Resuming ", "."));
        pfuVar.k();
        syu syuVarN = ske.N(this.i.a());
        this.a.d(this.l.a(this.m));
        try {
            synchronized (this) {
                hcs.a(this.c, syuVarN, "OneCamera started.", "OneCamera failed to start!");
                this.e = syuVarN;
            }
            this.k.c(new lbp(this));
            return syuVarN;
        } catch (Throwable th) {
            this.k.c(new lbp(this));
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, lss] */
    @Override // defpackage.kfg
    public final syu e(kfl kflVar, lss lssVar) {
        mwq mwqVar = this.p;
        out outVar = (out) mwqVar.b;
        gga ggaVar = new gga(kflVar, lssVar, new kmh(kflVar, outVar, lssVar), new kmn(lssVar, outVar));
        knd kndVar = (knd) mwqVar.a;
        khb khbVar = kndVar.a;
        if (khbVar.a()) {
            kndVar.c.d("Take picture was invoked, but the executor is shutting down!");
            ggaVar.a.f();
            ggaVar.b.b(new pco("Invoked when executor shutting down."));
            return ske.K();
        }
        pbn pbnVar = kndVar.h;
        pbnVar.f("CriticalPath#BlockedShutter#PictureTakerImpl#takePicture");
        szh szhVar = new szh();
        kndVar.e.a(Boolean.valueOf(kndVar.f.incrementAndGet() > 0));
        kndVar.d.a();
        knb knbVar = new knb(kndVar, szhVar);
        pbnVar.g();
        khbVar.b(new knc(kndVar, knbVar, ggaVar, kndVar.g, pbnVar));
        return szhVar;
    }

    @Override // defpackage.kfg
    public final boolean f() {
        return this.h.get();
    }

    @Override // defpackage.kfg
    public final our g() {
        return this.a;
    }

    @Override // defpackage.kfg
    public final pfu h() {
        return this.n;
    }

    @Override // defpackage.kfg
    public final uh i() {
        return this.o;
    }
}
