package defpackage;

import com.google.android.build.data.JKx.wzgaYJqO;
import j$.time.Duration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jmv implements mho {
    public static final /* synthetic */ int d = 0;
    private static final sgv e = sgv.g("jmv");
    private static final Duration f = Duration.ofMillis(500);
    public final mhq a;
    public final our b = new our();
    public final AtomicBoolean c;
    private final Executor g;
    private final pbn h;
    private final mht i;
    private final owq j;
    private final pjo k;
    private final pfu l;
    private final kgw m;
    private final hbj n;
    private final mwq o;

    public jmv(Executor executor, pfu pfuVar, kgw kgwVar, mhq mhqVar, mhp mhpVar, owq owqVar, pjo pjoVar, mwq mwqVar, AtomicBoolean atomicBoolean, pbn pbnVar, hbj hbjVar) {
        this.g = executor;
        this.l = pfuVar;
        this.m = kgwVar;
        this.h = pbnVar;
        this.a = mhqVar;
        this.j = owqVar;
        this.k = pjoVar;
        this.o = mwqVar;
        this.c = atomicBoolean;
        this.n = hbjVar;
        mhs mhsVar = new mhs();
        mhsVar.c(executor);
        mhsVar.d("LongShotTorch");
        mhsVar.g(mhpVar);
        mhsVar.e(new jmr(owqVar, 2));
        mhsVar.f(new jmr(owqVar, 3));
        this.i = mhsVar.a();
    }

    @Override // defpackage.mho
    public final void d(mhp mhpVar) {
        this.i.d(mhpVar);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [sgt, shi] */
    final ree a(lss lssVar, boolean z) {
        if (lssVar.m() == ltf.LONG_SHOT && z && !((Boolean) this.j.dL()).booleanValue()) {
            kgw kgwVar = this.m;
            pka pkaVarL = kgwVar.l();
            pka pkaVar = pka.BACK;
            if (pkaVarL == pkaVar) {
                this.h.f("LongShotTorchController#turnOnTorch");
                int i = 17;
                try {
                    if (mwq.z() && this.n.p(hae.j) && kgwVar.l().equals(pkaVar)) {
                        this.l.l(new pej(nvl.d, false));
                    }
                    pfz pfzVarU = this.l.u();
                    rwc rwcVarJ = rvk.a;
                    try {
                        pdi pdiVarA = pfzVarU.a();
                        ((phd) pdiVarA).c = 1;
                        ((phd) pdiVarA).e = 2;
                        long j = ((pdo) ((swn) pfzVarU.b(((phd) pdiVarA).c())).s()).b;
                        this.c.set(true);
                        if (j != -1) {
                            rwcVarJ = rwc.j(Long.valueOf(j + f.toNanos()));
                        } else {
                            ((sgt) e.c().M(2847)).s("Invalid converged 3A timestamp for Long Shot.");
                        }
                    } catch (InterruptedException | CancellationException | ExecutionException | pco e2) {
                        ((sgt) ((sgt) e.b().i(e2)).M((char) 2848)).s(wzgaYJqO.AOmNelJDrfp);
                    }
                    this.h.g();
                    return new ree(rwcVarJ, new hty(pfzVarU, this.j.dK(new glc(this, pfzVarU, i), this.g), 14, null), this.l, this.o, this.k, this.c, this.n);
                } catch (InterruptedException | pco unused) {
                    return new ree(rvk.a, new fhf(17), this.l, this.o, this.k, this.c, this.n);
                }
            }
        }
        return new ree(rvk.a, new fhf(16), this.l, this.o, this.k, this.c, this.n);
    }
}
