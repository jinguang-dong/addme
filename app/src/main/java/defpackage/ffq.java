package defpackage;

import android.content.res.Resources;
import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;
import com.google.ar.core.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffq implements feu {
    public boolean a;
    public final ffr b;
    private long c = 0;
    private ScheduledFuture d;
    private ScheduledExecutorService e;
    private pka f;
    private final Resources g;
    private final fek h;
    private final owf i;
    private final owf j;
    private fex k;
    private fey l;
    private final mdy m;
    private final mwq n;

    public ffq(mwq mwqVar, ffr ffrVar, Resources resources, mdy mdyVar, owf owfVar, owf owfVar2) {
        this.n = mwqVar;
        this.b = ffrVar;
        this.g = resources;
        this.m = mdyVar;
        fek fekVar = new fek();
        this.h = fekVar;
        this.i = owfVar;
        this.j = owfVar2;
        this.k = fekVar;
    }

    private final synchronized ScheduledFuture h(long j) {
        if (this.e == null) {
            this.e = ojl.cc("scn-dist");
        }
        return this.e.schedule(new fem(this, 4), j, TimeUnit.MILLISECONDS);
    }

    private final boolean i() {
        fex fexVar = this.k;
        if (fexVar != null) {
            return fexVar.c() == 1 || fexVar.c() == 2;
        }
        return false;
    }

    @Override // defpackage.feu
    public final void a(poe poeVar) throws Resources.NotFoundException {
        pka pkaVar = this.f;
        if ((pkaVar == null || pkaVar != pka.FRONT) && this.b.c()) {
            if (this.a && (!((mhh) this.j.dL()).equals(mhh.OFF) || !((mhg) this.i.dL()).equals(mhg.INACTIVE))) {
                c();
                return;
            }
            if (((Boolean) ((ovx) this.n.a).d).booleanValue()) {
                c();
                return;
            }
            Integer num = (Integer) poeVar.a(CaptureResult.CONTROL_AF_MODE);
            if (num != null) {
                if (num.intValue() == 0) {
                    c();
                    return;
                }
                Boolean bool = (Boolean) poeVar.a(nvj.a);
                if (bool != null) {
                    if (!bool.booleanValue()) {
                        long jUptimeMillis = SystemClock.uptimeMillis() - this.c;
                        if (jUptimeMillis < 2000) {
                            this.d = h(2000 - jUptimeMillis);
                            return;
                        } else {
                            g();
                            return;
                        }
                    }
                    TimeUnit.SECONDS.getClass();
                    if (i()) {
                        ScheduledFuture scheduledFuture = this.d;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                            return;
                        }
                        return;
                    }
                    fey feyVar = this.l;
                    if (feyVar != null) {
                        String string = this.g.getString(R.string.advice_scene_distance_message);
                        fex fexVarA = feyVar.a(feh.a(string, string, feh.a, true, 0));
                        this.k = fexVarA;
                        if (fexVarA == null || fexVarA.c() == 4) {
                            return;
                        }
                        this.c = SystemClock.uptimeMillis();
                        mdy mdyVar = this.m;
                        tpc tpcVarM = sod.a.m();
                        soc socVar = soc.ADVICE_SHOWN;
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        sod sodVar = (sod) tpcVarM.b;
                        sodVar.f = socVar.aJ;
                        sodVar.b |= 1;
                        tpc tpcVarM2 = snk.a.m();
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        snk snkVar = (snk) tpcVarM2.b;
                        snkVar.c = 2;
                        snkVar.b |= 1;
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        sod sodVar2 = (sod) tpcVarM.b;
                        snk snkVar2 = (snk) tpcVarM2.l();
                        snkVar2.getClass();
                        sodVar2.E = snkVar2;
                        sodVar2.c |= 8;
                        mdyVar.I(tpcVarM);
                    }
                }
            }
        }
    }

    @Override // defpackage.fev
    public final fes b() {
        return this.b;
    }

    @Override // defpackage.fev
    public final synchronized void c() {
        g();
        ScheduledExecutorService scheduledExecutorService = this.e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.e = null;
        }
        this.d = null;
    }

    @Override // defpackage.fev
    public final void e(pjo pjoVar) {
        this.f = pjoVar.l();
        g();
    }

    @Override // defpackage.fev
    public final void f(fey feyVar) {
        this.l = feyVar;
        if (feyVar == null) {
            this.k = this.h;
        }
    }

    public final void g() {
        fex fexVar = this.k;
        if (fexVar != null && i()) {
            fexVar.a();
        }
    }

    @Override // defpackage.fev
    public final void d(pjr pjrVar) {
    }
}
